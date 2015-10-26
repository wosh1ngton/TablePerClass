/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.Serializable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import newpackage.C2;

/**
 *
 * @author Woshington
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="F_TYPE",
        discriminatorType=DiscriminatorType.STRING, length=2)
public class F implements Serializable {
    
    
    
   
    
    @Id
    @PrimaryKeyJoinColumn(name="C_ID")
    C id;
    public F(){};
   
    
    public C getId() {
        return id;
    }

    public void setId(C id) {
        this.id = id;
    }
}
