package com.mycompany.tablePerClass.Entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Woshington
 */
@Entity
public class HierObjectID extends UIDBasedID implements Serializable {
   
    
    public HierObjectID() {
    }

    public HierObjectID(UID root, String extension) {
        this.root = root;
        this.extension = extension;
    }
    
    @OneToOne
    private UID root;   // mandatory
    private String extension;
    
    public UID objectID() {
		return root;
	}
    
    @Override
	public UID root() {
		return objectID();
    }

   
       
    
}