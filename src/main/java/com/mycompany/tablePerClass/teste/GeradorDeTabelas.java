/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablePerClass.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import newpackage.A;
import newpackage.A1;
import newpackage.A2;
import newpackage.B1;
import newpackage.B5;
import newpackage.C;

/**
 *
 * @author Woshington
 */
public class GeradorDeTabelas {
    public static void main(String[] args) {
        EntityManagerFactory factory=Persistence.createEntityManagerFactory("Teste");
        EntityManager manager=factory.createEntityManager();
        A1 a1 = new A1("value");
        A2 a2 = new A2("valor a2");
        a2.setTeste("testando....");
        a2=manager.find(A2.class, 1L);
        
      // B1 b1 = new B1("olha");
        B5 b5 = new B5("esquemao", "eita");
        b5 = manager.find(B5.class, 1L);
        C c = new C(b5);
        
        
        manager.getTransaction().begin();
     //   manager.persist(b1);
        manager.persist(c);
        
       // manager.persist(a2);
        manager.getTransaction().commit();
        manager.close();
    }
}
