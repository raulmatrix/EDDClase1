
package eddclase5;

import java.util.Scanner;

public class EDDClase5 {

    public static void main(String[] args) {
        //if-else
        /*int num1=10;
        int num2=15;
        if(num1<num2){
            System.out.println("El numero 1 es menor");
        }else{
            System.out.println("El numero 2 es mayor");
        }*/
        /*Scanner entrada = new Scanner(System.in);
        int valor;
        System.out.println("Escriba un numero...");
        valor=entrada.nextInt();
        System.out.println("El valor es: "+valor);*/
        //capturar textos
        /*Scanner entrada = new Scanner(System.in);
        String texto;
        System.out.println("Escriba su nombre...");
        texto=entrada.nextLine();
        System.out.println("El valor es: "+texto);
        */
        
        //ejercicio 1 16/03/2022
        /*
        int num1=155;
        int num2=230;
        int num3=135;
        
        if((num1>num2)&&(num1>num3)){
            System.out.println("El numero 1 es mayor");
        }else if((num2>num1)&&(num2>num3)){
            System.out.println("El num 2 es mayor");
        }else{
            System.out.println("El num 3 es mayor");
        }*/
        
        //ejercicio 2
        
        /*Scanner ent = new Scanner(System.in);
        int valor;
        System.out.println("Ingrese un numero del 1 al 20");
        valor=ent.nextInt();
        
        if((valor>0)&&(valor<=20)){//rango 1 a 20
            if(valor%2==0){
                System.out.println("El numero ingresado es par");
            }else{
                System.out.println("El numero ingresado es impar");
            }
        }else{
            System.out.println("Este numero no esta en el rango de 1 a 20, vuelva a escribir");
        }*/
        
        //ejercicio 3
        /*int valor1=20;
        int valor2=10;
        String operacion="-"; //+ o - o * o /
        
        if(operacion.equals("+")){ 
            System.out.println("Suma: "+(valor1+valor2));
        }else if(operacion.equals("-")){
            System.out.println("Resta: "
                    +(valor1-valor2));
        }else if(operacion.equals("*")){
            System.out.println("Multiplicacion: "
                    +(valor1*valor2));
        }else{
            System.out.println("Division: "
                    +(valor1/valor2));
        }*/
        
        //ejercicio 4
        boolean entrada = true; //si es false, no ingresa
        int edad = 25; //>21
        double estatura = 1.50; //>=1.50
        
        if(entrada){
            if((edad>21)&&(estatura>=1.50)){
                System.out.println("Puede ingresar");
            }
            else{
                System.out.println("Usted no cumple los requisitos");
            }
        }else{
            System.out.println("Usted no tiene entrada al evento");
        }
        
    }
    
}
