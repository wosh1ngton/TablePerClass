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
@DiscriminatorValue(value = "B5")
public class B5 extends B {

    public B5(String scheme, String value) {
        super(value);
        this.scheme = scheme;
    }

    public B5() {
    }
    
    
    
    private String scheme;

    @Override
    public String toString() {
        return "B5{" + "scheme=" + scheme + '}';
    }
    
}
