
package eddclase25;

public class EDDClase25 {

    public static void main(String[] args) {
        System.out.println("La suma de N: 4"
                +" es="+sumarNumeros(4));
        //segundo ejercicio
        int [] edades = {15,12,20,30,14,10,100};
        recorrerArreglo(edades, 0);
        
        //ejercicio 3
        String palabra = "Hola";
        int longitud2 = palabra.length();
        invertirPalabra(palabra,longitud2-1);
    }
    
    //ejercicio 1
    public static int sumarNumeros(int numero){
        //caso base
        if(numero==1){
            return 1;
        }
        //caso recursivo
        else{
            return numero+sumarNumeros(numero-1);
        }
    }
    //metodo recursivo para recorrer un arreglo
    public static void recorrerArreglo(int[]arreglo,int indice){
        //caso base
        if(indice==(arreglo.length-1)){
            System.out.print(arreglo[indice]+",");
        }
        //caso recursivo
        else{
            System.out.print(arreglo[indice]+",");
            recorrerArreglo(arreglo, indice+1);
        }
        
       
    }
     //terce ejercicio, invertir palabra con recursividad
     public static void invertirPalabra(String palabra,int longitud){
            //caso recursivo
            if(longitud!=0){
                System.out.print(palabra.charAt(longitud));
                invertirPalabra(palabra, longitud-1);
            }else{
                System.out.print(palabra.charAt(0));
            }
        }
    
    
}
