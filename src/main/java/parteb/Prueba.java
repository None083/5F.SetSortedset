/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteb;

import java.util.ArrayList;

/**
 *
 * @author noelia
 */
public class Prueba {
    public static void main(String[] args) {
        
        Ejercito ejercito = new Ejercito();
        
        ejercito.alistarSoldado(new Soldado("09058925L", "Isabel", "P.", "A.", 18));
        ejercito.alistarSoldado(new Soldado("08764534P", "Cat", "N.", "O.", 25));
        ejercito.alistarSoldado(new Soldado("08645749N", "Gabriel", "P.", "H.", 34));
        ejercito.alistarSoldado(new Soldado("04983277F", "Curro", "G.", "P.", 23));
        
        System.out.println(ejercito.numeroSoldados());
        
        ejercito.desmatricularSoldado(new Soldado("09058925L", "", "", "", 0));
        System.out.println(ejercito.numeroSoldados());
        
        System.out.println(ejercito.estaVacio());
        
        System.out.println(ejercito.estaEnEjercito(new Soldado("08764534P", "", "", "", 0)));
        
        ArrayList<Soldado> listaSoldados = ejercito.listaSoldados();
        for (int i = 0; i < listaSoldados.size(); i++) {
            System.out.println(listaSoldados.get(i));
        }
                
    }
    
    
    
}
