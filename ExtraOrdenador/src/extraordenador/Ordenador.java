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
public class Ordenador {
    //Atributos clases
        private Cpu procesador = new Cpu();
        private Rato raton = new Rato();
        private Teclado teclado = new Teclado();
        private Monitor monitor = new Monitor();
    //Constructores
    public Ordenador(){
    }
    
    //Setters de las clases
    public void setCpu(int nucleos, int ram){
        procesador.setNucleos(nucleos);
        procesador.setRam(ram);
    }
    public void setRato(boolean inalambrico, String modelo){
        raton.setInalambrico(inalambrico);
        raton.setModelo(modelo);
    }
    public void setTeclado(int numTeclas){
        teclado.setNumTeclas(numTeclas);
    }
    public void setMonitor(String marca, float pulgadas){
        monitor.setMarca(marca);
        monitor.setPulgadas(pulgadas);
    }
    //Visualización de los atributos de todas las clases
    public String visualizarAtributos(){
        return procesador.toString() + "\n" + raton.toString() 
        + "\n" + teclado.toString() + "\n" + monitor.toString(); 
    }
    //Cálculo del precio según ciertas características
    public double calcularPrecio(){
        double precio = procesador.getRam()*5 + teclado.getNumTeclas()*0.7 + monitor.getPulgadas()*12;
        if(raton.booInalambrico() == true){
            return Math.round(precio * 1.5);
        }
        else{
            return Math.round(precio);
        }
    }
}
