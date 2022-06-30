
package eddclase16;

import java.util.ArrayList;

public class EDDClase16 {

    public static void main(String[] args) {
        ArrayList <Auto> autos = new ArrayList<Auto>();
        //adicionando autos
        autos.add(new Auto("ERT-152", "Toyota", "Hilux", 20000));
        autos.add(new Auto("WER-147", "Suzuki", "Celerio", 5000));
        autos.add(new Auto("WSD-1568", "Toyota", "Corolla", 30000));
        autos.add(new Auto("OPQ-1569", "Toyota", "Ipsum", 35000));
        autos.add(new Auto("QMK-123", "Nissan", "Condor", 55000));
        autos.add(new Auto("QMJ-1585", "Changan", "MiChangan", 20000));
        
        //recorrido
        for(int i=0;i<autos.size();i++){
            System.out.println("Placa: "+autos.get(i).getPlaca());
            System.out.println("Marca: "+autos.get(i).getMarca());
            System.out.println("Modelo: "+autos.get(i).getModelo());
            System.out.println("Kilometraje: "+autos.get(i).getCantKm());
            System.out.println("---------------------");
        }
        
        //Busqueda
        String marcaBusqueda = "Suzuki";
        for(int j=0;j<autos.size();j++){
            if(autos.get(j).getMarca().equals(marcaBusqueda)){
                System.out.println("El auto fue encontrado");
            }
        }
        
        //mostrar el auto con mayor Km
        Auto mayor = autos.get(0);
        for(int x=0;x<autos.size();x++){
            if(autos.get(x).getCantKm()>mayor.getCantKm()){
                mayor=autos.get(x);
            }
        }
        System.out.println("El auto con mayor Kilometraje es: "
                +mayor.getCantKm());
    }
    
}
