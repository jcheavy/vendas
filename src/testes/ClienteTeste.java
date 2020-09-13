package testes;

import dao.ClienteDAO;
import dao.EnderecoDAO;
import entities.Cliente;
import entities.Endereco;
import entities.enums.TipoCliente;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
     Endereco end = new Endereco(null, "Italia", "Brasil", "87788-999", "Cachoreira do Itapemirim", "ES");	
     Cliente cli = new Cliente(null, "Roberto Carlos", "000.111.222-34", "rc@email.com", TipoCliente.PESSOA_FISICA, end);
     EnderecoDAO endao = new EnderecoDAO();
     ClienteDAO clidao = new ClienteDAO();
     
     end.getClientes().add(cli);
   
     //clidao.save(cli);    
  
     
     for(Cliente c : clidao.findAll()) {
    	 System.out.println("Id :"+c.getId()+" | Nome :"+c.getNome()+" | Cpf/CNPJ :"+c.getCpfCnpj()+" | Email :"+c.getEmail()+" | Tipo :"+c.getTipo());
         System.out.println("------------------------------------------------------------------------------------------------------------------");
     }
     System.out.println("------------------------------------------------------------------------------------------------------------------");
     
     for(Endereco e : endao.findAll() ) {    	 
    	 System.out.println("Id :"+e.getId()+"| Rua :"+e.getRua()+"| Bairro :"+e.getBairro()+"| CEP :"+e.getCep()+"| Cidade :"+e.getCidade()+"| Estado :"
    			 +e.getEstado());
    	 System.out.println("------------------------------------------------------------------------------------------------------------------");
     }
	}

}
