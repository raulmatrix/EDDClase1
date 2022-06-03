
package eddclase11;

public class EDDClase11 {

    
    public static void main(String[] args) {
        
        int numeros[]=new int[20];
        //adicionar
        /*numeros[0]=10;numeros[1]=20;
        numeros[2]=30;numeros[3]=40;
        numeros[4]=50;numeros[5]=60;
        numeros[6]=70;numeros[7]=80;
        numeros[8]=90;numeros[9]=100;*/
        
        int valor=10;//valor inicial
        for(int i=0;i<numeros.length;i++){
            numeros[i]=valor;
            valor=valor+10;
            //System.out.print(numeros[i]+"-");
        }
        
        /*System.out.println("El tamaño del arreglo numeros es:"
                +numeros.length);
        
        //modificar valor
        System.out.println(""+numeros[2]);*/
        
        //busquedas
        
        int vbusqueda=50;
        String mensaje="No fue encontrado";
        for(int j=0;j<numeros.length;j++){
           if(numeros[j]==vbusqueda){
               mensaje="Fue encontrado";
               break;
           }   
        }
        System.out.println(mensaje);
        
    }
    
}
