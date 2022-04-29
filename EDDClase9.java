
package eddclase9;
public class EDDClase9 {

    public static void main(String[] args) {
        
        int x=0;
        int y=1;
        int z=0;
        int tam=5;
        for(int i=0;i<tam;i++){
            System.out.print(x+",");
            z=x+y;
            x=y;
            y=z;
        }
    }
    
}
