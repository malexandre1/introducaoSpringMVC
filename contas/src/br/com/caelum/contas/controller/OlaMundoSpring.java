package br.com.caelum.contas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoSpring {
	
	@RequestMapping("/olaMundoSpring")
	public String execute() {
		System.out.println("Executando minha primeira lógica!");
		return "ok";
	}
	
	
}
