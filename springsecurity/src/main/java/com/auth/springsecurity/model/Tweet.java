package com.auth.springsecurity.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.sql.Insert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_tweets")
public class Tweet {
   
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name= "tweet_id")
	private Long tweetId;
	
	private User user;
	
	private String content;
	
	@CreationTimestamp
	private Insert creationTimeStamp;

	public Long getTweetId() {
		return tweetId;
	}

	public void setTweetId(Long tweetId) {
		this.tweetId = tweetId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Insert getCreationTimeStamp() {
		return creationTimeStamp;
	}

	public void setCreationTimeStamp(Insert creationTimeStamp) {
		this.creationTimeStamp = creationTimeStamp;
	}
	
	
}
