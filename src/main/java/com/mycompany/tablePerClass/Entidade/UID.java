package com.mycompany.tablePerClass.Entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.TableGenerator;

/**
 *
 * @author Woshington
 * Single-Table Strategy
 */
@Entity
@TableGenerator (name="EHR_TABLE_GENERATOR",
table="SEQUENCE_GENERATOR_TABLE",
pkColumnName="SEQUENCE_NAME",
valueColumnName="SEQUENCE_VALUE",
pkColumnValue="EHR_SEQUENCE")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class UID implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE,
            generator = "EHR_TABLE_GENERATOR")
    private Long ID;

    public UID() {
    }
    
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
    
    
}
