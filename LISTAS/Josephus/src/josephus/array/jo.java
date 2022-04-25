/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephus.array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marcos Altamirano
 */
public class jo {
    public static void main ( String[] args) {



           int numpersonas, numsalto, newgap, cant;
       ArrayList<Integer> sld = new ArrayList<Integer>();
       Scanner in = new Scanner(System.in);

       // get the initial number of soldiers
       System.out.println("introduzca el numero de soldados ");
       numpersonas = in.nextInt();
       in.nextLine();

       // get the gap between soldiers
       System.out.println("introduzca el salto entre soldados ");
       numsalto = in.nextInt();
   
       // load the initial list of soldiers
       for (int count=1; count <= numpersonas; count++)
       {
         sld.add(new Integer(count));
       }
       cant = numsalto - 1;
       newgap = numsalto;

       //  Treating the list as circular, remove every nth element
       //  until the list is empty

       System.out.println("el orden es ");


       while (!(sld.isEmpty()))
       {
          System.out.println(sld.remove(cant));
          numpersonas = numpersonas - 1;
          if (numpersonas > 0)
             cant = (cant + numsalto - 1) % numpersonas;
       }
   }
    
}
