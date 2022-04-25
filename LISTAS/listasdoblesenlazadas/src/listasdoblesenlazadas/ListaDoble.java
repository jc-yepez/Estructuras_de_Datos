/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listasdoblesenlazadas;

public class ListaDoble {

    public static void main(String[] args) {
        Metodos x = new Metodos();
        x.Insertar(1);
        x.Insertar(1);
        x.Insertar(3);
        x.Insertar(5);
        System.out.println("LISTA");
        x.Imprimir();
        
        System.out.println("BUSCAR");
        x.buscar(1);
    }

}
