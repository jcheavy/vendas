package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

import entities.Produto;
import services.ConectionFactory;

public class ProdutoDAO {

	public Produto save(Produto produto) {
		EntityManager em = ConectionFactory.getConnection().createEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(produto);
			em.getTransaction().commit();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error " + e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return produto;
	}

	public Produto update(Produto produto) {

		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		try {
			em.getTransaction().begin();
			if (produto.getId() == null) {
				em.persist(produto);
			} else {
				em.merge(produto);
			}
			em.getTransaction().commit();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Errro" + e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return produto;
	}

	public Produto findById(Integer id) {

		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		Produto produto = null;
		try {
			produto = em.find(Produto.class, id);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Errro" + e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return produto;
	}

	public List<Produto> findAll() {
		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		List<Produto> produtos = new ArrayList<Produto>();
		try {
			produtos = em.createQuery("FROM Produto prod").getResultList();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro " + e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return produtos;
	}

	public Produto remove(Integer id) {

		EntityManager em = ConectionFactory.getConnection().createEntityManager();
		Produto produto = null;
		try {
			produto = em.find(Produto.class, id);
			em.getTransaction().begin();
			em.remove(produto);
			em.getTransaction().commit();
			
		} catch (Exception e) {

		} finally {
			em.close();
		}
		return produto;
	}

}
