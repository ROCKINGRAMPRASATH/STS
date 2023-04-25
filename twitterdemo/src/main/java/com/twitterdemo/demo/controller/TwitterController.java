package com.twitterdemo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.twitterdemo.demo.model.TwitterModel;
import com.twitterdemo.demo.repository.TwitterRepository;

@RestController
public class TwitterController
{
	@Autowired
	TwitterRepository tr;
	@GetMapping("/url")
	public List<TwitterModel> getAllDetails()
	{
		return tr.findAll();
	}
	@PostMapping("/save")
	public TwitterModel getDetailsById(@RequestBody TwitterModel id)
	{
		return tr.save(id);
	}
	@PutMapping("/save/{id}")
	public TwitterModel getDetailsById1(@RequestBody TwitterModel id)
	{
		return tr.save(id);
	}
	@DeleteMapping("/url/{id}")
	public String getDetailsById2(@PathVariable int id)
	{
		tr.deleteById(id);
		return "Details Deleted";
	}
}
