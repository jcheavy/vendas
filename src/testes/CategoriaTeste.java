package testes;

import dao.CategoriaDAO;
import entities.Categoria;

public class CategoriaTeste {

	public static void main(String[] args) {
		Categoria cat1 = new Categoria(null, "Monitor");
		Categoria cat2 = new Categoria(null, "Rede");
		Categoria cat3 = new Categoria(null, "Peças");
		//Marca m1 = new Marca(null, "Creative");
		//Produto p1 = new Produto(null, "Mouse", 40, 20.00, "0001", m1, cat1);
		
		CategoriaDAO catdao = new CategoriaDAO();
		//catdao.remove(6);
		catdao.save(cat1);
		catdao.save(cat2);
		catdao.save(cat3);
		//catdao.update(cat1);
		 //Categoria cat = catdao.findById(3);
		//System.out.println("Nome: "+cat.getNome());
		
		for(Categoria c : catdao.findAll()) {
			System.out.println("Id :"+ c.getId()+"- Nome :"+c.getNome());
			System.out.println("-------------------------------");
		}
		
		

	}

}
