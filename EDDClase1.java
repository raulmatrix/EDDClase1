
package eddclase1;

public class EDDClase1 {

    
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        //comentarios se escriben asi
        /*Tambien se escriben
        asi*/
        
        int edad = 15;
        String tipoColor = "negro";
        String nombrePerro = "cachuchin";
        
        //tipos de datos
        
        int edad2 = 20;
        long fortuna = 1000000;
        char caracter = 'c';
        boolean siLlego = true; //tambien false
        String nombreCompleto = "Raul Vera";
        
        float valor1 = 1;
        double valor2 = 1;
        
        System.out.println("EL valor del entero: "+edad2);
        System.out.println("El valor del booleano es: "+siLlego);
        System.out.println("El valor del float es: "+valor1);
        System.out.println("El valor del double es: "+valor2);
        
        //operadores
        
        //suma
        int valor3 = 10;
        int valor4 = 12;
        int valorFinal = valor3 + valor4;
        System.out.println("Final: "+valorFinal);
        
        int valor5 = 7;
        int valor6 = 2;
        
        double valorFinal2 = valor5 + valor6;
        
        System.out.println("Final: "+valorFinal2);
        
        //resta
        System.out.println("La resta es: "+(valor5-valor6));
        
        //multiplicacion
        System.out.println("La multiplicacion es: "+(valor5*valor6));
        
        //division
        double valorFinal3 = valor6/valor5;
        System.out.println("La division es: "+valorFinal3);
        
        //operadores comparacion
        
        System.out.println(" "+(valor5==valor6));
        
        System.out.println(valor5!= valor6);
        
        System.out.println(valor5 >= valor6);
        
    }
    
}
