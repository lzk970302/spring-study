package com.zk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("test")
	public String testDemo() {
		System.out.println("test...");
		return "test";
	}
}
