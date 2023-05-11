package com.docker.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Represents an DockerSpringController.
 * @author Rachit Jha
*/

@RestController
public class DockerSpringController {
	
	/** Gets the index page with String messge.
	 * @return A string message
	*/

	@GetMapping("/index")
	public String getIndexPage() {
	    return "Spring boot project on azure container";
	}
}
