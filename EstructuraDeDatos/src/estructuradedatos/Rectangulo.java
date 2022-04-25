
package estructuradedatos;

import java.util.Scanner;

/**
 *
 * @author Marcos Altamirano
 */
public class Rectangulo extends FigurasGeometricas {
     public int numEsquinas(){
        
        int ne = 4;
        return ne;
    }
    
    public float area(){
        int b,h;
        float x;
        b=(int)(Math.random()*100);
        h=(int)(Math.random()*100);
        x= (b*h);
        //System.out.println(x);
        return x;
    }
    
    public double perimetro(){
        double la,lb,lc,ld,x;
        Scanner tecla = new Scanner(System.in);
        la= (Math.random()*100);
     
        lb= (Math.random()*100);
         
        lc= (Math.random()*100);
          ld= (Math.random()*100);
         x= la+lb+lc+ld;
         //System.out.println("el perimetro es "+x);
         
         return x;
    }
    
    public String colores(){
    String x;
       x= ("amarillo");
        //System.out.println("el color es ->"+x);
        return x;
    }
    
}
