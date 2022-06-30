
package eddclase17;

public class Paciente {
   String nombre, apellido; 
   int carnet;

    public Paciente(String nombre, String apellido, int carnet) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }
   
   
}
