package com.mycompany.tablePerClass.Entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;

/**
 *
 * @author Woshington
 */
@Entity
@TableGenerator (name="EHR_TABLE_GENERATOR",
table="SEQUENCE_GENERATOR_TABLE",
pkColumnName="SEQUENCE_NAME",
valueColumnName="SEQUENCE_VALUE",
pkColumnValue="EHR_SEQUENCE")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class ObjectRef implements Serializable {

    public ObjectRef(ObjectID objectId, String namespace, String type) {
        this.objectId = objectId;
        this.namespace = namespace;
        this.type = type;
    }

    public ObjectRef() {
    }
    public ObjectRef(ObjectID objectId) {
        this.objectId = objectId;
    }
    
    
    @Id 
    @GeneratedValue(strategy=GenerationType.TABLE, generator = "EHR_TABLE_GENERATOR")
    private Long id;
    
    @OneToOne
    private ObjectID objectId;
    private String namespace;
    private String type;

     

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ObjectID getObjectId() {
        return objectId;
    }

    public void setObjectId(ObjectID objectId) {
        this.objectId = objectId;
    }

   

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
       
    
}