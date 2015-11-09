package com.mycompany.tablePerClass.Entidade;

import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
public class PartyRef extends ObjectRef {

    public PartyRef() {
    }
    public PartyRef(ObjectID objectId, String namespace, String type) {
        super(objectId, namespace, type);
    }
    public PartyRef(ObjectID objectId) {
        super(objectId);
    }
   
}
