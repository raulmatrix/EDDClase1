
package eddclase22;

import java.util.Stack;


public class EDDClase22 {

    public static void main(String[] args) {
        Stack pilita = new Stack();
        pilita.push(10);
        pilita.push(15);
        pilita.push(6);
        pilita.push(30);
        pilita.push(50);
        pilita.push(12);
        
        System.out.println(pilita);
        
        pilita.pop();
        
        //es vacio
        System.out.println(pilita.isEmpty());
        
        //tamaño
        System.out.println("Tamaño de la pila: "
                +pilita.size());
        
        //cima
        System.out.println("Cima de la pila: "
                +pilita.peek());
        
        
    }
    
}
