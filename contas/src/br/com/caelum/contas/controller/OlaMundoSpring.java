package br.com.caelum.contas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.contas.dao.ContaDAO;
import br.com.caelum.contas.modelo.Conta;

@Controller
public class OlaMundoSpring {
	
	@RequestMapping("/olaMundoSpring")
	public String execute() {
		System.out.println("Executando minha primeira lógica!");
		return "ok";
	}
	
	@RequestMapping("/adicionaConta")
	public String adiciona(Conta conta) {
		ContaDAO dao = new ContaDAO();
		dao.adiciona(conta);
		
		return "conta/conta-adicionada";
	}
	
	@RequestMapping("/form")
	public String form() {
		return "conta/formulario";
	}

}
