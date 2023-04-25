package com.facebook1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facebook1.model.fbm;
import com.facebook1.repository.fbr;

@RestController
public class FaceBookController
{
	@Autowired
	fbr obj;
	@GetMapping("/app")
	public List<fbm> getAllDetails()
	{
		return obj.findAll();
	}

}
