
package eddclase27;

public class EDDClase27 {

    public static void main(String[] args) {
        int numero = 8;
        //La forma 1 de secuencia con valor
        System.out.println("El factorial valor: "
                +sucecionFibonacci(numero-1));
        //la forma 2 de ver la secuencia
        for(int i=0;i<numero; i++){
            System.out.print(sucecionFibonacci(i)+",");
        }
    }
    
    public static int sucecionFibonacci(int num){
        //case base
        if(num==0 || num==1){
            return num;
        }else{//caso recursivo
            return sucecionFibonacci(num-1)
                    +sucecionFibonacci(num-2);
        }
    }
    
}
