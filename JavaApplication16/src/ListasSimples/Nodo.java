
package ListasSimples;

/**
 *
 * @author Marcos Altamirano
 */
public class Nodo {
      int inf;
    Nodo sig;
    
    Nodo(int x){
        inf =x;
        sig = null;
        
    }
    Nodo(int x , Nodo y ){
        inf=x;
        sig=y;
    }
    
}
