/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Woshington
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class D implements Serializable {
    @JoinColumn(name="id_A")
    @OneToOne
    @Id
    A id;

    public A getId() {
        return id;
    }

    public void setId(A id) {
        this.id = id;
    }
}
