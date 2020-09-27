package testes;

import dao.UsuarioDAO;

public class LoginTeste {

	public static void main(String[] args) {
		
		UsuarioDAO dao = new UsuarioDAO();
		dao.login("Jessyca Brito", "jessyca");
		

	}

}
