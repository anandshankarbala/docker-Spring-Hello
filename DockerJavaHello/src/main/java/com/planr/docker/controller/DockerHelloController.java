package com.planr.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/docker/api")
public class DockerHelloController {

	@GetMapping("/hello")
	public Mono<String> sayHello() {
		return Mono.just("Hi Spring from docker");
	}
	
}
