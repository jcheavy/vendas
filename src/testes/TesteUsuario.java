package testes;

import dao.EnderecoDAO;
import dao.UsuarioDAO;
import entities.Endereco;
import entities.Usuario;

public class TesteUsuario {

	public static void main(String[] args) {
		
		//Endereco end = new Endereco(null, "Travessa 1", "Centro", "45700-119", "Salvador", "BA");
		//Usuario user = new Usuario(null, "Raul Seixas", "raul", PerfilEnum.ADMIN, end );
		//user.setEndereco(end);
		
		UsuarioDAO userdao = new UsuarioDAO();
		EnderecoDAO endao = new EnderecoDAO();
		
		//endao.save(end);
		//userdao.save(user);		
		
		for(Usuario user1 : userdao.findAll()) {
			System.out.println("ID :"+user1.getId()+"|Nome: "+user1.getNome()+"|Tipo : "+ user1.getPerfil());
			System.out.println("--------------------------------------------------------------------");
		}
		System.out.println("=================================");
		
		for(Endereco e : endao.findAll()) {
			System.out.println("Id :"+e.getId()+"|Rua: "+e.getRua()+"|Bairro : "+e.getBairro()+"| Cep:"+e.getCep()
			+"| Cidade :"+e.getCidade()+"| Estado :"+e.getEstado());
			
			System.out.println("--------------------------------------------------------------------");
		}
		
	}

}
