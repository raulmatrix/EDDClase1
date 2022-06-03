
package eddclase13;


public class Auto {
    //atributos
    String marca;
    String modelo;
    String placa;
    int anio;

    public Auto(String marca, String modelo, String placa, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    @Override
    public String toString(){
      return "Marca: "+marca+" Modelo"+modelo+ " Año"+anio;  
    }
    
    
    
    
}
