package com.mycompany.tablePerClass.Entidade;

import javax.persistence.Entity;


/**
 *
 * @author Woshington
 */
@Entity
public class AccessGroupRef extends ObjectRef {

    public AccessGroupRef() {
    }

    public AccessGroupRef(ObjectID objectId, String namespace, String type) {
        super(objectId, namespace, type);
    }

    public AccessGroupRef(ObjectID objectId) {
        super(objectId);
    }
    
}
