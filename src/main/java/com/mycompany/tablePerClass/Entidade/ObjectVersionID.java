/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablePerClass.Entidade;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Woshington
 */
@Entity
@Table(name="Object_version_id")
public class ObjectVersionID extends UIDBasedID{
    
    @OneToOne
    private UID objectID;
    private VersionTreeID versionTreeID;
    private HierObjectID creatingSystemID;
    
}
