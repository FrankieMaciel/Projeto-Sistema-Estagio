/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estagio.com.example.estagio.factory;

import estagio.com.example.estagio.entities.Aluno;
import estagio.com.example.estagio.entities.Estagio;
import estagio.com.example.estagio.entities.Empresa;
import estagio.com.example.estagio.entities.Orientador;
import estagio.com.example.estagio.entities.Status;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FactoryEstagio {

    public static void main(String[] args) {
        // Persistence.createEntityManagerFactory("my_persistence_unit");
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("my-jpa-unit");
        EntityManager manager = factory.createEntityManager();

        // ------------ | INSERÇÃO | ------------
        manager.getTransaction().begin();
        Estagio estagio = new Estagio();
        Aluno aluno = new Aluno();
        Empresa empresa = new Empresa();
        Orientador orientador = new Orientador();

        estagio.setAluno(aluno);
        estagio.setEmpresa(empresa);
        estagio.setOrientador(orientador);
        estagio.setCargaHoraria(150);
        estagio.setInicio("13/02/2023");
        estagio.setFim("13/05/2023");
        estagio.setStatus(Status.EM_ANDAMENTO);

        manager.persist(estagio);
        manager.getTransaction().commit();
        manager.close();

        // ------------ | ATUALIZAÇÃO | ------------
        // manager.getTransaction().begin();
        // Estagio estagio = manager.find(Estagio.class, 2L);
        // estagio.setStatus(Status.FINALIZADO);
        // manager.persist(estagio);
        // manager.getTransaction().commit();
        // manager.close();

        // ------------ | REMOÇÃO | ------------
        // manager.getTransaction().begin();
        // Estagio estagio = manager.find(Estagio.class, 1L);
        // manager.remove(estagio);
        // manager.getTransaction().commit();
        // manager.close();

        // ------------ | LISTAGEM | ------------
        // ------------ ESTÁGIO ------------
        // manager.getTransaction().begin();

        // Query query = manager.createQuery("FROM Estagio");
        // List<Estagio> estagios = query.getResultList();

        // manager.getTransaction().commit();
        // manager.close();

        // for (Estagio e : estagios) {
        // System.out.println("Nome: " + e.getStatus());
        // }

        // ------------ | FILTRAGEM | ------------
        // ------------ PESQUISAR ESTAGIO POR ID ------------
        // manager.getTransaction().begin();

        // Query query = manager.createQuery("FROM Estagio e WHERE e.id = :id");
        // query.setParameter("id", 2L);
        // List<Estagio> Estagios = query.getResultList();

        // manager.getTransaction().commit();
        // manager.close();

        // for (Estagio e : Estagios) {
        // System.out.println("Nome: " + e.getAluno());
        // }
    }
}