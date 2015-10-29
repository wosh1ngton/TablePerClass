package com.mycompany.tablePerClass.Entidade;

import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
public class ISO_OID extends UID {
    
    //@Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    //private Long id;
    
    public ISO_OID() {
    }
    //@FullConstructor
    public ISO_OID(String value) {
        super.setValue(value);        
    }    
     
}
