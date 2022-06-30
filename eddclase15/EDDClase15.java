
package eddclase15;

import java.util.ArrayList;

public class EDDClase15 {

  
    public static void main(String[] args) {
        //ArrayList creacion
        
        ArrayList<Integer> edades = new ArrayList<Integer>();
        edades.add(20);//insertar datos al final
        edades.add(15);
        edades.add(35);
        
        edades.add(1, 18);//add con indice elegido
        
        
        System.out.println(edades);
        
//acceder a un elemento
        System.out.println(edades.get(1));
        
//tamaño del arraylist
        System.out.println("El tamaño es: "+edades.size());
                
        //si esta vacio
        
        System.out.println("El arreglo esta vacio? "
                +edades.isEmpty());
        
        //propiedades
        //busqueda
        System.out.println(edades.contains(35));
        
        if(edades.contains(35)){
            System.out.println("El elemento fue encontrado");
        }else{
            System.out.println("El elemento no fue encontrado");
        }
        //encontrar la posicion en la cual se encuentra
        System.out.println(edades.indexOf(50));
        
        //eliminar
        edades.remove(1);
        edades.remove(new Integer(35));
        System.out.println(edades);
        
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Jose");
        nombres.add("Alicia");
        nombres.add("Pedro");
        
       
        
        /*nombres.remove("Alicia");
        nombres.remove("Pedro");*/
        
        nombres.set(1, "Bernardo");
        
        System.out.println(nombres);
        
        
    }
    
}
