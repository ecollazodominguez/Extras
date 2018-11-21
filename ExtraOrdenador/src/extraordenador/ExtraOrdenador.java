/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraordenador;

import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class ExtraOrdenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Ordenador acer = new Ordenador();
        acer.setCpu(6, 12);
        acer.setRato(true,"Razer");
        acer.setTeclado(60);
        acer.setMonitor("LG", 15.5f);
        JOptionPane.showMessageDialog(null, acer.visualizarAtributos());
        JOptionPane.showMessageDialog(null, acer.calcularPrecio());
    }
    }
    
