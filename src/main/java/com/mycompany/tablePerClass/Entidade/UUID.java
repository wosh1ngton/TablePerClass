package com.mycompany.tablePerClass.Entidade;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
public class UUID extends UID implements Serializable {
    
    //@Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    //private Long id;
    
    public UUID() {
    }
    //@FullConstructor
    public UUID(String value) {
        super.setValue(value);        
    }    
       
}
