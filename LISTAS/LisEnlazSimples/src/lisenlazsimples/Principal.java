
package lisenlazsimples;


public class Principal {

    public static void main(String[] args) {
        Metodos lista = new Metodos();
        lista.ingresoInicio(3);
        lista.ingresoFinal(2);
        lista.ingresoFinal(1);
        lista.ingresoFinal(2);
        lista.ingresoInicio(4);
        System.out.println("Lista");
        lista.impresion();
//insertar elemento mediante posición
        System.out.println("Insertar en una posicion  ");
        lista.insertarPosicion(3, 3);
        lista.impresion();
//Eliminar elemento     
        System.out.println("Eliminar un elemento");
        lista.eliminarElemento(2);
        lista.impresion();
//Eliminar elemento mediante posición
        System.out.println("Eliminar Mediante Posición:");
        lista.eliminarPosicion(4);
        lista.impresion();
//Buscar elementos
        System.out.println("Buscar elementos");
        lista.buscar(10);

    }

}
