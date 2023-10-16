/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estagio.com.example.estagio.factory;

import estagio.com.example.estagio.entities.Aluno;
import estagio.com.example.estagio.entities.Empresa;
//import estagio.com.example.estagio.entities.Estagio;
import estagio.com.example.estagio.entities.Orientador;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FactoryAluno {

    public static void main(String[] args) {
        // Persistence.createEntityManagerFactory("my_persistence_unit");
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("my-jpa-unit");
        EntityManager manager = factory.createEntityManager();

        // ------------ | INSERÇÃO | ------------
        // manager.getTransaction().begin();
        // Aluno aluno = new Aluno();
        // aluno.setName("Aluno1");

        // manager.persist(aluno);
        // manager.getTransaction().commit();
        // manager.close();

        // ------------ | ATUALIZAÇÃO | ------------
        // manager.getTransaction().begin();
        // Aluno aluno = manager.find(Aluno.class, 7L);
        // // aluno.setName("AlunoTrocado");

        // Query query1 = manager.createQuery("FROM Empresa d WHERE d.name = :name");
        // query1.setParameter("name", "Empresa2");
        // Empresa emp = (Empresa) query1.getSingleResult();

        // aluno.setEmpresa(emp);

        // Query query2 = manager.createQuery("FROM Orientador d WHERE d.name = :name");
        // query2.setParameter("name", "Orientador1");
        // Orientador ori = (Orientador) query2.getSingleResult();

        // aluno.setOrientador(ori);

        // manager.persist(aluno);
        // manager.getTransaction().commit();
        // manager.close();

        // ------------ | REMOÇÃO | ------------
        // manager.getTransaction().begin();
        // Aluno aluno = manager.find(Aluno.class, 1L);
        // manager.remove(aluno);
        // manager.getTransaction().commit();
        // manager.close();

        // ------------ | LISTAGEM | ------------
        // ------------ ALUNOS ------------
        // manager.getTransaction().begin();

        // Query query = manager.createQuery("FROM Alunos");
        // List<Aluno> alunos = query.getResultList();

        // manager.getTransaction().commit();
        // manager.close();

        // for (Aluno a: alunos) {
        // System.out.println("Nome: " + a.getName());
        // }

        // ------------ | FILTARGEM | ------------
        // ------------ PESQUISAR ALUNO POR ID ------------
        // manager.getTransaction().begin();

        // Query query = manager.createQuery("FROM Aluno e WHERE e.id = :id");
        // query.setParameter("id", 2L);
        // List<Aluno> Alunos = query.getResultList();

        // manager.getTransaction().commit();
        // manager.close();

        // for (Aluno e : Alunos) {
        // System.out.println("Nome: " + e.getName());
        // }

        // ------------ PESQUISAR ALUNOS POR EMPRESA ------------
        // manager.getTransaction().begin();

        // Query query1 = manager.createQuery("FROM Aluno d WHERE d.name = :name");
        // query1.setParameter("name", "NomeAluno");
        // Aluno emp = (Aluno) query1.getSingleResult();

        // Query query = manager.createQuery("FROM Aluno e WHERE e.Aluno = :id");
        // query.setParameter("id", emp.getId());
        // List<Aluno> alunos = query.getResultList();

        // manager.getTransaction().commit();
        // manager.close();

        // for (Aluno a : alunos) {
        //     System.out.println("Nome: " + a.getName());
        // }
    }
}
