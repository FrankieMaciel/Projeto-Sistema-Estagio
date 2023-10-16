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

public class Factory {

    public static void main(String[] args) {
        //Persistence.createEntityManagerFactory("my_persistence_unit");
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("my-jpa-unit");
        EntityManager manager = factory.createEntityManager();

        // ------------ Inserção ------------
        // manager.getTransaction().begin();
        // Empresa jpa = new Empresa();
        // jpa.setName("NovaEmpresa");

        // manager.persist(jpa);
        // manager.getTransaction().commit();
        // manager.close();
        
        // ------------ Atualização ------------
        // manager.getTransaction().begin();
        // Empresa empresa = manager.find(Empresa.class, 2L);
        // empresa.setName("NomeTrocado");
        // manager.persist(jpa);
        // manager.getTransaction().commit();
        // manager.close();

        // ------------ Remoção ------------
        // manager.getTransaction().begin();
        // Empresa empresa = manager.find(Empresa.class, 1L);
        // manager.remove(empresa);
        // manager.getTransaction().commit();
        // manager.close();

        // ------------ Listagem ------------
        //      ------------ Empresa ------------
        // manager.getTransaction().begin();
        
        // Query query = manager.createQuery("FROM Empresa");
        // List<Empresa> empresas = query.getResultList();

        // manager.getTransaction().commit();
        // manager.close();

        // for (Empresa e: empresas) {
        //     System.out.println("Nome: " + e.getName());
        // }
        
        //      ------------ Alunos ------------
        // manager.getTransaction().begin();
        
        // Query query = manager.createQuery("FROM Alunos");
        // List<Aluno> alunos = query.getResultList();

        // manager.getTransaction().commit();
        // manager.close();

        // for (Aluno a: alunos) {
        //     System.out.println("Nome: " + a.getName());
        // }

        //      ------------ Orientador ------------
        // manager.getTransaction().begin();
        
        // Query query = manager.createQuery("FROM Orientador");
        // List<Orientador> orientadores = query.getResultList();

        // manager.getTransaction().commit();
        // manager.close();

        // for (Orientador o: orientadores) {
        //     System.out.println("Nome: " + o.getName());
        // }

        //      ------------ Estágio ------------
        // manager.getTransaction().begin();
        
        // Query query = manager.createQuery("FROM Estagio");
        // List<Estagio> estagios = query.getResultList();

        // manager.getTransaction().commit();
        // manager.close();

        // for (Estagio e: estagios) {
        //     System.out.println("Nome: " + e.getStatus());
        // }

        // ------------ Filtargem ------------
        //      ------------ Pesquisar Empresa por id ------------
        // manager.getTransaction().begin();
        
        // Query query = manager.createQuery("FROM Empresa e WHERE e.id = :id");
        // query.setParameter("id", 2L);
        // List<Empresa> empresas = query.getResultList();

        // manager.getTransaction().commit();
        // manager.close();

        // for (Empresa e: empresas) {
        //     System.out.println("Nome: " + e.getName());
        // }

        //      ------------ Pesquisar Alunos por Empresa ------------
        manager.getTransaction().begin();

        Query query1 = manager.createQuery("FROM Empresa d WHERE d.name = :name");
        query1.setParameter("name", "NomeEmpresa");
        Empresa emp = (Empresa) query1.getSingleResult();
        
        Query query = manager.createQuery("FROM Aluno e WHERE e.empresa = :id");
        query.setParameter("id", emp.getId());
        List<Aluno> alunos = query.getResultList();

        manager.getTransaction().commit();
        manager.close();

        for (Aluno a: alunos) {
            System.out.println("Nome: " + a.getName());
        }

    }
}
