/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

/**
 *
 * @author Marcos Altamirano
 */
public class MetodosListas {
    
 

    Nodo inicio, fin;

    public MetodosListas() {
        inicio = null;
        fin = null;
    }
//INICIO LISTA

    public void IngresoInicio(int elem) {
        inicio = new Nodo(elem, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    public boolean ListaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void IngresoFinal(int elem) {
        if (ListaVacia() == false) {
            fin.sig = new Nodo(elem);
            fin = fin.sig;
        } else {
            inicio = fin = new Nodo(elem);
        }
    }

    public void Impresion() {
        Nodo reco = inicio;
        while (reco != null) {
            System.out.println(reco.info);
            reco = reco.sig;
        }
    }
   
    
     // eliminar primer nodo

    public int BorrarIn() {
        int elem = inicio.info;
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            inicio = inicio.sig;
        }
        return elem;
    }
    //Borrar final elemento 
    public int BorrarF(){
        int elem= fin.info;
        if(inicio==fin){
            inicio=fin=null;
            
        }else
        {
            Nodo temporal=inicio;
            while(temporal.sig!=fin){
                temporal=temporal.sig;
            }
            fin=temporal;
            fin.sig=null;
        }
        return elem;
    }
    
    
    
     //DEBER
    //numero de elementos de una lista

  
       int numeroElementos() {
        int pos = 0;
        Nodo reco = inicio;
        while (reco != null) {
            pos++;
            reco = reco.sig;
        }
        return pos;
    }
    //verifica si la lista esta vacia
    public boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    //inserta un elemento en cualquier posicion

    
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
  
  public int BuscarNumero(int x2) {
      int cant=0;
      if(ListaVacia()==false){
      Nodo aux=inicio;
      while(aux!=null){
          if(aux.info==x2){
              cant++;
          }
          aux=aux.sig;
      }
  }else{
          System.out.println("lista vacia");
      }
      return cant;
       
  }
   
  public void Eliminarp(int pos){
        Nodo reco,anterior=inicio;
        int posicion=1;
        boolean encontrar;
        reco=inicio;
        encontrar=false;
        System.out.println();
        if(pos==0)
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
        Impresion();
    }
  
  //Eliminar un elemento determinado
    void EliminarElemento(int x) {
        Nodo reco1 = inicio;
        int ini = 1, med = 0, fin = 0;
        while (reco1 != null) {

            if (reco1.info == x) {

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
  
}
