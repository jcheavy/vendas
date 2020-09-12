package dao;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

import entities.Endereco;
import services.ConectionFactory;

public class EnderecoDAO {

	public Endereco save(Endereco endereco) {
		
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(endereco);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro"+e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
	 return endereco;
	}
	
}
