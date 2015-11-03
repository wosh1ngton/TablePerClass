package com.mycompany.tablePerClass.Entidade;

import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
public class ArchetypeID extends ObjectID {

    public ArchetypeID() {
    }

    public ArchetypeID(String value) {
        super(value);
    }
 }
