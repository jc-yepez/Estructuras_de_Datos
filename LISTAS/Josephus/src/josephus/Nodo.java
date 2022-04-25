/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephus;

/**
 *
 * @author Marcos Altamirano
 */
public class Nodo {

    char inf;
    Nodo sig;
    Nodo ant;
    Nodo(char x){
        inf=x;
        sig=null;
        ant=null;
    }
}