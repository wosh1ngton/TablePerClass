/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablePerClass.Entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Woshington
 */
@Entity
public class HierObjectID extends UIDBasedID implements Serializable {
   
    
    @OneToOne
    private UID root;   // mandatory
    @Column
    private String extension;

    public HierObjectID() {
    }

    public UID getRoot() {
        return root;
    }

    public void setRoot(UID root) {
        this.root = root;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
    
    
    
}
