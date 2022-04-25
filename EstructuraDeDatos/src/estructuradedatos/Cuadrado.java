package estructuradedatos;

import java.util.Scanner;

/**
 *
 * @author Marcos Altamirano
 */
public class Cuadrado extends FigurasGeometricas {

    public int numEsquinas() {

        int ne = 4;
        //System.out.println("el numero de esquinas es = " + ne);
        return ne;
    }

    public float area() {
        int l;
        float x;
        l = (int)(Math.random()*100);
        
        x = (l*l) ;
        //System.out.println(x);
        return x;
    }

    public double perimetro() {
        double la, lb, lc, ld, x;
        Scanner tecla = new Scanner(System.in);
        la = (Math.random() * 100);

        lb = (Math.random() * 100);

        lc = (Math.random() * 100);
        ld = (Math.random() * 100);
        x = la + lb + lc + ld;
        //System.out.println("el perimetro es " + x);

        return x;
    }

    public String colores() {
        String x;
        x = ("azul");
        //System.out.println("el color es ->" + x);
        return x;
    }

}
