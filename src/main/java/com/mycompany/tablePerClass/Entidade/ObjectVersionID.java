package com.mycompany.tablePerClass.Entidade;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Woshington
 */
@Entity
public class ObjectVersionID extends UIDBasedID{
    
       
    public ObjectVersionID() {
    }

    public ObjectVersionID(UID objectID, VersionTreeID versionTreeID, HierObjectID creatingSystemID) {
        this.objectID = objectID;
        this.versionTreeID = versionTreeID;
        this.creatingSystemID = creatingSystemID;
    }
    
    
    @OneToOne
    private UID objectID;
    @OneToOne
    private VersionTreeID versionTreeID;
    @OneToOne
    private HierObjectID creatingSystemID;
    
    public UID objectID() {
		return objectID;
	}
    
    @Override
	public UID root() {
		return objectID();
    }

    
    
}
