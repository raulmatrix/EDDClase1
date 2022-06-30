
package eddclase17;

import java.util.ArrayList;

public class EDDClase17 {

    public static void main(String[] args) {
        ArrayList<Paciente> listaAtencion=new ArrayList<>();
        //insercion de datos
        listaAtencion.add(new Paciente("Jorge", "Herbas", 4589635));
        listaAtencion.add(new Paciente("Amelia", "Rojas", 4525875));
        listaAtencion.add(new Paciente("Eduardo", "Castillo", 7896558));
        listaAtencion.add(new Paciente("Rianed", "Montero", 4785634));
        listaAtencion.add(new Paciente("Antonio", "Merida", 3256879));
    
        //atencion de pacientes
        for(int i=0;i<listaAtencion.size();i++){
            System.out.println((i+1)+"."
                    +listaAtencion.get(i).getNombre()+" "
                    +listaAtencion.get(i).getApellido());
        }
    }  
    
}
