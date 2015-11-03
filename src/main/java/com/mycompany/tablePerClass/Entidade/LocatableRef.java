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
    public LocatableRef(UIDBasedID based_id, String path) {
        this.based_id = based_id;
        this.path = path;
    }
    public LocatableRef(ObjectID objectId) {
        super(objectId);
    }

     public LocatableRef(ObjectVersionID id, String namespace, String type, String path) {
        super(id, namespace, type);
        this.path=path;
        this.based_id=id;
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
