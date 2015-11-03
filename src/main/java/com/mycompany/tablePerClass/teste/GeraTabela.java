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
import com.mycompany.tablePerClass.Entidade.ISO_OID;
import com.mycompany.tablePerClass.Entidade.InternetID;
import com.mycompany.tablePerClass.Entidade.LocatableRef;
import com.mycompany.tablePerClass.Entidade.ObjectRef;
import com.mycompany.tablePerClass.Entidade.ObjectVersionID;
import com.mycompany.tablePerClass.Entidade.TemplateID;
import com.mycompany.tablePerClass.Entidade.TerminologyID;
import com.mycompany.tablePerClass.Entidade.UIDBasedID;
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
        TerminologyID termi=new TerminologyID("valor terminal");
      
        ArchetypeID arquetipo=new ArchetypeID();
       arquetipo.setValue("valor arquetipo");
        
        TemplateID temp=new TemplateID("ABC");
        
        GenericID generic=new GenericID("171", "valor geral");
        TerminologyID termi2=new TerminologyID("terminologia");
        
        UIDBasedID uid=new ObjectVersionID("version_id");
        UIDBasedID uid2=new HierObjectID("hier_do_uid");
        
        HierObjectID hier=new HierObjectID("direto do hier");
        ObjectVersionID version=new ObjectVersionID("Direto do version");
        
     //ObjectVersionID oid=new ObjectVersionID();
     //   oid.setValue("123");
        LocatableRef lr=new LocatableRef();
       
        
        //lr.setId(oid);
        lr.setNamespace("fwfwef");
        lr.setPath("pathdo sucesso");
        lr.setType("teste");
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("identification");
    EntityManager entidade=factory.createEntityManager();
     
 
   // termi=manager.find(TerminologyID.class, 150L);
    ObjectRef or=new ObjectRef(termi, "este", "tea");
    AccessGroupRef ac=new AccessGroupRef();
    ac.setNamespace("nome");
    ac.setType("tipo1");
    ac.setObjectId(termi);
    entidade.getTransaction().begin();
        entidade.persist(arquetipo);
        entidade.persist(temp);
        entidade.persist(generic);
        entidade.persist(termi);
        entidade.persist(uid);
        entidade.persist(uid2);
        entidade.persist(hier);
        entidade.persist(version);
        //entidade.persist(versao);
    entidade.getTransaction().commit();
       
        System.out.println("UID persistido " + iso.getValue());
    
    entidade.close();
    }
}
