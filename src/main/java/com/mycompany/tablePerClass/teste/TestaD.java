/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablePerClass.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import newpackage.D;

/**
 *
 * @author Woshington
 */
public class TestaD {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Teste");
        EntityManager manager = factory.createEntityManager();
        D d=new D();
        d.setValue("arvore");
        manager.getTransaction().begin();
        manager.persist(d);
        manager.getTransaction().commit();
        manager.close();
    }
}
