package com.mycompany.tablePerClass.Entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Woshington
 */
@Entity
public class HierObjectID extends UIDBasedID implements Serializable {
   
    
    public HierObjectID() {
    }

     public HierObjectID(String value) {
        super(value);
    }

      
    
}