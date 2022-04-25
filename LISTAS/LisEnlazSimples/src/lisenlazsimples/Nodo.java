/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lisenlazsimples;

/**
 *
 * @author ORTEGA-PC
 */
public class Nodo {
    int inf;
    Nodo sig;
    
    Nodo(int x){
        inf =x;
        sig = null;
        
    }
    Nodo(int x , Nodo y ){
        inf=x;
        sig=y;
    }
}
