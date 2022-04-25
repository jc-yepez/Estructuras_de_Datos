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
public class ListasEnlazadas {

 

    public static void main(String[] args) {
        MetodosListas lista = new MetodosListas();
        lista.IngresoInicio(3);
        lista.IngresoInicio(3);
        lista.IngresoFinal(2);
        lista.IngresoFinal(2);
        lista.IngresoFinal(1);
        lista.IngresoFinal(2);
        lista.IngresoInicio(4);
        System.out.println("Lista");
        lista.Impresion();
//insertar elemento mediante posición
        System.out.println("Insertar un elemento en una posicion determinada ");
        lista.insertarPosicion(3, 3);
        lista.Impresion();
//Eliminar elemento     
        System.out.println("Eliminar un elemento");
        lista.EliminarElemento(4); 
        lista.Impresion();
//Eliminar elemento mediante posición
        System.out.println("Eliminar Mediante Posición:");
        lista.Eliminarp(4);
        lista.Impresion();
//Buscar elementos
        System.out.println("Buscar elementos");
        lista.BuscarNumero(1);
        
       
    }

}
    
    // hacer dos metodos el primer metodo es insertar un elemto en la lista en cualquier posicion
    //q pida la posicion y el elemntoliminar (elemto)
    
    // eliminar cualquier elemento de lista que yo quiera por la posicion eliminar (posicion)
    
    //buscar (elemto) cuantas veces se repite el elemento y q me devuelva cuantas veces se repite el elemento

        // TODO code application logic here
    
    

