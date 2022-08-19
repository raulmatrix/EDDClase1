
package eddclase21;

public class Auto {
    String tipoAuto;
    String tipoCombustible;
    int cantCombustible;
    boolean atencion;

    public Auto(String tipoAuto, String tipoCombustible, int cantCombustible, boolean atencion) {
        this.tipoAuto = tipoAuto;
        this.tipoCombustible = tipoCombustible;
        this.cantCombustible = cantCombustible;
        this.atencion = atencion;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getCantCombustible() {
        return cantCombustible;
    }

    public void setCantCombustible(int cantCombustible) {
        this.cantCombustible = cantCombustible;
    }

    public boolean isAtencion() {
        return atencion;
    }

    public void setAtencion(boolean atencion) {
        this.atencion = atencion;
    }

    
    
}
