/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleccion;

/**
 *
 * @author veroalonso
 */
public class Opciones {
    public static eleccion construir (String tipo){
        switch(tipo){
            case "Coche":
                return new Coche();
            case "Camineta":
                return new Camioneta();
            case "Moto":
                return new Moto();
            case "Camion":
                return new Camion();
            default: 
                return null;
        }
       
    }
}
