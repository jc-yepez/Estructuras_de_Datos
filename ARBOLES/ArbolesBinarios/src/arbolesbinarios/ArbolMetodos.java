package arbolesbinarios;

/**
 *
 * @author Marcos Altamirano
 */
public class ArbolMetodos {

    Nodo raiz;
int altura, nivel;
    ArbolMetodos() {
        raiz = null;
    }

    void insertar(int x) {
        Nodo nuevo = new Nodo(x);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo anterior = null;
            Nodo reco = raiz;
            while (reco != null) {
                anterior = reco;
                if (x < reco.dato) {
                    reco = reco.hijoIzquierdo;
                } else if (x > reco.dato) {
                    reco = reco.hijoDerecho;
                } else {
                    System.out.println(" dato no admitido..." + x + "ya existe!!");
                    reco = null;
                }
            }
            if (x < anterior.dato) {
                anterior.hijoIzquierdo = nuevo;
            } else if (x > anterior.dato) {
                anterior.hijoDerecho = nuevo;
            }
        }
    }

    private void imprimirPreOrden(Nodo reco) {
        if (reco != null) {
            System.out.println(reco.dato + " - ");
            imprimirPreOrden(reco.hijoIzquierdo);
            imprimirPreOrden(reco.hijoDerecho);

        }
    }

    void ImprimirPreOrden() {
        imprimirPreOrden(raiz);
        System.out.println("");
    }

    private void imprimirInOrden(Nodo reco) {
        if (reco != null) {
            imprimirPreOrden(reco.hijoIzquierdo);
            System.out.println(reco.dato + " - ");
            imprimirPreOrden(reco.hijoDerecho);

        }
    }

    void ImprimirInOrden() {
        imprimirInOrden(raiz);
        System.out.println("");
    }

    private void imprimirPostOrden(Nodo reco) {
        if (reco != null) {
            imprimirPreOrden(reco.hijoIzquierdo);
            imprimirPreOrden(reco.hijoDerecho);
            System.out.println(reco.dato + " - ");

        }
    }

    void ImprimirPostOrden() {
        imprimirPostOrden(raiz);
        System.out.println("");
    }

    boolean existe(int elem) {
        Nodo temp = raiz;
        while (temp.dato != elem) {
            if (elem < temp.dato) {
                temp = temp.hijoIzquierdo;
            } else {
                temp = temp.hijoDerecho;
            }
            if (temp == null) {
                System.out.println("NO EXISTE EL ELEMENTO");
                return false;
            }

        }
        System.out.println("SE ENCONTRO ELEMNTO " + elem + "y se ubica en: ");
        return true;
    }

    private void buscar(Nodo reco, int x, int i) {
        if (reco != null) {
            buscar(reco.hijoIzquierdo, x, i + 1);
            if (reco.dato == x) {
                System.out.println("Dato:=> " + reco.dato);
                System.out.println("Nivel:=> " + i);
            }
            buscar(reco.hijoDerecho, x, i + 1);
        }
    }

    public void buscar(int x) {
        if (existe(x) == true) {
            buscar(raiz, x, 0);
        }
    }
// hijo menor

    public void borrarMenor() {
        if (raiz != null) {
            if (raiz.hijoIzquierdo == null) {
                raiz = raiz.hijoDerecho;
            } else {
                Nodo atras = raiz;
                Nodo reco = raiz.hijoIzquierdo;
                while (reco.hijoIzquierdo != null) {
                    atras = reco;
                    reco = reco.hijoIzquierdo;
                }
                atras.hijoIzquierdo = reco.hijoDerecho;
            }
        }
    }

     public void verRaiz() {
        Nodo reco = raiz;
        if (reco != null) {
            System.out.println("La raiz del arbol es: " + reco.dato);
        }
    }

    private void mostrarHijos(Nodo reco, int x, int i) {
        if (reco != null) {
            mostrarHijos(reco.hijoIzquierdo, x, i + 1);
            if (reco.dato == x) {
                if ((reco.hijoIzquierdo != null) || (reco.hijoDerecho != null)) {
                    if (reco.hijoIzquierdo != null) {
                        System.out.println("Dato:=> " + reco.dato);
                        System.out.println("Tiene un hijo: " + reco.hijoIzquierdo.dato);
                    }
                    if (reco.hijoDerecho != null) {
                        System.out.println("Dato:=> " + reco.dato);
                        System.out.println("Tiene un hijo: " + reco.hijoDerecho.dato);
                    }
                    if ((reco.hijoDerecho != null) && (reco.hijoIzquierdo != null)) {
                        System.out.println("Dato:=> " + reco.dato);
                        System.out.println("Tiene dos hijos: " + reco.hijoDerecho.dato + "-" + reco.hijoIzquierdo.dato);
                        System.exit(0);
                    }
                } else {
                    System.out.println(reco.dato + " No tiene hijos es una hoja");
                }
            }
            mostrarHijos(reco.hijoDerecho, x, i + 1);
        }
    }

    public void mostrarHijos(int x) {
        if (existe(x) == true) {
            mostrarHijos(raiz, x, 0);
        }
    }

    private void dibujar(Nodo reco) {
        if (reco != null) {
            System.out.printf("%25d\n", reco.dato);
            dibujar(reco.hijoIzquierdo);
            dibujar(reco.hijoDerecho);
        }
    }

    private void Altura(Nodo reco, int nivel) {
        if (reco != null) {
            Altura(reco.hijoIzquierdo, nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            Altura(reco.hijoDerecho, nivel + 1);
        }
    }

    public int Altura() {
        altura = 0;
        Altura(raiz, 1);
        return altura;
    }
    
    public void grado() {
        Nodo reco = raiz;
        int a=0;
        if (reco != null) {
             if ((reco.hijoIzquierdo != null) || (reco.hijoDerecho != null)) {
                    if (reco.hijoIzquierdo != null) {
                        a=1;
                    }
                    if (reco.hijoDerecho != null) {
                        a=1;;
                    }
                    if ((reco.hijoDerecho != null) && (reco.hijoIzquierdo != null)) {
                        a=2;
                    }
                    
                } else {
                    System.out.println("NO tiene hijos ");
                }
             System.out.println("tiene un grado de : "+a);
        }
    }

}
