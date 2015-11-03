/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value = "B21")
public class B21 extends B2 {

    public B21(String value) {
        super(value);
    }

    public B21() {
    }

    @Override
    public String toString() {
        return "B21{" + '}';
    }
    
}
