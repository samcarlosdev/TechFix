package br.com.senac.techfix.data;

import br.com.senac.techfix.connection.JPAUtil;
import br.com.senac.techfix.model.Cliente;
import br.com.senac.techfix.model.Servico;
import java.util.List;
import javax.persistence.EntityManager;

public class ClienteJPA {
    public void cadastrar(Cliente c) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    public List<Cliente> listar() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
        } finally {
            em.close();
        }
    }
    
    public boolean cpfJaExiste(String cpf) 
    {
        if (cpf == null || cpf.trim().equals("...-") || cpf.trim().isEmpty()) {
            return false;
        }
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Long count = em.createQuery("SELECT COUNT(c) FROM Cliente c WHERE c.cpf = :cpf", Long.class)
                           .setParameter("cpf", cpf)
                           .getSingleResult();
            return count > 0;
        } finally {
            em.close();
        }
    }
    
    public void editar(Cliente c) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }
}
