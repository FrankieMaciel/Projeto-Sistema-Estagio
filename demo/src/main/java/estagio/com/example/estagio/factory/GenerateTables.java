/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estagio.com.example.estagio.factory;

import javax.persistence.Persistence;

public class GenerateTables {
    
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("my-jpa-unit");
    }
}