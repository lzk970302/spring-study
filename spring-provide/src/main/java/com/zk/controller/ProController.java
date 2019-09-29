package com.zk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProController {
	@RequestMapping("hi")
	public String sayHi(String name) {
		return "hi: "+name ;
	}

}
