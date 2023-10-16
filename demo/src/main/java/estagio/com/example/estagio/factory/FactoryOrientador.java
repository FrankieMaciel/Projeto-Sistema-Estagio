/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estagio.com.example.estagio.factory;

import estagio.com.example.estagio.entities.Aluno;
import estagio.com.example.estagio.entities.Empresa;
import estagio.com.example.estagio.entities.Estagio;
import estagio.com.example.estagio.entities.Orientador;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FactoryOrientador {

    public static void main(String[] args) {
        // Persistence.createEntityManagerFactory("my_persistence_unit");
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("my-jpa-unit");
        EntityManager manager = factory.createEntityManager();

        // ------------ | INSERÇÃO | ------------
        // manager.getTransaction().begin();
        // Orientador orientador = new Orientador();
        // orientador.setName("Orientador1");

        // manager.persist(orientador);
        // manager.getTransaction().commit();
        // manager.close();

        // ------------ | ATUALIZAÇÃO | ------------
        // manager.getTransaction().begin();
        // Orientador orientador = manager.find(Orientador.class, 2L);
        // orientador.setName("NovoOrientador");
        // manager.persist(orientador);
        // manager.getTransaction().commit();
        // manager.close();

        // ------------ | REMOÇÃO | ------------
        // manager.getTransaction().begin();
        // Orientador orientador = manager.find(Orientador.class, 1L);
        // manager.remove(orientador);
        // manager.getTransaction().commit();
        // manager.close();

        // ------------ | LISTAGEM | ------------
        // ------------ ORIENTADOR ------------
        // manager.getTransaction().begin();

        // Query query = manager.createQuery("FROM Orientador");
        // List<Orientador> orientadores = query.getResultList();

        // manager.getTransaction().commit();
        // manager.close();

        // for (Orientador o : orientadores) {
        // System.out.println("Nome: " + o.getName());
        // }

        // ------------ | FILTRAGEM | ------------
        // ------------ PESQUISAR EMPRESA POR ID ------------
        // manager.getTransaction().begin();

        // Query query = manager.createQuery("FROM Orientador e WHERE e.id = :id");
        // query.setParameter("id", 1L);
        // List<Orientador> orientadores = query.getResultList();

        // manager.getTransaction().commit();
        // manager.close();

        // for (Orientador e : orientadores) {
        // System.out.println("Nome: " + e.getName());
        // }
    }
}
