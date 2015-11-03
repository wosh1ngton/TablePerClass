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
@DiscriminatorValue(value = "B4")
public class B4 extends B {

    public B4(String value) {
        super(value);
    }

    public B4() {
    }

    @Override
    public String toString() {
        return "B4{" + '}';
    }
    
    
    
}
