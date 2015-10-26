/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Woshington
 */
@Entity
@Table(name="C1")
    @DiscriminatorValue(value="C1")
@PrimaryKeyJoinColumn(name="C_ID")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="C1_TYPE",
        discriminatorType=DiscriminatorType.STRING, length=2)
public abstract class C1 extends C{
    String nome;
    String sobrenome;

    public C1(String value) {
        super(value);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
