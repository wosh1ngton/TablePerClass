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
@Table(name="A1")
public abstract class A1 extends A{
    
    
    String apelido;

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    
}
