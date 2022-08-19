
package eddclase20;

import java.util.LinkedList;


public class EDDClase20 {
    static int contMenores=0;
    static LinkedList<Persona> listaPersonas = new LinkedList<Persona>();
    public static void main(String[] args) {
       listaPersonas.add(new Persona("Menor",12));
       listaPersonas.add(new Persona("Menor",11));
       listaPersonas.add(new Persona("Adulto",23));
       listaPersonas.add(new Persona("Adulto",22));
       listaPersonas.add(new Persona("Adulto",39));
       
       Persona p1 = new Persona("Adulto", 45);
       insertarPersona(p1);
       
       mostrarLista();
    }
    
    public static void insertarPersona(Persona p){
        int indice=0;
        if((p.getEdad()>=10)&&(p.getEdad()<=20)){
            indice = contarMenores();
            listaPersonas.add(indice, p);
        }
        else{
            listaPersonas.add(p);
        }
    }
    
    public static int contarMenores(){
        for(int i=0;i<listaPersonas.size();i++){
            if((listaPersonas.get(i).getEdad()>=10)&&(listaPersonas.get(i).getEdad()<=20)){
                contMenores++;
            }
        }
        return contMenores;
    }
    
    public static void mostrarLista(){
        for(int i=0; i<listaPersonas.size();i++){
            System.out.println("Tipo: "
                    +listaPersonas.get(i).getTipo()
                    +" Edad: "+listaPersonas.get(i).getEdad());
        }
    }
    
    
    
    
}
