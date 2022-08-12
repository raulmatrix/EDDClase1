
package eddclase19;

import java.util.LinkedList;

public class EDDClase19 {

    public static void main(String[] args) {
        //listas enlazadas
        LinkedList listaAutos = new LinkedList();
        /*lista.add(10);
        lista.add(5);
        lista.add(20);
        lista.add(7);
        lista.add(30);
        lista.add(50);
        lista.add(2, 35);
        
        System.out.println(lista);
        
        //eliminar
        lista.remove(2);
        System.out.println(lista);
        
        //recorrido
        for(int i=0;i<lista.size();i++){
            System.out.print(lista.get(i)+"-");
        }
        //busqueda
        System.out.println(lista.contains(30));*/
        //insercion de los autos del ejemplo
        listaAutos.add("pequeño");
        listaAutos.add("pequeño");
        listaAutos.add("pequeño");
        listaAutos.add("pequeño");
        listaAutos.add("mediano");
        listaAutos.add("mediano");
        listaAutos.add("grande");
        listaAutos.add("grande");
        
        int contP=0;//pequeño
        int contM=0;//mediano
        System.out.println(listaAutos);
        if(!listaAutos.isEmpty()){
            for(int i=0;i<listaAutos.size();i++){
               if(listaAutos.get(i)=="pequeño"){
                   contP++;
               }else if(listaAutos.get(i)=="mediano"){
                   contM++;
               }
            }
        }
        
        //insercion respectiva
        
        listaAutos.add(contP, "pequeño");
        
        System.out.println(listaAutos);
        
        listaAutos.add(contM+contP, "mediano");
        System.out.println(listaAutos);
        
    }
    
}