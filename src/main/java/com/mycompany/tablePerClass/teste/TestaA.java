/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablePerClass.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import newpackage.A1;
import newpackage.A2;
import newpackage.A3;

/**
 *
 * @author Woshington
 */
public class TestaA {
    
    public static void main(String[] args) {
        
        A1 a1=new A1("www.globo.com");  
        A1 a11=new A1("www.globo.com");   
        A2 a2=new A2("www.concursosdeti.com");  
        A2 a22=new A2("www.concursosdeti.com");     
        A3 a3=new A3("www.sbt.net");
       // a2.setValue("www.globo.com");
      
        EntityManagerFactory factory=Persistence.createEntityManagerFactory("Teste");
        EntityManager manager=factory.createEntityManager();
        
        manager.getTransaction().begin();
        manager.persist(a1);
        manager.persist(a11);
        manager.persist(a2);
        manager.persist(a22);
        manager.persist(a3);
        manager.getTransaction().commit();
        manager.close();
        System.out.println("Resultado: " + a2.getValue());
        
    }
}
