package com.mycompany.tablePerClass.Entidade;

import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
public class TerminologyID extends ObjectID {
    
    private String name;
    private String version;

    public TerminologyID(String value) {
        super(value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
        
}