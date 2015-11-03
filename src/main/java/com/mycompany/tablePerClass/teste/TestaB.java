/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablePerClass.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import newpackage.B1;
import newpackage.B21;
import newpackage.B22;
import newpackage.B3;
import newpackage.B4;
import newpackage.B5;

/**
 *
 * @author Woshington
 */
public class TestaB {
    
    public static void main(String[] args) {
        EntityManagerFactory factory=Persistence.createEntityManagerFactory("Teste");
        EntityManager manager=factory.createEntityManager();
        
        B1 b1= new B1("teste");
        B1 b1a= new B1("arquetipo");
        B1 b1b= new B1("bicicleta");
        B21 b21= new B21("version_id");
        B21 b21a= new B21("version_id2");
        B21 b21b= new B21("version_id3");
        B21 b21c= new B21("version_id4");
        B22 b22a= new B22("hier_object");
        B22 b22b= new B22("hier_object3");
        B22 b22c= new B22("hier_object2");
        B3 b3= new B3("generic_id");
        B4 b4= new B4("template_id");
        B5 b5= new B5("generic_id", "esquema");
        B5 b5a= new B5("teste_generic", "esquema2");
        B5 b5b= new B5("string5", "esquema3");
        
        manager.getTransaction().begin();
       manager.persist(b1);
       manager.persist(b21a);
       manager.persist(b21b);
       manager.persist(b21);
       manager.persist(b21a);
       manager.persist(b21b);
       manager.persist(b21c);
       manager.persist(b22a);
       manager.persist(b22b);
       manager.persist(b22c);
       manager.persist(b3);
       manager.persist(b4);
       manager.persist(b5);
       manager.persist(b5a);
       manager.persist(b5b);
        manager.getTransaction().commit();
        manager.close();
        System.out.println("Resultado: " + b5.getValue());
                
    }
    
}