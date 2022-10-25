
package eddclase28;

public class EDDClase28 {

   
    public static void main(String[] args) {
        EDDClase28 hanoi = new EDDClase28();
        hanoi.hanoi(7, 1, 2, 3);
    }
    
    public void hanoi(int n,int torre1,int torre2,int torre3){
        //caso base
        if(n==1){
            System.out.println("Mover disco de torre: "
                    +torre1+" a torre: "+torre3);
         
        }
        else{//parte recursiva
            hanoi(n-1, torre1, torre3, torre2);
            System.out.println("Mover disco de torre: "
                    +torre1+" a torre: "+torre3);
            hanoi(n-1, torre2, torre1, torre3);
        }
    }
    
}
