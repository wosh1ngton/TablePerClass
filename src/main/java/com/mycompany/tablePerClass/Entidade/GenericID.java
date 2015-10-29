package com.mycompany.tablePerClass.Entidade;

import javax.persistence.Entity;


/**
 *
 * @author Woshington
 */
@Entity
public class GenericID extends ObjectID {


    public GenericID(String scheme, String value) {
        super(value);
        this.scheme = scheme;
    }
  
    private final String scheme;

    public String getScheme() {
        return scheme;
    }
    
    
    
}
