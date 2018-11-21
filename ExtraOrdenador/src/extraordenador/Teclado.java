/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraordenador;

/**
 *
 * @author ecollazodominguez
 */
public class Teclado {
    private int numTeclas;
    
    public Teclado(){}
    
    public Teclado(int numTeclas){
        this.numTeclas = numTeclas;
    }

    public int getNumTeclas() {
        return numTeclas;
    }

    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }
    
    @Override
    public String toString(){
        return "Características teclado\nTeclas: " + numTeclas + "\n";
    }
}
