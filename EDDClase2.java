
package eddclase2;

public class EDDClase2 {

    public static void main(String[] args) {
        
        /*boolean x,y,z;
        
        x=true;
        y=false;
        z=true;
        
        System.out.println((x && y) || (x && z));
        
        System.out.println((x || !y) && (!x || z));
        
        System.out.println(!(x || y) && z);
        */
        //ejercicio 2
        
        boolean x,y,z,w;
        x=true;
        y=true;
        z=false;
        w=false;
        
        //d
        System.out.println(x && y && w || z || x);
        
        //c
        System.out.println(!(w || !y) && x || z);
        
        //ejercicio 3
        
        int valor=0;
        valor=23;
        valor+=10; //valor = valor+10 =>33
        System.out.println("Resultado a="+ --valor);//32
        System.out.println("Resultado b="+ valor++);//32
        System.out.println("Resultado c="+ --valor);//32
        System.out.println("Resultado d="+ valor--);//34
        System.out.println("Resultado e="+ valor);//33
        
        //ejercicio 4
        
        int cantidad = 3;
        int unidades = 12;
        double precio = 5.4;
        double importe;
        double total;
        double iva;
        importe = cantidad*unidades*precio;
        total = importe*1.21;
        iva = importe * 0.21;
        
        //impresiones
        
        System.out.println("Factura");
        System.out.println("Cantidad: "+ cantidad);
        System.out.println("Unidades: "+ unidades);
        System.out.println("Precio: "+ precio);
        System.out.println("Importe: "+ importe);
        System.out.println("Iva: "+ iva);
        System.out.println("Total: "+total);
    }
    
}
