

package listasdoblesenlazadas;


public class Metodos {

    Nodo inicio;
    Nodo fin;

    //metodos 
    void Insertar(int a) {
        if (inicio == null) {
            inicio = new Nodo(a);
            fin = inicio;
        } else {
            Nodo temp = new Nodo(a);
            fin.sig = temp;
            temp.ant = fin;
            fin = temp;
        }
    }
     void Imprimir() {
        Nodo reco = inicio;
        while (reco != null) {
            System.out.println(" " + reco.inf);
            reco = reco.sig;

        }

    }

    void MostrarAdelante() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println(aux.inf);
            aux = aux.sig;
        }
    }

    void MostrarAtras() {
        Nodo aux = fin;
        while (aux != null) {
            System.out.println(aux.inf);
            aux = aux.ant;
        }
    }

    int BorrarInicio() {
        int elemento = inicio.inf;
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            inicio = inicio.sig;
            inicio.ant = null;
        }
        return elemento;
    }

    int borrarFinal() {
        int elemento = fin.inf;
        if (inicio == fin) {
            inicio = null;
            fin = null;

        } else {
            fin = fin.ant;
            fin.sig = null;
        }
        return elemento;
    }
    //DEBER
    //numero de elementos de una lista

    int numeroElemento() {
        listasdoblesenlazadas.Nodo reco = inicio;
        int cant = 0;
        while (reco != null) {
            reco = reco.sig;
            cant++;
        }
        return cant;
    }
    //verifica si la lista esta vacia
    public boolean ListaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    //inserta un elemento en cualquier posicion

    public void insertarelempos(int pos, int x1) {
        if (pos <= numeroElemento() + 1) {
            listasdoblesenlazadas.Nodo nuevo = new listasdoblesenlazadas.Nodo();
            nuevo.inf = x1;
            if (pos == 1) {
                nuevo.sig = inicio;
                inicio = nuevo;
            } else {
                if (pos == numeroElemento()) {
                    listasdoblesenlazadas.Nodo reco = inicio;
                    while (reco.sig != null) {
                        reco = reco.sig;
                    }
                    reco.sig = nuevo;
                    nuevo.sig = null;
                } else {
                    listasdoblesenlazadas.Nodo reco = inicio;
                    for (int f = 1; f <= pos - 2; f++) {
                        reco = reco.sig;
                    }
                    listasdoblesenlazadas.Nodo siguiente = reco.sig;
                    reco.sig = nuevo;
                    nuevo.sig = siguiente;
                }
            }

        }

    }
    

    //buscaa el numero de elementos que se repite
  
  public int buscar(int x2) {
      int cant=0;
      if(ListaVacia()==false){
      Nodo aux=inicio;
      while(aux!=null){
          if(aux.inf==x2){
              cant++;
          }
          aux=aux.sig;
      }
  }else{
        
          System.out.println("lista vacia");
      }
        System.out.println(cant);
      return cant;
       
  }
  //eliminar valor mediante la posicion
  
    public void EliminarElemPos(int pos){
        Nodo reco,anterior=inicio;
        int posicion=1;
        boolean encontrar;
        reco=inicio;
        encontrar=false;
        System.out.println();
        if(pos==1)
        while((reco!=null)&&(!encontrar)){
          encontrar=(posicion==pos);
          if(!encontrar){
              anterior=reco;
              reco=reco.sig;
          }
          posicion++;
        }
        if(reco!=null){
            if(reco==inicio){
                inicio=reco.sig;
            }else{
                anterior.sig=reco.sig;
            }
        }
        }
     }