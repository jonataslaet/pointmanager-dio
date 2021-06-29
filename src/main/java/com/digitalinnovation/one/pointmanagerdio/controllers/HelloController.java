package com.digitalinnovation.one.pointmanagerdio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class HelloController {

	@GetMapping("/hello")
	public String cumprimentoInicial() {
		return "Hello";
	}
}
