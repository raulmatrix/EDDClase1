
package eddclase13;

public class EDDClase13 {

    public static void main(String[] args) {
      
        
        Auto auto1 = new Auto("Suzuki", "Celerio", "ERT125", 2016);
        Auto auto2 = new Auto("Toyota", "Corolla", "TGE479", 2018);
        
        Auto arregloAutos[]=new Auto[4];
        arregloAutos[0] = auto1;
        arregloAutos[1] = auto2;
        arregloAutos[2] = new Auto("Toyota", "Hilux", "PTE475", 2010);
        arregloAutos[3] = new Auto("Nissan", "Atlas", "ERT568", 2008);
        
        //recorrido
        for(int i=0;i<arregloAutos.length;i++){
            System.out.println("-> Marca: "+arregloAutos[i].getMarca()+" Modelo: "+arregloAutos[i].getModelo()+" Año: "+arregloAutos[i].getAnio());
        }
        System.out.println("-------------");    
        //segundo recorrido
        /*for(int j=0;j<arregloAutos.length;j++){
            System.out.println("-"+arregloAutos[j].toString());
        }*/
        
        //cambios en datos
        String modeloBuscar = "Toyota";
        int anioBuscar = 2010;
        int anioModificar = 2011;
        for(int j=0;j<arregloAutos.length;j++){
            //System.out.println("Ingresando a modificar");
            if((arregloAutos[j].getMarca()==modeloBuscar)&&((arregloAutos[j].getAnio()==anioBuscar))){
                arregloAutos[j].setAnio(anioModificar);
                System.out.println(arregloAutos[j].getAnio());
                break;
            }
        }
        
        
    }
    
    int arregloEntero[]=new int[5];
    
    
}
