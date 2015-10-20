/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablePerClass.Entidade;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Woshington
 */
@Entity
@Table(name="Terminology_id")
public class TerminologyID extends ObjectID {
    
    private String name;
    private String version;
    
}
