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
public class Cpu {
    private int nucleos;
    private int ram;
    
    public Cpu(){
        
    }
    
    public Cpu (int nucleos, int ram){
        this.nucleos = nucleos;
        this.ram = ram;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    @Override
    public String toString(){
        return "Características CPU\nNúcleos: " + nucleos + "\nMemoria RAM: " + ram + "GB\n";
    }
}
