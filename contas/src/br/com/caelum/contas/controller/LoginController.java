package br.com.caelum.contas.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.contas.modelo.Usuario;
import br.com.caelum.contas.dao.UsuarioDAO;

@Controller
public class LoginController {
	
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "usuario/formulario-login";
	}
	
	@RequestMapping("/efetuaLogin")
	public String efetuaLogin(Usuario usuario, HttpSession session) {
		if (new UsuarioDAO().existeUsuario(usuario)) {
			session.setAttribute("usuarioLogado", usuario);
			return "usuario/menu";
		}
		
		return "usuario/formulario-login";
	}

}
