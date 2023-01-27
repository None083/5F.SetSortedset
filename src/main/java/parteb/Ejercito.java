/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteb;

import partea.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author FX506
 */
public class Ejercito {
    
    private Set<Soldado> ejercito;

    public Ejercito() {
         ejercito = new TreeSet<>();
    }

    
    public int numeroSoldados(){
        return ejercito.size();
    }
    
    public void alistarSoldado(Soldado s){
        ejercito.add(s);
    }
    
    public boolean estaVacio(){
        return ejercito.isEmpty();     
    }
    
    public boolean estaEnEjercito(Soldado s){
        return ejercito.contains(s);
    }
    
    public ArrayList<Soldado> listaSoldados(){
        return new ArrayList<>(ejercito);
    }
    
    public void desmatricularSoldado(Soldado s){
        ejercito.remove(s);
    }
    
}
