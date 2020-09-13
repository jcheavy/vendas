package testes;

import dao.MarcaDAO;
import dao.ProdutoDAO;
import entities.Categoria;
import entities.Marca;
import entities.Produto;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Marca marca = new Marca(10, null);
		Categoria cat = new Categoria(3, null);
		Produto prod = new Produto(null,"Mouse" , 15, 15.00, "00003", marca, cat);
		marca.getProdutos().add(prod);
		cat.getProdutos().add(prod);
		
		ProdutoDAO dao = new ProdutoDAO();
		MarcaDAO mdao = new MarcaDAO();
		//mdao.save(marca);
		// dao.save(prod);
		dao.remove(4);
		
		
		
		for(Produto p : dao.findAll()){
			System.out.println("Id :"+p.getId()+"| Nome :"+p.getNome()+" | Marca :"+ p.getMarca().getId());
			System.out.println("-------------------------------");
		}
	}

}
