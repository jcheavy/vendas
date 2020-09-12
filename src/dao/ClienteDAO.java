package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

import entities.Cliente;
import services.ConectionFactory;

public class ClienteDAO {
	
	public Cliente save(Cliente cliente) {			
		EntityManager em = ConectionFactory.getConnection().createEntityManager();		
		try {
			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error " + e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}		
		return cliente;
	}
	
	public Cliente update(Cliente cliente) {
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		
        try {
        	em.getTransaction().begin();
        	if(cliente.getId() == null) {
        		em.persist(cliente);
        	}else {
        		em.merge(cliente);
        	}
        	em.getTransaction().commit();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error " + e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
        return cliente;
	}
	
	public Cliente fidById(Integer id) {
		
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		Cliente cliente = null;
		try {
			 cliente = em.find(Cliente.class, id);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error " + e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return cliente;
	}
	
	public List<Cliente> findAll(){
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		List<Cliente> clientes = new ArrayList<Cliente>();
		try {
			 clientes = em.createQuery("From Cliente cli").getResultList();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error " + e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return clientes;
	}
	
	public Cliente remove(Integer id) {		
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		Cliente cliente = null;
		try {
			cliente = em.find(Cliente.class, id);
			em.getTransaction().begin();
			em.remove(cliente);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error " + e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return cliente;
	}

}
