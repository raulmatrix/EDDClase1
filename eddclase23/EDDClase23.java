
package eddclase23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Stack;


public class EDDClase23 {
static Stack pilaPeriodico = new Stack();
static LinkedList <Date>ordenar = new LinkedList<Date>();
static Date aux;
    public static void main(String[] args) throws ParseException {
        
        
        pilaPeriodico.push(new Periodico(2022, 8, 15));
        pilaPeriodico.push(new Periodico(2022,7,14));
        pilaPeriodico.push(new Periodico(2022,1,12));
        pilaPeriodico.push(new Periodico(2022,2,10));
        pilaPeriodico.push(new Periodico(2022,3,14));
        pilaPeriodico.push(new Periodico(2022,6,21));
        pilaPeriodico.push(new Periodico(2022,5,11));
        pilaPeriodico.push(new Periodico(2022,4,13));
        pilaPeriodico.push(new Periodico(2022,3,12));
        pilaPeriodico.push(new Periodico(2022,8,16));
        
        /*System.out.println("tam pilaPeriodico: "
                +pilaPeriodico.size());*/
        insertarArreglo();//inserta en un arreglo auxiliar
        
        ordenarPeriodicos();
        /*System.out.println("tam ordenado: "
                +ordenar.size());*/
        for(int i=0;i<ordenar.size();i++){
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");  
            String stringDate= formato.format(ordenar.get(i));  
            System.out.println(stringDate);
        }
        
    }
    //insercion en el linkedlist
    public static void insertarArreglo() throws ParseException{
       
        while(!pilaPeriodico.isEmpty()){
            Periodico p = (Periodico)pilaPeriodico.pop();
            String anio1 = p.getAnio()+"";
            String mes1 = p.getMes()+"";
            String dia1 = p.getDia()+"";
            String fechaCompleta = anio1+"-"+mes1+"-"+dia1;
            Date miFecha = p.volverFecha(fechaCompleta);
            
            ordenar.add(miFecha);
        }
    }
    
    public static void ordenarPeriodicos(){
        for(int i=0;(i<ordenar.size()-1);i++){
            for(int j=0;(j<ordenar.size()-1);j++){
                if(ordenar.get(j).after(ordenar.get(j+1))){
                    aux=ordenar.get(j);
                    ordenar.set(j,ordenar.get(j+1));
                    ordenar.set(j+1,aux);   
                }
            }
        }
    }
    
}
