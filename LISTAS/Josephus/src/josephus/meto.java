
package josephus;

/**
 *
 * @author Marcos Altamirano
 */
public class meto {
    Nodo inicio;
    Nodo fin;

    meto() {
        inicio = null;
        fin = null;
    }
    
    //Metodos auxiliares

    void insertarFinal(char elem) {
        Nodo nuevo = new Nodo(elem);
        if (inicio == null) {
            nuevo.sig = nuevo;
            nuevo.ant = nuevo;
            inicio = nuevo;
            fin = nuevo;
        } else {

            inicio.sig = nuevo;
            nuevo.sig = fin;
            fin.ant = nuevo;
            nuevo.ant = inicio;
            fin = nuevo;
        }
    }

     void imprimirAdelante() {
        Nodo temp = inicio;
        if (inicio != null) {
            do {
                System.out.println(temp.inf);
                temp = temp.ant;
            } while (temp != inicio);
        } else {
            System.out.println("Lista vacia");
        }
    }
    
    
      int tamaño() {
        Nodo temp = inicio;
        int i = 0;
        do {
            temp = temp.sig;
            i++;

        } while (temp != inicio);
        return i;
    }
      
      int buscar(int elem) {
        Nodo temp = inicio;
        int i = 0;
        if (inicio != null) {
            do {
                if (temp.inf == elem) {
                    i++;
                }
                temp = temp.ant;

            } while (temp != inicio);
            return i;
        } else {
            return i;
        }
    }
      
      void eliminarInicio() {
        if (inicio != null) {
            inicio = inicio.ant;
            fin.ant = inicio;
            inicio.sig = fin;
        } else {
            System.out.println("Lista vacia");
        }
    }

    void eliminarFinal() {
        if (inicio != null) {
            fin = fin.sig;
            inicio.sig = fin;
            fin.ant = inicio;
        } else {
            System.out.println("Lista vacia");
        }
    }
    
     void eliminarElem(char elem) {
        Nodo temp = inicio;
        Nodo aux = inicio;
        int i = 1;
        int var = tamaño();
        if (inicio != null) {
            if (var == buscar(elem)) {
                temp = null;
                inicio = temp;
            } else {
                do {
                    if (temp.inf == elem) {
                        if (i == 1) {
                            eliminarInicio();
                            if (temp.inf == elem) {
                                eliminarElem(elem);
                            }
                            temp = temp.ant;
                        } else {
                            if (i == var) {
                                eliminarFinal();
                                temp = inicio;
                            } else {
                                temp = temp.ant;
                                aux.ant = temp;
                                temp.sig = aux;
                                if (temp.inf == elem) {
                                    eliminarElem(elem);
                                }
                            }
                        }
                    }
                    if (i > 1) {
                        aux = aux.ant;
                    }
                    temp = temp.ant;

                    i++;

                } while (temp != inicio);
            }

        } else {
            System.out.println("Lista Vacia...");
        }
    }
  
     //ingreso soldados
     public void insertarS(int n){
        int c=65;
        int i=c+n-1;
        do{
           
            if(n>26||n==0){
                c=i+1;
                
            }else{
                insertarFinal((char)c);
                c++;
               
            }
                  }while(c<=i);
        
    }
    
    public void r(int n){
      if ( n<27  ){
          insertarS(n);
          int periodo=(int)((Math.random()*n)+1);
          int inicio=(int)((Math.random()*n)+1);
          int i=1;
          Nodo temp=this.inicio;
          Nodo cabeza;
          System.out.println("JOSEPHUS \n" + " ");
          System.out.println("=>"+"inicio="+inicio);
          System.out.println("=>"+"periodo= "+periodo);
          while(i<inicio){
              temp=temp.ant;
              i++;
          }
          System.out.println("=>"+ "comienza por ="+temp.inf + "");
          do{
              for(int j=1;j<periodo;j++){
                  temp=temp.ant;
              }
              System.out.println("Pierde "+temp.inf);
              eliminarElem(temp.inf);
              temp=temp.ant;
          } while(this.inicio!=fin);
          System.out.println("GANO!!!= "+temp.inf);
      }
      else{
          System.out.println("ERROR!!!...");
          System.out.println("tamaño maximo que puede ingresar es 26");
          System.out.println("tiene un limite de soldados ya que este programa se baso en el alfabeto");
      }
}}