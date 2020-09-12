package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

import entities.Categoria;
import services.ConectionFactory;

public class CategoriaDAO {
	
	
	public Categoria save(Categoria categoria) {		
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(categoria);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error " + e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}		
		return categoria;
	}
	
	public Categoria update(Categoria categoria) {	
		
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		
		try {
			em.getTransaction().begin();
			
			if(categoria.getId() == null) {
			em.persist(categoria);
			}else {
				em.merge(categoria);
			}
			em.getTransaction().commit();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error " + e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}		
		return categoria;
	}
	
	public Categoria findById(Integer id) {
		
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		Categoria categoria = null;
		try {
			categoria = em.find(Categoria.class, id);
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error " + e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		
		return categoria;
	}
	
	public List<Categoria> findAll(){
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		List<Categoria> categorias = null;
		try {
			 categorias = em.createQuery("FROM Categoria cat").getResultList();					
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "errom r " + e);
				em.getTransaction().rollback();
			}finally {
				em.close();
			}
		return categorias;
	}
	
	public Categoria remove(Integer id) {
		
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		Categoria categoria = null;
		try {
		    categoria = em.find(Categoria.class, id);		
		    em.getTransaction().begin();
		    em.remove(categoria);
		    em.getTransaction().commit();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "errom r " + e);
			em.getTransaction().rollback();
		}
		finally {
			em.close();
		}
		return categoria;
	}

}
