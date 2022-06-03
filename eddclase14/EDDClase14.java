
package eddclase14;

public class EDDClase14 {

    public static void main(String[] args) {
       //ejercicio 1
       /* int arreglo[]={20,15,17,30,40,12,15,14,20,35,20,10};
        int aux;//esta sirve para intercambio
        
        //ordenamiento
        for(int i=0;(i<arreglo.length-1);i++){
            for(int j=0;(j<arreglo.length-1);j++){
                if(arreglo[j]>arreglo[j+1]){
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        
        //mostrando arreglo ordenado
        for(int z=0;z<arreglo.length;z++){
            System.out.print(arreglo[z]+"-");
        }
        
        System.out.println("El estudiante con mayor edad es:"
                +(arreglo[arreglo.length-1]));
    
           */
       
       //ejercicio 2
       /*
       int A[]={4,8,15,3,24,14,5,10,7,9,30,40,15,70};
       
       int cantPares=0;
       int cantImpares=0;
       //obteniendo la cantidad de pares e impares
       for(int i=0;i<A.length;i++){
           if(A[i]%2==0){
               cantPares++;
           }else{
               cantImpares++;
           }
       }
       
       //creando los arreglos B,C
       int indiceB=0;
       int indiceC=0;
       int B[]=new int[cantPares];//numeros pares
       int C[]=new int[cantImpares];//numeros impares
       //insertando los valores
       for(int j=0;j<A.length;j++){
           if(A[j]%2==0){
               B[indiceB]=A[j];
               indiceB++;
           }else{
               C[indiceC]=A[j];
               indiceC++;
           }
       }
       
        System.out.println("El tamaño de B es: "+B.length);
        System.out.println("El tamaño de C es "+C.length);
        //mostrando los valores
        for(int x=0;x<B.length;x++){
            System.out.print("-"+B[x]);
        }
        System.out.println("--------------");
        for(int z=0;z<C.length;z++){
            System.out.print("-"+C[z]);
        }*/
       
       //ejercicio 4
       
       Estudiante arreglo[]=new Estudiante[5];
       arreglo[0]=new Estudiante("Jose", "Perez");
       arreglo[1]=new Estudiante("Erlinda", "Choque");
       arreglo[2]=new Estudiante("Chabelo", "Chavez");
       arreglo[3]=new Estudiante("Ignacio", "Mena");
       arreglo[4]=new Estudiante("Pamela", "Arnez");
       
       //recorrido del arreglo
       String nombBusqueda="Ignacio";
       String apeBusqueda="Mena";
       
       for(int i=0;i<arreglo.length;i++){
           if((arreglo[i].getNombre()==nombBusqueda)&&(arreglo[i].getApellido()==apeBusqueda)){
               System.out.println("El estudiante fue encontrado");
               System.out.println("La indice del elemento es: "
                       +i);
               break;
           }
           
       }
       
       
       
        }

    
}
