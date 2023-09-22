package vn.edu.iuh.fit.db;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Connection {
    private final EntityManager em;

    private static Connection connection;

    private Connection(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NguyenVanLong-week01-20002975");
        em = emf.createEntityManager();
    }
    public EntityManager entityManager(){
        return em;
    }
    public static Connection getInstance(){
        if (connection == null)
            connection = new Connection();
        return connection;
    }
}
