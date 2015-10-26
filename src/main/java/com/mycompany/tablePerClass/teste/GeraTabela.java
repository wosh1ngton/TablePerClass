/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablePerClass.teste;

import com.mycompany.tablePerClass.Entidade.InternetID;
import com.mycompany.tablePerClass.Entidade.LocatableRef;
import com.mycompany.tablePerClass.Entidade.ObjectVersionID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author Woshington
 */
public class GeraTabela {
    
    
    public static void main(String[] args) {
    
    InternetID internet=new InternetID();
    internet.setValue("www.uol.com.br2");
     ObjectVersionID oid=new ObjectVersionID();
        oid.setValue("123");
        LocatableRef lr=new LocatableRef();
        lr.setId(oid);
        lr.setNamespace("fwfwef");
        lr.setPath("pathdo sucesso");
        lr.setType("teste");
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("identification");
    EntityManager manager=factory.createEntityManager();
    
    manager.getTransaction().begin();
    manager.persist(lr);
    manager.getTransaction().commit();
       
        System.out.println("UID persistido " + oid.getValue());
    
    manager.close();
    }
}
