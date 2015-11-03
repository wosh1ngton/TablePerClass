/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablePerClass.teste;

import com.mycompany.tablePerClass.Entidade.AccessGroupRef;
import com.mycompany.tablePerClass.Entidade.ArchetypeID;
import com.mycompany.tablePerClass.Entidade.GenericID;
import com.mycompany.tablePerClass.Entidade.HierObjectID;
import com.mycompany.tablePerClass.Entidade.LocatableRef;
import com.mycompany.tablePerClass.Entidade.ObjectID;
import com.mycompany.tablePerClass.Entidade.ObjectVersionID;
import com.mycompany.tablePerClass.Entidade.PartyRef;
import com.mycompany.tablePerClass.Entidade.TemplateID;
import com.mycompany.tablePerClass.Entidade.TerminologyID;
import com.mycompany.tablePerClass.Entidade.UIDBasedID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Woshington
 */
public class PopulaObjectRef {
    public static void main(String[] args) {
         EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("identification");
    EntityManager entidade=fabrica.createEntityManager();
   entidade.getTransaction().begin();
    
    
    ObjectID objeto = entidade.find(ArchetypeID.class, 1L);
         
    TemplateID temp=entidade.find(TemplateID.class, 2L);
        
    GenericID generic=entidade.find(GenericID.class, 3L);
       //TerminologyID termi=entidade.find(TerminologyID.class, 4L);
        
        UIDBasedID uid=entidade.find(ObjectVersionID.class, 5L);
        UIDBasedID uid2=entidade.find(HierObjectID.class, 6L);
        
        //HierObjectID hier=entidade.find(HierObjectID.class, 7L);
       // ObjectVersionID version=entidade.find(ObjectVersionID.class, 8L);
      ObjectVersionID versao=entidade.find(ObjectVersionID.class, 9L);
         
         AccessGroupRef acc=new AccessGroupRef(temp);
         PartyRef party = new PartyRef(objeto);
         AccessGroupRef acc2=new AccessGroupRef(temp);
       PartyRef party2 = new PartyRef(generic);
       LocatableRef local = new LocatableRef(uid2, "feliz");
        LocatableRef local2 = new LocatableRef(versao, "teste", "exemplo", "servico");
    
      entidade.persist(acc);
      entidade.persist(party);
        entidade.persist(acc2);
       entidade.persist(party2);
       entidade.persist(local);
     entidade.persist(local2);
      //  entidade.persist();
      //  entidade.persist();
      //  entidade.persist();
        entidade.getTransaction().commit();
        entidade.close();
       
    }
}
