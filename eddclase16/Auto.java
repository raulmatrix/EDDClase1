
package eddclase16;

public class Auto {
    private String placa;
    private String marca;
    private String modelo;
    private int cantKm;

    public Auto(String placa, String marca, String modelo, int cantKm) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cantKm = cantKm;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public int getCantKm() {
        return cantKm;
    }

    public void setCantKm(int cantKm) {
        this.cantKm = cantKm;
    }
    
    
}
