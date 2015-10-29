/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablePerClass.teste;

import com.mycompany.tablePerClass.Entidade.AccessGroupRef;
import com.mycompany.tablePerClass.Entidade.ISO_OID;
import com.mycompany.tablePerClass.Entidade.InternetID;
import com.mycompany.tablePerClass.Entidade.LocatableRef;
import com.mycompany.tablePerClass.Entidade.ObjectVersionID;
import com.mycompany.tablePerClass.Entidade.UUID;
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
    internet.setValue("www.globo.com");
    ISO_OID iso=new ISO_OID("2.16.840.1.113883.3.1");
    UUID u=new UUID("8-4-4-4-12");
     //ObjectVersionID oid=new ObjectVersionID();
     //   oid.setValue("123");
        LocatableRef lr=new LocatableRef();
        AccessGroupRef ac=new AccessGroupRef();
        ac.setNamespace("nome");
        ac.setType("tipo1");
        //lr.setId(oid);
        lr.setNamespace("fwfwef");
        lr.setPath("pathdo sucesso");
        lr.setType("teste");
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("identification");
    EntityManager manager=factory.createEntityManager();
    
    manager.getTransaction().begin();
    manager.persist(internet);
    manager.getTransaction().commit();
       
        System.out.println("UID persistido " + iso.getValue());
    
    manager.close();
    }
}
