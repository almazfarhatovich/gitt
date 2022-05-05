package org.example.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import org.example.configurations.DatabaseConnection;
import org.example.models.Book;
import org.example.models.Vendor;

import java.util.List;

public class VendorRepository implements AutoCloseable {

    private final EntityManagerFactory entityManagerFactory = DatabaseConnection.createEntityManagerFactory();


    public void save(Vendor newVendor) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(newVendor);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public void update(Vendor newVendor) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(newVendor);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public List<Vendor> findAll() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Vendor> vendors = entityManager.createQuery("select v from Vendor v", Vendor.class).getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();
        return vendors;
    }

    public Vendor findById(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Vendor vendor = entityManager.createQuery("select v from Vendor v where v.id = ?1", Vendor.class).getSingleResult();
        entityManager.getTransaction().commit();

        entityManager.close();

        return vendor;
    }

    @Override
    public void close() throws Exception {
        entityManagerFactory.close();
    }
}
