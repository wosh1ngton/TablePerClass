package com.mycompany.tablePerClass.Entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Woshington
 */
@Entity
public class VersionTreeID {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String value;

    public VersionTreeID(String value) {
        this.value = value;
    }
   
    

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}