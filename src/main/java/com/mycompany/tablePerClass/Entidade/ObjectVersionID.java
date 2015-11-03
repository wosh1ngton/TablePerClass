package com.mycompany.tablePerClass.Entidade;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 *
 * @author Woshington
 */
@Entity
public class ObjectVersionID extends UIDBasedID{
    
       
   
    public ObjectVersionID() {
    }

    public ObjectVersionID(String value) {
        super(value);
    }

   
    
   

    
    
}
