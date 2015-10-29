package com.mycompany.tablePerClass.Entidade;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
public class InternetID extends UID implements Serializable {
    
    //@Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    //private Long id;
    
    public InternetID() {
    }
    
    //@FullConstructor
    public InternetID(String value) {
        super.setValue(value);        
    }     
}
