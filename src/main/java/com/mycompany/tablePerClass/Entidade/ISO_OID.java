package com.mycompany.tablePerClass.Entidade;

import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
public class ISO_OID extends UID {
         
    public ISO_OID() {
    }
    //@FullConstructor
    public ISO_OID(String value) {
        super(value);        
    }    
     
}
