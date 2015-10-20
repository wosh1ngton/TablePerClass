/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablePerClass.Entidade;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Woshington
 */
@Entity
@Table(name="Archetype_id")
public class ArchetypeID extends ObjectID {
    
    @Column
    private String qualifiedRmEntity;   // calculated
    @Column
    private String rmOriginator;
    @Column
    private String rmName;
    @Column
    private String rmEntity;
    @Column
    private String domainConcept;       // calculated
    @Column
    private String conceptName;
    @Column
    private List<String> specialisation;
    @Column
    private String versionID;

    public String getQualifiedRmEntity() {
        return qualifiedRmEntity;
    }

    public void setQualifiedRmEntity(String qualifiedRmEntity) {
        this.qualifiedRmEntity = qualifiedRmEntity;
    }

    public String getRmOriginator() {
        return rmOriginator;
    }

    public void setRmOriginator(String rmOriginator) {
        this.rmOriginator = rmOriginator;
    }

    public String getRmName() {
        return rmName;
    }

    public void setRmName(String rmName) {
        this.rmName = rmName;
    }

    public String getRmEntity() {
        return rmEntity;
    }

    public void setRmEntity(String rmEntity) {
        this.rmEntity = rmEntity;
    }

    public String getDomainConcept() {
        return domainConcept;
    }

    public void setDomainConcept(String domainConcept) {
        this.domainConcept = domainConcept;
    }

    public String getConceptName() {
        return conceptName;
    }

    public void setConceptName(String conceptName) {
        this.conceptName = conceptName;
    }

    public List<String> getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(List<String> specialisation) {
        this.specialisation = specialisation;
    }

    public String getVersionID() {
        return versionID;
    }

    public void setVersionID(String versionID) {
        this.versionID = versionID;
    }
    
    
}
