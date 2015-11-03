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
@DiscriminatorValue(value = "B22")
public class B22 extends B2{

    public B22() {
    }

    public B22(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return "B22{" + '}';
    }
    
}
