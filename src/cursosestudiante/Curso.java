/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosestudiante;

/**
 *
 * @author alejandrosebastian
 */
public class Curso {
    private String nombre;
    private int codigo;
    private int creditos;
    private double nota;
    
    public Curso(String nombre, int codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerCodigo(){
        return codigo;
    }
    
    public int obtenerCredito(){
        return creditos;
    }
    
    public double obtenerNota(){
        return nota;
    }
    
    public void ponerNota(double nota){
        this.nota = nota;
    }
}
