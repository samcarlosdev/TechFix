package br.com.senac.techfix.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    private static final EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("TechFix-PU");

    public static EntityManager getEntityManager() {
        return fabrica.createEntityManager();
    }
}
