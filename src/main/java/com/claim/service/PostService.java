package com.claim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.claim.entity.Post;

import com.claim.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;

	@Transactional
	public List<Post> findMyPost(String email){

		String[] emails = {email};
		return postRepository.findPost(emails);
	}
	@Transactional
	public List<Post> savePost(Post post){
		postRepository.save(post);
		return findMyPost(post.getEmail());
	}

}

