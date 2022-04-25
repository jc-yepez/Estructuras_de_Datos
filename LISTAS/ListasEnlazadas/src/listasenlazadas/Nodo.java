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
public class Nodo {
   
    int info;
  Nodo sig;
  //nodo final
  public Nodo (int z){
      info =z;
      sig =null;
        }
    //nodo inicio
  public Nodo (int z, Nodo in){
      info =z;
      sig= in;
      
  }
}

