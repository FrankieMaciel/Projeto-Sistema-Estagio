/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estagio.com.example.estagio.factory;

import estagio.com.example.estagio.entities.Aluno;
import estagio.com.example.estagio.entities.Empresa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Factory {

    public static void main(String[] args) {
        //Persistence.createEntityManagerFactory("my_persistence_unit");
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("my-jpa-unit");
        EntityManager manager = factory.createEntityManager();

        // Iniciar uma transação
        manager.getTransaction().begin();

        // Executar operações de criação de tabela
        manager.createNativeQuery("CREATE TABLE IF NOT EXISTS Empresa (id INT PRIMARY KEY, nome VARCHAR(255))").executeUpdate();
        System.out.println("Criando Tabela Empresa");

        // Comitar a transação
        manager.getTransaction().commit();

        // Fechar o EntityManager e a EntityManagerFactory
        manager.close();
        manager.close();

        System.out.println("Tabela Criada!");
    }
}
