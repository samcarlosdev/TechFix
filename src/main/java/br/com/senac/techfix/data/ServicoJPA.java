package br.com.senac.techfix.data;

import br.com.senac.techfix.connection.JPAUtil;
import br.com.senac.techfix.model.Servico;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ServicoJPA {
    public void cadastrar(Servico s) {
        EntityManager em = JPAUtil.getEntityManager();
        
        try 
        {
            em.getTransaction().begin();
            em.persist(s);
            em.getTransaction().commit();
        } 
        catch (Exception e) 
        {
            em.getTransaction().rollback();
            throw e;
        } 
        finally 
        {
            em.close();
        }
    }

    public List<Servico> listar(String filtro, boolean isCliente) {
        EntityManager em = JPAUtil.getEntityManager();
        try 
        {
            String jpql = "SELECT s FROM Servico s";
            
            if (filtro != null && !filtro.trim().isEmpty()) 
            {
                if (isCliente) 
                {
                    jpql += " WHERE UPPER(s.cliente.nome) LIKE UPPER(:filtro)";
                } 
                else 
                {
                    jpql += " WHERE UPPER(s.tipoServico) LIKE UPPER(:filtro)";
                }
            }

            TypedQuery<Servico> query = em.createQuery(jpql, Servico.class);

            if (filtro != null && !filtro.trim().isEmpty()) 
            {
                query.setParameter("filtro", "%" + filtro + "%");
            }
            
            return query.getResultList();
        } 
        finally 
        {
            em.close();
        }
    }
    
    public void atualizar(Servico s) 
    {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(s);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }
    
    public void remover(int id) 
    {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            Servico s = em.find(Servico.class, id);
            if (s != null) {
                em.remove(s);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }
    
    public Servico buscarPorId(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Servico.class, id);
        } finally {
            em.close();
        }
    }
}
