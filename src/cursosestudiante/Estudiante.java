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
public class Estudiante {
    private String nombre;
    private String apellido;
    private int codigo;
    private Curso curso[];
    private int cursosRegistrados=0;
    
    public void registrar(String nombre, String apellido, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }
    
    public void registrarCurso(String nombre, int codigo, int creditos ){
        
        if (this.cursosRegistrados<5){
            
            this.curso[this.cursosRegistrados] = new Curso(nombre, codigo, creditos);
            this.cursosRegistrados = (this.cursosRegistrados+1);
        }
        else{
            System.out.println("Se han registrado todos los 5 cursos.");
        }
    }
    
    public void ConsultarCurso(int codigo){
        int i =0;
        
        while (i<this.cursosRegistrados){
            Curso c = this.curso[i];
            
            if (c.obtenerCodigo() == codigo){
                System.out.println("Nombre: "+c.obtenerNombre());
                i = this.cursosRegistrados+1;
            }
            i=i+1;
        }        
    }
    
    public void asignarNota(int codigo, double nota){
        int i =0;
        
        while (i<this.cursosRegistrados){
            Curso c = this.curso[i];
            
            if (c.obtenerCodigo() == codigo){
                this.curso[i].ponerNota(nota);
                i = this.cursosRegistrados+1;
            }
            i=i+1;
        }
    }
    
    public double calcularPromedio(){
        double sumaNota=0;
        double promedio=0;
        
        for (int i=0; i<this.cursosRegistrados; i++){
            Curso c = this.curso[i];
            sumaNota = sumaNota+(c.obtenerNota()*c.obtenerCredito());
        }
        
        promedio = (sumaNota)/this.cursosRegistrados;
                
        return promedio;
    }
    
    public boolean pruebaAcademica(){
        double prueba = 0;
        
        prueba = this.calcularPromedio();
        if(prueba>=3.25){
            return false;
        }
        else{
            return true;
        }
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
}
