package estructuradedatos;

/**
 *
 * @author Marcos Altamirano
 */
public class MainFG {

    public static void main(String[] args) {
        FigurasGeometricas t = new Triangulo();
        FigurasGeometricas c = new Cuadrado();
        FigurasGeometricas r = new Rectangulo();

        String TR = "triangulo";
        String CU = "cuadrado";
        String RE = "rectangulo";
      
        
       System.out.printf("%10s\n%10s%10s\n%10s%2d\n%10s%5.2f\n%10s%5.2f\n\n",TR,
               "El color es ",t.colores(),"numero de esquinas=",t.numEsquinas(),
               "el area es ->",t.area(),"el perimetro es ",t.perimetro());
       System.out.printf("%10s\n%10s%10s\n%10s%2d\n%10s%5.2f\n%10s%5.2f\n\n",CU,
               "El color es ",c.colores(),"numero de esquinas=",c.numEsquinas(),
               "el area es ->",c.area(),"el perimetro es ",c.perimetro());
       System.out.printf("%10s\n%10s%10s\n%10s%2d\n%10s%5.2f\n%10s%5.2f\n",RE,
               "El color es ",r.colores(),"numero de esquinas=",r.numEsquinas(),
               "el area es ->",r.area(),"el perimetro es ",r.perimetro());
//System.out.println(""+TR + " " + t.colores() + " "+ t.area()+ " "+ t.perimetro());
       //System.out.printf("%10s%2d\n","numero de esquinas=",c.numEsquinas());
       //System.out.println(""+CU + " " + c.numEsquinas() + " " + c.colores() + " "+ c.area()+ " "+ c.perimetro());
       //System.out.printf("%10s%2d\n","numero de esquinas=",r.numEsquinas());
       //System.out.println(""+RE + " " + r.numEsquinas() + " " + r.colores() + " "+ r.area()+ " "+ r.perimetro());
    }

}
