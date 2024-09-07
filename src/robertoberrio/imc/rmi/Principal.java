/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package robertoberrio.imc.rmi;

import robertoberrio.imc.rmi.net.Servidor;

/**
 *
 * @author rober
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servidor servicio = new Servidor();
        
        try {
            servicio.iniciar();
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
    
}
