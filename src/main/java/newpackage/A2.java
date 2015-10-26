/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Woshington
 */
@Entity
@Table(name="A2")
public class A2 extends A{
    String sobrenome;

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    
}
