package com.mycompany.tablePerClass.Entidade;

import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

/**
 *
 * @author Woshington
 */
@Entity
public class ArchetypeID extends ObjectID {
    
    private String qualifiedRmEntity;   // calculated
    private String rmOriginator;
    private String rmName;
    private String rmEntity;
    private String domainConcept;       // calculated
    private String conceptName;
    @ElementCollection
    @CollectionTable(name="spec",
            joinColumns=@JoinColumn(name="archetype_id"))
    private List<String> specialisation;
    private String versionID;

    public ArchetypeID(String value) {
        super(value);
    }

    public ArchetypeID() {
    }

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
