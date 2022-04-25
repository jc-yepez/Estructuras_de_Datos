/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listasdoblesenlazadas;

public class Nodo {
    int inf; 
    Nodo sig; 
    Nodo ant;
    Nodo(int x){
    inf =x;
    sig=null;
    ant=null;
    
}
    Nodo() { //constructor
        inf= 0;
        sig = null;
        ant=null;
}
}    
