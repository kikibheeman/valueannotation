package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class valueannotataion {
	@Value("${mess}")
	private String msg;


@RequestMapping("/valueanno")
public String h1()
{
	return "hey "+msg;
}
}

