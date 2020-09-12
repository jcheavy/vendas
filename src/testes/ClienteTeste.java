package testes;

import dao.ClienteDAO;
import dao.EnderecoDAO;
import entities.Cliente;
import entities.Endereco;
import entities.enums.TipoCliente;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
     Endereco end = new Endereco(null, "Brasil", "Novo", "87232-211", "Brasilia", "DF");	
     Cliente cli = new Cliente(null, "Info Lab", "03.922.904/0001-62", "infolab@email.com", TipoCliente.PESSOA_JURIDICA, end);
     EnderecoDAO endao = new EnderecoDAO();
     ClienteDAO clidao = new ClienteDAO();
     
     end.getClientes().add(cli);
     endao.save(end);
     clidao.save(cli);     
     
	}

}
