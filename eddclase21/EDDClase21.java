
package eddclase21;

import java.util.LinkedList;

public class EDDClase21 {
    static int cantGasolina = 500;
    static int cantGas = 5000;
    static int cantDiesel = 800;
    static LinkedList<Auto>listaAutos = new LinkedList<>();
    public static void main(String[] args) {
      
       
       listaAutos.add(new Auto("vagoneta", "gasolina", 80, false));
       listaAutos.add(new Auto("camion", "diesel", 450, false));
       listaAutos.add(new Auto("vagoneta", "gasolina", 120, false));
       listaAutos.add(new Auto("camioneta", "gasolina", 100, false));
       listaAutos.add(new Auto("tractor", "diesel", 380, false));
       listaAutos.add(new Auto("vagoneta", "gas", 2000, false));
       listaAutos.add(new Auto("vagoneta", "gas", 2000, false));
       listaAutos.add(new Auto("vagoneta", "gas", 2000, false));
       listaAutos.add(new Auto("camioneta", "gasolina", 210, false));
       
       
    }
    
    public static void atencionAutos(LinkedList lista){
        for(int i=0; i<listaAutos.size();i++){
            if(listaAutos.get(i).getTipoCombustible()=="gasolina"){
                if((listaAutos.get(i).getCantCombustible())<=cantGasolina){
                cantGasolina = cantGasolina - listaAutos.get(i).getCantCombustible();
                listaAutos.get(i).setAtencion(true);
                }
                
            }else 
                if(listaAutos.get(i).getTipoCombustible()=="gas"){
            
            }else{
            
            }
        }
    }
    
    public static void mostrarAtencion(){
        System.out.println("--Autos Atendidos--");
        for(int i=0; i<listaAutos.size();i++){
            if(listaAutos.get(i).isAtencion()){
            System.out.println("Auto: "
                    +listaAutos.get(i).getTipoAuto()
                    +listaAutos.get(i).getCantCombustible());
            }
        }
        System.out.println("--Autos Sin Atender--");
        for(int i=0; i<listaAutos.size();i++){
            if(!listaAutos.get(i).isAtencion()){
            System.out.println("Auto: "
                    +listaAutos.get(i).getTipoAuto());
                    
            }
        }
    }
    
}
