package com.claim.model;




public class GoogleNews {
	private String status;
	private String source;
	private String sortBy;
	private Article[] articles;
 
	public GoogleNews( ) {
	}

	public String getStatus() {
		return status;
	}

	public String getSource() {
		return source;
	}

	public String getSortBy() {
		return sortBy;
	}

	public Article[] getArticles() {
		return articles;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public void setArticles(Article[] articles) {
		this.articles = articles;
	}
	
}

