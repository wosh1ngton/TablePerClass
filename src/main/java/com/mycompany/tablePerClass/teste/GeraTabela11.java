/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablePerClass.teste;

import com.mycompany.tablePerClass.Entidade.InternetID;
import com.mycompany.tablePerClass.Entidade.UID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import newpackage.B;
import newpackage.B1;
import newpackage.B11;
import newpackage.B2;
import newpackage.C1;
import newpackage.C11;


/**
 *
 * @author Woshington
 */
public class GeraTabela11 {
    
    
    public static void main(String[] args) {
        
    
     C11 teste11=new C11("joao");
    teste11.setNome("rodrigues");
    teste11.setValue("teste1");
    teste11.setSobrenome("arimateia");
    
     B2 teste2=new B2();
    teste2.setIdade(47);
    teste2.setValue("ione");
    
    B teste=teste2;
    teste.setValue("um milhao");
    
    B11 testeb11=new B11();
    testeb11.setEndereco("Rua 12");
    testeb11.setSurname("rodrigues");
    testeb11.setValue("incalculavel");
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("TesteC");
    EntityManager manager=factory.createEntityManager();
    
    manager.getTransaction().begin();
    manager.persist(teste11);
    manager.getTransaction().commit();
    
        System.out.println("UID persistido " + teste11.getSobrenome());
    
    manager.close();
    }
}
