
import estructuradedatos.vector;




public class vector2 {
    public  class Ordenar {
    static int [] vec = {124, 222, 55, 11, 33};

    void ordenaras (int [] v, int num) {
        if (num > 1) {
            for (int f = 0 ; f < num - 1 ; f++)
                if (v [f] > v [f + 1]) {
                    int aux = v [f];
                    v [f] = v [f + 1];
                    v [f + 1] = aux;
                }
            ordenaras (v, num - 1);
        }
    }
   }

    void imprimir () {
        for (int f = 0 ; f < vec.length ; f++)
            System.out.print (vec [f] + "  ");
        System.out.println("\n");
    }
    void inverso (int [] v, int num) {
        if (num > 1) {
            for (int f = 0 ; f < num - 1 ; f++)
                if (v [f] < v [f + 1]) {
                    int aux = v [f];
                    v [f] = v [f + 1];
                    v [f + 1] = aux;
                }
            inverso (v, num - 1);
        }
    }
   
    public static void main (String [] ar)  {
        vector r = new vector();
        System.out.println("Vector Original");
       
        r.imprimir ();
        System.out.println("Vector Ascendente");
        r.ordenaras (vec, vec.length);
        r.imprimir ();
        System.out.println("Vector Descendente");
        r.inverso(vec, vec.length);
        r.imprimir();
   
    }
        
    
}

