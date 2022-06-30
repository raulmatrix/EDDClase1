
package eddclase18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class EDDClase18 {

   
    public static void main(String[] args) {
        /*
        for(int i=0;(i<arreglo.length-1);i++){
            for(int j=0;(j<arreglo.length-1);j++){
                if(arreglo[j]>arreglo[j+1]){
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }*/
       ArrayList<Integer> edades = new ArrayList<Integer>();
       
       edades.add(15);
       edades.add(20);
       edades.add(5);
       edades.add(40);
       edades.add(12);
       edades.add(80);
       edades.add(23);
       edades.add(9);
       edades.add(6);
       
       Collections.sort(edades);
       
        System.out.println(edades);
        
       //mostrar
       /*for(int i=0;i<edades.size();i++){
           System.out.println(edades.get(i));
       }*/
       
       //inversa
       Comparator<Integer> comparador = Collections.reverseOrder();
       Collections.sort(edades, comparador);
       System.out.println(edades);
    }
    
}
