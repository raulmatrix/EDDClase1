
package eddclase8;


public class EDDClase8 {

    public static void main(String[] args) {
        
        //factorial
        int fact=1;
        int numero=5;
        for(int i=numero;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("El factorial de "
                +numero+"! = "+fact);
        /*2:
        fact:120
        i:0
        resul-fact=120
        */
        
        //fibonacci
       /*
       int x=0, y=1, z=0; //z la suma de actualizacion de valor
       int tam=5;
       
       for(int i=0;i<tam;i++){
           System.out.print(x+",");
           z=x+y;
           x=y;
           y=z;
       }*/
       //x=5;
       //y=8;
       //z=8;
       //i=5;
       //resultado 0,1,1,2,3
        
    }
    
}
