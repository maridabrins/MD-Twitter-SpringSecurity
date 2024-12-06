package com.auth.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.springsecurity.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet,Long>{
 
}
