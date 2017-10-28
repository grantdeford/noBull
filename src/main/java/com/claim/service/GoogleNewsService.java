package com.claim.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.claim.model.GoogleNews;

@Service
public class GoogleNewsService {
	
	
	public GoogleNews fetchGoogleNews() {
		
		RestTemplate restTemplate = new RestTemplate();
		String uri = "https://newsapi.org/v1/articles?source=google-news&sortBy=top&apiKey=20be256e6a784467914e750b1ad69685"; 
		GoogleNews result = restTemplate.getForObject(uri, GoogleNews.class);
		return result;
	}

	
	
	
}
