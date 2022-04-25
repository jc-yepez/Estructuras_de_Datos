package listasdoblescir;

public class Metodos {

    Nodo inicio, fin;
    Nodo inicio2,fin2;
 

    Metodos() {
        inicio = null;
        fin = null;
    }

    //metodo insertar
    void InsertarIn(int x) {
        Nodo nuevo = new Nodo(x);
        if (inicio == null) {
            nuevo.sig = nuevo;
            nuevo.ant = nuevo;
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.sig = inicio;
            inicio.ant = nuevo;
            nuevo.ant = fin;
            fin.sig = nuevo;
            inicio = nuevo;
        }
    }

    void InsertarFn(int x) {
        Nodo nuevo = new Nodo(x);
        if (inicio == null) {
            nuevo.sig = nuevo;
            nuevo.ant = nuevo;
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.sig = nuevo;
            nuevo.ant = fin;
            nuevo.sig = inicio;
            inicio.ant = nuevo;
            fin = nuevo;
        }
    }

    void ImpreimirIn() {
        Nodo reco = inicio;
        if (inicio != null) {
            do {
                System.out.println(reco.inf);
                reco = reco.sig;
            } while (reco != inicio);
        } else {
            System.out.println("Lista vacia");
        }
    }

    void ImpreimirFin() {
        Nodo reco = fin;
        if (inicio != null) {
            do {
                System.out.println(reco.inf);
                reco = reco.ant;
            } while (reco != fin);
        } else {
            System.out.println("Lista vacia");
        }
    }

    int cant() {
        Nodo aux = inicio;
        int cant = 0;
        do {
            aux = aux.sig;
            cant++;
        } while (aux != inicio);
        return cant;
    }

    void Borrarpos(int pos) {
        if (pos <= cant()) {
            if (pos == 1) {
                Nodo sig = inicio.sig;
                sig.ant = fin;
                fin.sig = sig;
                inicio = sig;
            } else {
                if (pos == cant()) {
                    Nodo ant = fin.ant;
                    ant.sig = inicio;
                    inicio.ant = ant;
                    fin = ant;
                } else {
                    Nodo aux = inicio;
                    for (int i = 1; i <= pos - 2; i++) {
                        aux = aux.sig;
                    }
                    Nodo sig = aux.sig;
                    aux.sig = sig.sig;
                    Nodo desp = sig.sig;
                    desp.ant = aux;
                }
            }
        } else {
            System.out.println("No existe la posicion");
        }
    }
    
    
        public boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    //-----------------------
    //deber
       
       // para Borrar Elemento
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
    
    
   

    // para insertar por posicion
    void InsertarPos(int pos, int elem) {
        Nodo nuevo = new Nodo(elem);
        if (pos <= cant() + 1) {
            if (pos == 1) {
                InsertarIn(elem);
            } else {
                if (pos == cant() + 1) {
                    InsertarFn(elem);
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
    // para Buscar

    int Buscar(int elem) {
        Nodo temp = inicio;
        int cant = 0;
        do {
            if (temp.inf == elem) {
                cant++;
            }
            temp = temp.sig;
        } while (temp != inicio);
        System.out.println(cant);
        return cant;
    }
       
    
    
    //++++++++++++++++++++++
    
       public void NumerosPares() {
       Nodo conta = inicio;
       Nodo fi = fin;
       
        int aux, x = 0, z = 0, b=0,d=0;
        do {
            aux = conta.inf % 2;
           if (aux == 0) {
               x++;
                 b=conta.inf;
            }           
           conta = conta.sig;
           d=b+conta.inf;
            z++;
        } while (cant()!=z-1);
           System.out.println(d-1);
      //  System.out.println("Son: " + (x-1) + " Numeros pares");
    }
       
    public int SumaPares(){
        Nodo temp=inicio;
        int suma=0;
        do{
            if(temp.inf%2==0){
                suma+=temp.inf;
            }
            temp=temp.sig;            
        }while(temp!=inicio);
        return suma;        
    }
    

    
    void ImprimirenOrd(){
        Nodo reco=inicio;
        int y;
        do{
            reco.ant=reco.sig;
            while(reco.ant!=reco){
                if(reco.inf<reco.ant.inf){
                    y=reco.inf;
                    reco.inf=reco.ant.inf;
                    reco.ant.inf=y;
                }
                reco.ant=reco.ant.sig;
            }
            reco=reco.sig;
        }while(reco!=inicio);
    }
    void ordenar(){
        Nodo reco=inicio;
        Nodo reco1=inicio.sig;
        int aux;
        do{
            do{
                if(reco.inf<reco1.inf){
                    aux=reco.inf;
                    reco.inf=reco1.inf;
                    reco1.inf=aux;
                }
                reco1=reco1.sig;
            }while(reco1!=inicio);
            reco=reco.sig;
        }while(reco!=inicio);
    }
    
    
    void concadenar(){
        inicio.ant=fin2;
        fin2.sig=inicio;
        fin.sig=inicio2;
        inicio2.ant=fin;
        fin=fin2;
    }
    

}
