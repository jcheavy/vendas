package testes;

import dao.MarcaDAO;
import entities.Marca;

public class MarcaTeste {

	public static void main(String[] args) {
	/*
		Marca m1 = new Marca(null, "Creative");
		Marca m2 = new Marca(null, "Semp Toshiba");
		Marca m3 = new Marca(null, "AOC");
		Marca m4 = new Marca(null, "NVidea");
		Marca m5 = new Marca(null, "Radeon");
		Marca m6 = new Marca(null, "Realtech");
		Marca m7 = new Marca(null, "Proview");
		Marca m8 = new Marca(8, "Hewlett packarge");
		Marca m9 = new Marca(null, "Glock");
		*/
		MarcaDAO dao = new MarcaDAO();
	
		//dao.update(m8);
	   // dao.remove(9);
		
		for(Marca m : dao.findAll()){
			System.out.println("Id :"+m.getId()+"| Nome :"+m.getNome());
			System.out.println("-------------------------------");
		}

	}

}
