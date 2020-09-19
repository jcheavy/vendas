package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

import entities.Usuario;
import services.ConectionFactory;

public class UsuarioDAO {

	public Usuario save(Usuario usuario) {
		EntityManager em = ConectionFactory.getConnection().createEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(usuario);
			em.getTransaction().commit();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro " + e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return usuario;
	}
	
	public Usuario update(Usuario usuario) {
		EntityManager em = ConectionFactory.getConnection().createEntityManager();

		try {
			em.getTransaction().begin();
			if (usuario.getId() == null) {
				em.persist(usuario);
			}else {
				em.merge(usuario);
			}			
			em.getTransaction().commit();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro " + e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return usuario;
	}
	
	public Usuario findById(Integer id) {
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		Usuario usuario = null;
		try {
				usuario = em.find(Usuario.class, id);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro " + e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
	 return usuario;
	}
	
	public List<Usuario> findAll(){
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			  usuarios = em.createQuery("FROM Usuario usuario").getResultList();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro "+e);
			em.getTransaction().rollback();
		}
	  return usuarios;
	}
	
	public Usuario remove(Integer id) {
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		Usuario usuario = null;
		try {
			 usuario = em.find(Usuario.class, id);
			 em.getTransaction().begin();
			 em.remove(usuario);
			 em.getTransaction().commit();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro "+e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		
		return usuario;
	}

}
