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
 */
@Entity /*
@TableGenerator (name="EHR_TABLE_GENERATOR",
table="SEQUENCE_GENERATOR_TABLE",
pkColumnName="SEQUENCE_NAME",
valueColumnName="SEQUENCE_VALUE",
pkColumnValue="EHR_SEQUENCE")*/
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class UIDBasedID extends ObjectID implements Serializable {

    public abstract UID root();
    /*
    @Id 
    @GeneratedValue(strategy=GenerationType.TABLE,
            generator = "EHR_TABLE_GENERATOR")
    private Long id; */
     
}
