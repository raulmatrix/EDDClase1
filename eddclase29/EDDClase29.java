
package eddclase29;

public class EDDClase29 {

   
    public static void main(String[] args) {
       
        /*int []a = {1,3,5,7,9,11};
        int []b = {10,3,5,7,9,11,25,24};
        
        if(a.length==b.length){
            System.out.println(arreglosIguales(a, b, 0));
        }else{
            System.out.println(false);
        }*/
        
        int ini = 1;
        int fin = 30;
        int mult = 7;
        int valor = 0;
        
        multiplos(ini, fin, mult, valor);
        
        
    }
    
    public static boolean arreglosIguales(int[]a,int[]b,int indice){
        if(indice==a.length){
            return true;
        }else if(a[indice]!=b[indice]){
            return false;
        }else{
            return arreglosIguales(a, b, indice+1);
        }
    }
    
    public  static void multiplos(int inicio, int fin, int multiplo,int valor){
        if(inicio==fin){
            System.out.println(valor);
        }else if(inicio%multiplo==0){
            System.out.println(inicio);
            multiplos(inicio+1, fin, multiplo, valor);
        }else{
            multiplos(inicio+1, fin, multiplo, valor);
        }
    }
    
    
    
    
}
