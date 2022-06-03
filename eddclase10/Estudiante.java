
package eddclase10;

public class Estudiante {
    /*atributos*/
    String nombre,apellidos;
    String codEst;
    String carrera;

    //metodos
    public Estudiante(String nombre, String apellidos, String codEst, String carrera) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codEst = codEst;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodEst() {
        return codEst;
    }

    public void setCodEst(String codEst) {
        this.codEst = codEst;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public boolean estaInscrito(String valor){
        boolean respuesta;//variable local
        if(valor=="si"){
            respuesta=true;
        }else{
            respuesta=false;
        }
        return respuesta;
    }
    
}
