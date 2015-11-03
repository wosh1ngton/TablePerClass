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

    public PartyRef(ObjectID objectId) {
        super(objectId);
    }
   
}
