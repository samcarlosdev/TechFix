package br.com.senac.techfix.data;

import br.com.senac.techfix.connection.JPAUtil;
import br.com.senac.techfix.model.Usuario;
import java.util.List;
import javax.persistence.EntityManager;

public class UsuarioJPA {
    public void cadastrar(Usuario u) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    public List<Usuario> listar() 
    {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList(); 
        } finally {
            em.close();
        }
    }
    
    public Usuario validarLogin(String login, String senha) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery("SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha", Usuario.class)
                     .setParameter("login", login)
                     .setParameter("senha", senha)
                     .getSingleResult();
        } catch (Exception e) {
            return null;
        } finally {
            em.close();
        }
    }
    
    public boolean loginJaExiste(String login) 
    {
        EntityManager em = JPAUtil.getEntityManager();
        
        try {
            Long count = em.createQuery("SELECT COUNT(u) FROM Usuario u WHERE u.login = :login", Long.class)
                           .setParameter("login", login)
                           .getSingleResult();
            return count > 0;
        } finally {
            em.close();
        }
    }
    
}
