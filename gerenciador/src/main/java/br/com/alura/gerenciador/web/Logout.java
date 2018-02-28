package br.com.alura.gerenciador.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/Logout")
public class Logout implements Tarefa {
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		HttpSession session = req.getSession();
		session.removeAttribute("usuarioLogado");
		return "/WEB-INF/paginas/logout.html";
	}

	/*
	 * Cookie usuarioLogado = new Cookies(req.getCookies()).getUsuarioLogado(); if
	 * (usuarioLogado != null) { usuarioLogado.setMaxAge(0);
	 * resp.addCookie(usuarioLogado); }
	 */
	// resp.sendRedirect("logout.html");
	// Redirecionamento Cliente
}
