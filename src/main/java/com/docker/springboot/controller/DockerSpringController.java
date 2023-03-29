package com.docker.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerSpringController {

	@GetMapping("/index")
	public String getIndexPage() {
	    return "Docker Spring boot project";
	}
}
