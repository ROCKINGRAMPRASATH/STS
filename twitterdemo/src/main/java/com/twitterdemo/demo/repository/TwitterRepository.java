package com.twitterdemo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twitterdemo.demo.model.TwitterModel;

@Repository
public interface TwitterRepository extends JpaRepository<TwitterModel,Integer>
{
	
}
