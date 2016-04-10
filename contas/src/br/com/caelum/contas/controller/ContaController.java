package br.com.caelum.contas.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.contas.dao.ContaDAO;
import br.com.caelum.contas.modelo.Conta;

@Controller
public class ContaController {
	
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
	
//	@RequestMapping("/listaContas")
//	public ModelAndView lista() {
//		ContaDAO dao = new ContaDAO();
//		List<Conta> contas = dao.lista();
//		
//		ModelAndView mv = new ModelAndView("conta/lista");
//		mv.addObject("todasContas", contas);
//		
//		return mv;
//	}
	
	
	@RequestMapping("/listaContas")
	  public String lista(Model mv){
	      ContaDAO dao = new ContaDAO();
	      List<Conta> contas = dao.lista();        
	      mv.addAttribute("todasContas", contas); 
	      
	      return "conta/lista";
	  }

	@RequestMapping("/removeConta")
	public String remove(Conta conta) {
		ContaDAO dao = new ContaDAO();
		dao.remove(conta);
		
		return "forward:listaContas";
	}

}
