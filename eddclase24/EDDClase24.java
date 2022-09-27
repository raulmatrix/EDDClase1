
package eddclase24;

import java.util.LinkedList;
import java.util.Queue;


public class EDDClase24 {

    static Queue<Usuario> filaNuevo = new LinkedList<Usuario>();
    static Queue<Usuario> filaRenovacion = new LinkedList<Usuario>();
            
    public static void main(String[] args) {
        
        filaNuevo.add(new Usuario(12, "Jorge", "lopez", "nuevo"));
        filaNuevo.add(new Usuario(14, "Alicia", "Campero", "nuevo"));
        filaRenovacion.add(new Usuario(15, "Antonio", "Sejas", "renovacion"));
        filaNuevo.add(new Usuario(16, "Omar", "Santos", "nuevo"));
        filaRenovacion.add(new Usuario(19, "Amelia", "Correa", "renovacion"));
        filaRenovacion.add(new Usuario(20, "Amelia", "Correa", "renovacion"));
        filaRenovacion.add(new Usuario(21, "Amelia", "Correa", "renovacion"));
        filaRenovacion.add(new Usuario(23, "Amelia", "Correa", "renovacion"));
        
        /*System.out.println("Proximo atencion: "+filaNuevo.peek().getNumTicket());
        System.out.println("Atendido: "+filaNuevo.remove().getNumTicket());
        System.out.println("Proximo atencion: "+filaNuevo.peek().getNumTicket());
        */
        while((!filaNuevo.isEmpty())||(!filaRenovacion.isEmpty())){
            atencionSegip();
        }
        
    }
    
    public static void atencionSegip(){
        if(!filaNuevo.isEmpty()){
            System.out.println("Usuario Nuevo Atendido: "+filaNuevo.remove().getNumTicket());
        }
        if(!filaRenovacion.isEmpty()){
            System.out.println("Usuario Renovacion Atendido: "+filaRenovacion.remove().getNumTicket());
            if(!filaRenovacion.isEmpty()){
            System.out.println("Usuario Renovacion Atendido: "+filaRenovacion.remove().getNumTicket());
            }
        }
        
    } 
    
}
