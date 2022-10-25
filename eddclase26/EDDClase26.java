
package eddclase26;

public class EDDClase26 {

    public static void main(String[] args) {
    
        int numero = 7;
        int factorial = factorial(numero);
        System.out.println("EL factorial del numero: "
                +numero+" es = "+factorial);
    }
    
    public static int factorial(int num){
        //case base
        if(num==1){
            return 1;
        }
        else{//parte recursiva
            return num*factorial(num-1);
        }
    }
    
}
