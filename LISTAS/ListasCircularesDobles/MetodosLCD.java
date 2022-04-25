package ListasCircularesDobles;

public class MetodosLCD {

    Nodo inicio;
    Nodo fin;

    MetodosLCD() {
        inicio = null;
        fin = null;
    }

    //método para inserta al inicio
    void InsertaInicio(int elem) {
        Nodo nuevo = new Nodo(elem);
        if (inicio == null) {
            nuevo.sig = nuevo;
            nuevo.ant = nuevo;
            inicio = nuevo;
            fin = nuevo;
        } else {
            Nodo siguiente = inicio.sig;
            nuevo.sig = inicio;
            inicio.ant = nuevo;
            nuevo.ant = fin;
            fin.sig = nuevo;
            inicio = nuevo;
        }
    }

    //método para insertar al último
    void InsertarUltimo(int elem) {
        Nodo nuevo = new Nodo(elem);
        if (inicio == null) {
            nuevo.sig = nuevo;
            nuevo.ant = nuevo;
            fin = nuevo;
            inicio = nuevo;
        } else {
            fin.sig = nuevo;
            nuevo.ant = fin;
            nuevo.sig = inicio;
            inicio.ant = nuevo;
            fin = nuevo;
        }
    }
//Imprimir hacia adelante

    void ImprimirAdelante() {
        Nodo temp = inicio;
        if (inicio != null) {
            do {
                System.out.println(temp.inf);
                temp = temp.sig;
            } while (temp != inicio);
        } else {
            System.out.println("La lista es nula");
        }
    }
//imprimir hacia atras

    void ImprimirAtras() {
        Nodo temp = fin;
        if (inicio != null) {
            do {
                System.out.println(temp.inf);
                temp = temp.ant;
            } while (temp != fin);
        } else {
            System.out.println("La lista esta vacia");
        }
    }

    //Numero de elementos
    int NumElementos() {
        int cant = 0;
        Nodo temp = inicio;
        do {
            temp = temp.sig;
            cant++;
        } while (temp != inicio);
        return cant;
    }

    //Borrar Por posición
    void BorrarPos(int pos) {
        if (pos <= NumElementos()) {
            if (pos == 1) {
                Nodo siguiente = inicio.sig;
                siguiente.ant = fin;
                fin.sig = siguiente;
                inicio = siguiente;
            } else {
                if (pos == NumElementos()) {
                    Nodo anterior = fin.ant;
                    anterior.sig = inicio;
                    inicio.ant = anterior;
                    fin = anterior;
                } else {
                    Nodo temp = inicio;
                    for (int i = 1; i <= pos - 2; i++) {
                        temp = temp.sig;
                    }
                    Nodo siguiente = temp.sig;
                    temp.sig = siguiente.sig;
                    Nodo luego = siguiente.sig;
                    luego.ant = temp;
                }
            }
        } else {
            System.out.println("no existe la posicion");
        }
    }

    //Método para insertar por posición
    void InsertarPos(int pos, int elem) {
        Nodo nuevo = new Nodo(elem);
        if (pos <= NumElementos() + 1) {
            if (pos == 1) {
                InsertaInicio(elem);
            } else {
                if (pos == NumElementos() + 1) {
                    InsertarUltimo(elem);
                } else {
                    Nodo temp = inicio;
                    for (int i = 1; i <= pos - 2; i++) {
                        temp = temp.sig;
                    }
                    Nodo siguiente = temp.sig;
                    temp.sig = nuevo;
                    siguiente.ant = nuevo;
                    nuevo.sig = siguiente;
                    nuevo.ant = temp;
                }
            }
        } else {
            System.out.println("No existe la posicion");
        }
    }
    //Método para Buscar

    int Buscar(int elem) {
        Nodo temp = inicio;
        int cant = 0;
        do {
            if (temp.inf == elem) {
                cant++;
            }
            temp = temp.sig;
        } while (temp != inicio);
        return cant;
    }

    //Método para Borrar Elemento
    void BorrarElemento(int elem) {
        Nodo temp = inicio;
        do {
            if (temp.inf == elem) {
                if (temp == inicio) {
                    Nodo siguiente = temp.sig;
                    fin.sig = siguiente;
                    siguiente.ant = fin;
                    inicio = siguiente;
                    temp = temp.sig;
                } else {
                    Nodo siguiente = temp.sig;
                    Nodo anterior = temp.ant;
                    anterior.sig = siguiente;
                    siguiente.ant = anterior;
                    temp = temp.sig;
                }

            } else {
                temp = temp.sig;
            }
        } while (temp != fin);
        if (temp.inf == elem) {
            Nodo anterior = temp.ant;
            anterior.sig = inicio;
            inicio.ant = anterior;
            fin = anterior;
        }
    }
}
