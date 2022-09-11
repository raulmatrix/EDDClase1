
package eddclase23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Periodico {
    int anio;
    int mes;
    int dia;

    public Periodico(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public Date volverFecha(String fecha) throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha1 = formato.parse(fecha);
        return fecha1;
    }
    
    
}
