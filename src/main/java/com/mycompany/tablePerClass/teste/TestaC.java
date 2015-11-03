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
import newpackage.C;
import newpackage.C1;
import newpackage.C2;
import newpackage.C3;

/**
 *
 * @author Woshington
 */
public class TestaC {
    
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Teste");
        EntityManager manager = factory.createEntityManager();
        
        B1 b1= manager.find(B1.class, 1L);
        B21 b21a= manager.find(B21.class, 2L);
        B21 b21b= manager.find(B21.class, 3L);
        B21 b21c= manager.find(B21.class, 4L);
        B21 b21d= manager.find(B21.class, 5L);
        B22 b22a= manager.find(B22.class, 6L);
        B22 b22b= manager.find(B22.class, 7L);
        B22 b22c= manager.find(B22.class, 8L);
        B3 b3= manager.find(B3.class, 9L);
        B4 b4= manager.find(B4.class, 10L);
        B5 b5= manager.find(B5.class, 11L);
        B5 b5a= manager.find(B5.class, 12L);
        B5 b5b= manager.find(B5.class, 13L);
  
        C c=new C("name_space", "tipo", b5);
        C1 c1=new C1(b21a);
        C1 c1a = new C1(b3);
        C2 c2 = new C2(b22c);
        C3 c3 = new C3("caminho", "space_name", "tipo", b22c);
        C3 c3a = new C3("caminho_novo", "nome", "tipo2", b22a);
        
        
        manager.getTransaction().begin();
        manager.persist(c1);
        manager.persist(c1a);
        manager.persist(c2);
        manager.persist(c3);
        manager.persist(c3a);
        manager.getTransaction().commit();
        manager.close();
        
        System.out.println("Verificando objeto: " + c2.getNamespace());
    }
    
}
