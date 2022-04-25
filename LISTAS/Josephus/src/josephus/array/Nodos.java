/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephus.array;

/**
 *
 * @author Marcos Altamirano
 */
public class Nodos {
    
    Nodos sig,ant;
    int info;
    
    Nodos(int x){
        info=x;
        sig=ant=null;
    }
    
}

