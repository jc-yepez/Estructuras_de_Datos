
package lisenlazsimples;


public class Metodos {

    Nodo inicio, fin;

    Metodos() {
        inicio = null;
        fin = null;

    }
//ingresar al inicio de la lista

    public void ingresoInicio(int elem) {
        inicio = new Nodo(elem, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }
//comprobar si la lista esta vacia

    boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
//Ingresar al final de la lista

    public void ingresoFinal(int elem) {
        if (!listaVacia()) {
            fin.sig = new Nodo(elem);
            fin = fin.sig;
        } else {
            inicio = fin = new Nodo(elem);
        }
    }
//Visualizar lista

    public void impresion() {
        if (!listaVacia()) {
            Nodo reco = inicio;
            while (reco != null) {
                System.out.println(reco.inf);
                reco = reco.sig;
            }
        }
    }

    //Borrar primer elemento

    public int borrarI() {
        int elem = inicio.inf;
        if (inicio == null) {
            fin = null;

        } else {
            inicio = inicio.sig;
        }
        return elem;
    }
//Borrar ultimo elemento

    int borarF() {
        int elem = fin.inf;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            Nodo temporal = inicio;
            while (temporal.sig != fin) {
                temporal = temporal.sig;

            }
            fin = temporal;
            fin.sig = null;
        }
        return elem;

    }
//Numero de Elementos(size)

    int numeroElementos() {
        int pos = 0;
        Nodo reco = inicio;
        while (reco != null) {
            pos++;
            reco = reco.sig;
        }
        return pos;
    }
    
    
//**************DEBER+************
    //Elementos mediante posiciones    

    void insertarPosicion(int x, int pos) {
        if (pos <= numeroElementos() + 1) {
            if (pos == 1) {
                inicio = new Nodo(x, inicio);
                if (fin == null) {
                    fin = inicio;
                }
            } else {
                if (pos == numeroElementos() + 1) {
                    if (!listaVacia()) {
                        fin.sig = new Nodo(x);
                        fin = fin.sig;
                    } else {
                        inicio = fin = new Nodo(x);
                    }
                } else {

                    Nodo reco = inicio;
                    for (int i = 1; i <= pos - 2; i++) {

                        reco = reco.sig;
                    }

                    reco.sig = new Nodo(x, reco.sig);
                }
            }
        }

    }
//Eliminar mediante posicion determinada
    public int eliminarPosicion(int pos) {
        if (pos <= numeroElementos()) {
            if (pos == 1) {
                int eliminado = inicio.inf;
                inicio = inicio.sig;
                return eliminado;
            } else {

                Nodo reco = inicio;
                for (int f = 1; f <= pos - 2; f++) {
                    reco = reco.sig;
                }
                int eliminado = reco.sig.inf;
                reco.sig = reco.sig.sig;
                return eliminado;
            }
        }
        System.out.println("La posición excede la cantidad de elementos...");
        return 0;
    }
//Eliminar un elemento determinado
    void eliminarElemento(int x) {
        Nodo reco1 = inicio;
        int ini = 1, med = 0, fin = 0;
        while (reco1 != null) {

            if (reco1.inf == x) {

                med = ini;
               
                if (med == 1) {
                    inicio = inicio.sig;
                } else {
                    Nodo reco = inicio;
                    fin = fin + 1;
                    for (int f = 1; f <= med - fin - 2; f++) {
                        reco = reco.sig;
                    }
                    reco.sig = reco.sig.sig;
                }
            }
            if (reco1 != null) {
                ini++;
                reco1 = reco1.sig;
            }
        }
        if (med == 0) {
            System.out.println("Elemento: " + x);
            System.out.println("No Existe");

        }
    }

    public boolean buscar(int elem) {
        Nodo reco1 = inicio;
        int ini = 1, med = 0, fn = 0;
                while (reco1 != null) {

            if (reco1.inf == elem) {
                fn++;
                med = ini;
                System.out.print("   " + med);
            }

            ini++;
            reco1 = reco1.sig;

        }

        if (med != 0) {
            System.out.println("El elemento: " + elem + 
                    " si existe, y se repite " + fn );

            return true;
        } else {
            System.out.println("Elemento: " + elem);
            System.out.println("NO Existe");
            return false;

        }
    }

}
