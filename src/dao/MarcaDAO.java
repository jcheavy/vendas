package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

import entities.Marca;
import services.ConectionFactory;

public class MarcaDAO {
	
	
	public Marca save(Marca marca) {		
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(marca);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error " + e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}		
		return marca;
	}
	
	public Marca update(Marca marca) {	
		
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		
		try {
			em.getTransaction().begin();
			
			if(marca.getId() == null) {
			em.persist(marca);
			}else {
				em.merge(marca);
			}
			em.getTransaction().commit();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error " + e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}		
		return marca;
	}
	
	public Marca findById(Integer id) {
		
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		Marca marca = null;
		try {
			marca = em.find(Marca.class, id);
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error " + e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		
		return marca;
	}
	
	public List<Marca> findAll(){
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		List<Marca> marcas = null;
		try {
			 marcas = em.createQuery("FROM Marca marca").getResultList();					
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "errom r " + e);
				em.getTransaction().rollback();
			}finally {
				em.close();
			}
		return marcas;
	}
	
	public Marca remove(Integer id) {
		
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		Marca marca = null;
		try {
		    marca = em.find(Marca.class, id);		
		    em.getTransaction().begin();
		    em.remove(marca);
		    em.getTransaction().commit();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "errom r " + e);
			em.getTransaction().rollback();
		}
		finally {
			em.close();
		}
		return marca;
	}

}
