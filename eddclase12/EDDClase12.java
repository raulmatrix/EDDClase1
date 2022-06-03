
package eddclase12;

public class EDDClase12 {

    public static void main(String[] args) {
        //int arreglo[]=new int[5];
        int arreglo[]={10,8,2,1,4,2};
        int aux;//esta sirve para intercambio
        
        //ordenamiento
        for(int i=0;(i<arreglo.length-1);i++){
            for(int j=0;(j<arreglo.length-1);j++){
                if(arreglo[j]>arreglo[j+1]){
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        
        //mostrando arreglo ordenado
        for(int z=0;z<arreglo.length;z++){
            System.out.print(arreglo[z]+"-");
        }
        
    }
    
}
