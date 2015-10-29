package com.mycompany.tablePerClass.Entidade;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Woshington
 */
@Entity
public class LocatableRef extends ObjectRef {

    public LocatableRef() {
    }
    
    @OneToOne
    UIDBasedID based_id;    
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
}
