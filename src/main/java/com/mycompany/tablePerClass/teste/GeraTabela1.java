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
import newpackage.A;
import newpackage.A1;
import newpackage.A11;
import newpackage.A12;
import newpackage.A2;


/**
 *
 * @author Woshington
 */
public class GeraTabela1 {
    
    
    public static void main(String[] args) {
    
        //A teste=new A1();
        A11 teste11=new A11();
        teste11.setApelido("teste1");
        teste11.setName("nome1");
        teste11.setApelido("bola");
        teste11.setEndereco("rua dona stella");
        teste11.setId("x1");
        
        A12 teste12 = new A12();
        teste12.setName("xitons");
        teste12.setApelido("gorducho");
        teste12.setIdade("vinte e sete");
        teste12.setId("x2");
        
        A teste1 = teste12;
        teste12.setApelido("feroz");
        teste12.setName("wos");
        
        A2 teste2=new A2();
        teste2.setId("wos");
        teste2.setName("charli");
        teste2.setSobrenome("Rocha");
        
       // A teste=teste3;
       // teste.setName("wos");
       // teste.setId(2L);
//A teste=teste3;
        
        
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("Teste");
    EntityManager manager=factory.createEntityManager();
    
    manager.getTransaction().begin();
    manager.persist(teste2);
    manager.getTransaction().commit();
    
        System.out.println("Teste persistido " + teste2.getName());
    
    manager.close();
    }
}
