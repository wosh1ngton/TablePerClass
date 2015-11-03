/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Woshington
 */
public abstract class Veiculo {
   
    private String placa;
    private String cor;

       public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
     public static void main(String[] args) {
        Gol gol=new Gol();
        gol.setCor("azul");
        gol.setModelo("1.6");
        gol.setOpcional("air-bag");
        gol.setPlaca("hgb-6443");
        
        System.out.println("Modelo: " + gol.toString());
    }
    
}

abstract class Carro extends Veiculo {
    
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}

class Gol extends Carro {
    private String opcional;

    public String getOpcional() {
        return opcional;
    }

    public void setOpcional(String opcional) {
        this.opcional = opcional;
    }
    
    
}

class Moto extends Veiculo {
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}

