/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosestudiante;

/**
 * <h1>Manejo cursos estudiante</h1>
 * @since 28/02/2016
 * @author alejandrosebastian
 */
public class CursosEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        java.util.Scanner leer = new java.util.Scanner(System.in);
        Estudiante estudiante = new Estudiante();
        boolean indicadorEst = false;
        
        do {
            System.out.println("Selesccion una opcion para comenzar."
                                + "\n1. Registar estudiante."
                                + "\n2. Registar cursos."
                                + "\n3. Consultar curso."
                                + "\n4. Asignar notas."
                                + "\n5. Calcular promedio."
                                + "\n0. Cerrar programa.");
            opcion = leer.nextInt();
            
            switch(opcion){
                
                case 1:
                    if (indicadorEst==false){
                        
                        System.out.println("Digite el nombre del estudiante.");
                        String nombre = leer.next();
                        System.out.println("Digite el apellido del estudiante.");
                        String apellido = leer.next();
                        System.out.println("Digite el codigo del estudiante.");
                        int codigo = leer.nextInt();
                        
                        estudiante.registrar(nombre, apellido, codigo);
                        indicadorEst = true;
                    }
                    else System.out.println("Ya se registro un estudiante.");
                    break;
                    
                case 2:
                    if (indicadorEst==true){
                    
                        for (int i=0; i<5; i++){
                            
                            System.out.println("Digite el nombre del curso "+(i+1));
                            String nombre = leer.next();
                            System.out.println("Digite el codigo del curso "+(i+1));
                            int codigo = leer.nextInt();
                            System.out.println("Digite los creditos del curso "+(1+i));
                            int creditos = leer.nextInt();
                            
                            estudiante.registrarCurso(nombre, codigo, creditos);
                        }
                    }
                    else System.out.println("Debe registar un estudiante primero");
                    
                    break;
                    
                case 3:
                    if (indicadorEst == true){
                        System.out.println("Digite el codigo del curso a buscar.");
                        int codigo = leer.nextInt();
                        estudiante.ConsultarCurso(codigo);   
                    }
                    else System.out.println("No hay ningun estudiante inscrito, por ende ningun curso registrado.");
                    
                    break;
                    
                case 4:
                    if(indicadorEst == true){
                        System.out.println("Digite el codigo del curso al cual asignar la nota.");
                        int codigo = leer.nextInt();
                        System.out.println("Digite la nota del curso "+ codigo);
                        double nota = leer.nextDouble();
                        
                        estudiante.asignarNota(codigo, nota);
                    }
                    else System.out.println("Debe inscribir un estudiante y registrar los cursos primero.");                    
                    
                    break;
                    
                case 5:
                    if(indicadorEst == true){
                        double promedio = estudiante.calcularPromedio();
                        boolean prueba = estudiante.pruebaAcademica();
                        
                        if (prueba==true){
                            System.out.println("El estudiante"+ estudiante.obtenerNombre()+" "+estudiante.obtenerApellido() 
                            + "tuvo un promdedio de "+promedio+" por lo tanto se encuentra en prueba academica.");
                        }
                        else{
                            System.out.println("Felicidades, el estudiante " + estudiante.obtenerNombre()+" "+estudiante.obtenerApellido()+ " tuvo un promedio de "
                            +promedio+" por lo tanto no esta en prueba academica.");
                        }
                    }
                    else System.out.println("Debe inscribir un estudiante y registrar las notas primero.");
                    break;
            }
            
        }while(opcion!=0);
        
    }
    
}
