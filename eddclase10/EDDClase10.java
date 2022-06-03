
package eddclase10;


public class EDDClase10 {

    
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Julia", "Rocha", "SIS-001", "Sistemas Informaticos");
        System.out.println("El estudiante es de la carrera de: "
                +est1.getCarrera());
        
        Estudiante est2 = new Estudiante("Roger", "Guzman", "SIS-002", "Sis Inf");
        boolean inscripcion=est2.estaInscrito("si");
        
        //arreglos
        
        String dias[]={"lunes","martes","miercoles","jueves"
                ,"viernes","sabado","domingo"};
        
        System.out.println("la posicion 2 es: "
                +dias[2]);
        
        Estudiante arregloEst[]=new Estudiante[3];
        arregloEst[0]=new Estudiante("Raul", "Vera", "SIS-50", "Sis Inf");
        System.out.println("Los datos del estudiante en posicion 0 es: "
                +arregloEst[0]);
    }
    
}
