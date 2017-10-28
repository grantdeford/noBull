package com.claim.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Person;
import com.claim.entity.Post;
import com.claim.model.GoogleNews;
import com.claim.service.GoogleNewsService;
import com.claim.service.PersonService;
import com.claim.service.PostService;
import com.claim.service.SendMail;

@Controller
public class UserController {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private SendMail sendMail;
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private GoogleNewsService googleNewsService;
	
	
	@RequestMapping("/")//the root of your website is in the index page
	public String index() {
		return "index";//tell Spring to find and display the index page
	}
	
	@RequestMapping(value="/googleNewsAPI", method = RequestMethod.GET)
	public void fetchGoogleNews() {
		   GoogleNews news = this.googleNewsService.fetchGoogleNews();
		   
		   System.out.println(news);
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView login(Model model) {
		return new ModelAndView("login", "user", new Person());
		//When the server tries to view the login page
		//This servlet will handle the request and add a Spring Model Attribute
		//object to map the login form called"userLogin", which is a person object
		
		//public String login(){
		//return "login"; }
	}
	
	
	@RequestMapping(value="/login",   method   =   RequestMethod.POST) //The   Model   Attribute   will   map   to   the   html   model   attribute   in   step   19 
	public String handleLogin(Model model, @ModelAttribute("user") Person userLogin, HttpSession session) {
	
		Person p = this.personService.login2(userLogin.getEmail(),  userLogin.getPassword());
		if(p != null) {
			session.setAttribute("loggedInUser", p);
			this.addUserPost(model, p.getEmail());
			return "profile";
		}else {
			model.addAttribute("loginError", "username or password invalid");
			return "login";
		}
	}
	
	@RequestMapping(value="/post", method = RequestMethod.POST)
	public String post(Model model, @ModelAttribute("post") Post post) {
		List<Post> posts = postService.savePost(post);
		this.addUserPost(model,  post.getEmail());
		return "home";
	}
	
	@RequestMapping(value="/signup", method = RequestMethod.GET)
	public ModelAndView signup() {
	return new ModelAndView("signup", "user", new Person());
	}
	@RequestMapping(value="/signup", method = RequestMethod.POST)
	public ModelAndView signup(Model model, @ModelAttribute("user") Person newUser) {
		this.personService.signUp(newUser);
		this.sendMail.sendMail(newUser.getEmail(), "Good Vibes", "Welcome, Thank you for registering");
		return login(model);
	}
	
	@RequestMapping(value="/upload", method = RequestMethod.POST)
	public String upload(@RequestParam("file") MultipartFile file, HttpSession session, Model model) {
		Person p = (Person) session.getAttribute("loggedInUser");
		if(!file.isEmpty()) {
			try {
				String name = file.getOriginalFilename();
				String basePath = "/Users/grantdeford/ClaimAcademyDocs/FinalProject/socialNetwork/src/main/resources/static/img/";
				String path = basePath +p.getEmail()+"/" +name;
				String userPath ="/img/"+ p.getEmail()+"/" +name;
				
				File fileToUpload = new File(path);
				FileUtils.writeByteArrayToFile(fileToUpload, file.getBytes());
				
				p.setProfilePic(userPath);
				personService.signUp(p); //should have called saved need to rename to saved
			}catch(Exception e) {
				
			}
			
		}
		this.addUserPost(model, p.getEmail());
		return "home";
	}
	
	private void addUserPost(Model model, String email) {
		model.addAttribute("post", new Post());
		model.addAttribute("posts", postService.findMyPost(email));
	}
}
