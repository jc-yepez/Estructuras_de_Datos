
package arbolesbinarios;

/**
 *
 * @author Marcos Altamirano
 */
public class ArbolesBinarios {

  // METODOS RECURSIVOS CON DOS LLAMADAS
    
    public static void main(String[] args) {
  ArbolMetodos arbb= new ArbolMetodos();
  arbb.insertar(4);
  arbb.insertar(3);
  arbb.insertar(6);
  arbb.insertar(5);
  arbb.insertar(7);
        System.out.println("PRE ORDEN");
        arbb.ImprimirPreOrden();
        System.out.println("IN oORDEN");
        arbb.ImprimirInOrden();
        System.out.println("POST ORDEN");
        arbb.ImprimirPostOrden();
        System.out.println("buscar");
        arbb.buscar(5);
        
        System.out.println("raiz");
        arbb.verRaiz();
        System.out.println("mostrar hijos");
        arbb.mostrarHijos(4);
        
    }
    // metodos
    // saber cual es la raiz de un arbol
    // cuales son los hijos de un nodo dado si no tiene hijos mensaje: son hojas
    // calcular la altura de un arbol 
    // calcular el grado 
}
