package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

import entities.Endereco;
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
			JOptionPane.showMessageDialog(null, "Erro" + e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return endereco;
	}

	public Endereco update(Endereco endereco) {

		EntityManager em = ConectionFactory.getConnection().createEntityManager();

		try {
			em.getTransaction().begin();

			if (endereco.getId() == null) {
				em.persist(endereco);
			} else {
				em.merge(endereco);
			}
			em.getTransaction().commit();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error " + e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return endereco;
	}

	public Endereco findById(Integer id) {

		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		Endereco endereco = null;
		try {
			endereco = em.find(Endereco.class, id);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error " + e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}

		return endereco;
	}

	public List<Endereco> findAll() {
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		List<Endereco> enderecos = null;
		try {
			enderecos = em.createQuery("FROM Endereco cat").getResultList();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "errom r " + e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return enderecos;
	}

	public Endereco remove(Integer id) {

		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		Endereco endereco = null;
		try {
			endereco = em.find(Endereco.class, id);
			em.getTransaction().begin();
			em.remove(endereco);
			em.getTransaction().commit();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "errom r " + e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return endereco;
	}

}
