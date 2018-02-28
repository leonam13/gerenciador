package br.com.alura.gerenciador.web;

import java.util.Collection;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

@WebServlet(urlPatterns = "/BuscaEmpresa")
public class BuscaEmpresa implements Tarefa {
	public BuscaEmpresa() {
		System.out.println("Instanciando o Servlet" + this);
	}

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		String filtro = req.getParameter("filtro");
		Collection<Empresa> buscaPorSimilaridade = new EmpresaDAO().buscaPorSimilaridade(filtro);
		req.setAttribute("empresas", buscaPorSimilaridade);
		return "WEB-INF/paginas/buscaEmpresa.jsp";
	}

}
