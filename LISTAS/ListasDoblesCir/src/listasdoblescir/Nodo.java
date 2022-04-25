package listasdoblescir;
public class Nodo {
    int inf;
    Nodo sig, ant;
    Nodo(int x){
        inf=x;
        sig=null;
        ant=null;
    }

    Nodo(int x, Nodo inicio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
