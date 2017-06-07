package mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/imc/mvc")

public class Controller extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String altura = request.getParameter("altura");
		String peso = request.getParameter("peso");
		String sexo = request.getParameter("sexo");

		if (altura == "" || peso == "" || sexo == "")
			request.setAttribute("resultado", "Algum campo não foi preenchido.");
		else {
			altura = altura == null ? "0" : altura;
			float alturaF = Float.valueOf(altura);

			peso = peso == null ? "0" : peso;
			float pesoF = Float.valueOf(peso);

			float imc = pesoF / (alturaF * alturaF);

			Model model = new Model(imc, sexo);
			String resultado = model.resultado();

			request.setAttribute("resultado", resultado);
		}
		request.getRequestDispatcher("../index.jsp").forward(request, response);

	}
}
