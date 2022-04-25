/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephus.array;

import java.util.Scanner;

/**
 *
 * @author Marcos Altamirano
 */
public class metodos {

    Nodos inicio, fin;

    metodos() {
        inicio = null;
        fin = null;
    }

    public int NumSoldados() {
        int num;
        Scanner ola = new Scanner(System.in);
        System.out.print("Numero de Soldados: ");
        num = Integer.valueOf(ola.nextLine());
        return num;
    }

    public void LLenarLista() {
        int x = 1, k;
        k = NumSoldados();
        do {
            Nodos nuevo = new Nodos(x);
            if (x == 1) {
                nuevo.sig = nuevo;
                nuevo.ant = nuevo;
                fin = inicio = nuevo;
            } else {
                //System.out.println("sad");
                fin.sig = nuevo;
                nuevo.ant = fin;
                nuevo.sig = inicio;
                inicio.ant = nuevo;
                fin = nuevo;
            }
            x++;
        } while (k + 1 != x);
    }

    public void Imprimir() {
        Nodos reco = inicio;
        do {
            System.out.println("Soldado.." + reco.info);
            reco = reco.sig;
        } while (reco != inicio);

    }

    public int Contar() {
        Nodos reco = inicio;
        int x = 0;
        do {
            reco = reco.sig;
            x++;
        } while (reco != inicio);
        return x;
    }

    public int NumRamdSecu() {
        int secu;
        secu = ((int) (Math.random() * (Contar() - 1) + 1));
        System.out.println("Secuencia de suicidio: " + secu);
        return secu;
    }

    public int NumRamdInicio() {
        int inicio;
        inicio = ((int) (Math.random() * (Contar() - 1) + 1));
        System.out.println("Empieza desde el Soldado: " + inicio);
        return inicio;

    }

    public void Muertes() {
        Nodos nuevoini = null;
        Nodos reco = inicio;
        Nodos aux = null;
        boolean entra = false;
        int muerte = 0, muerteciclo, pos = 0;
        //int secuencia=NumRamdSecu(),inicio=NumRamdInicio();
        int secuencia = 2, iniciom = 3;
        do {
            if (entra == false) {
                Nodos luego = reco.sig;
                while (pos != iniciom) {
                    luego = reco.ant;
                    reco = reco.sig;
                    pos++;
                }
                entra = true;
                System.out.println("Muere Soldado: " + reco.info);
                inicio=reco;
                fin = luego;
                inicio.ant = luego;
                fin.sig = reco;
                BorrarPos(reco.sig,luego.ant,pos);
                muerte++;
            } else {
                pos=0;
                reco=inicio; 
                Nodos luegos=reco.sig;
                while(pos!=secuencia){
                    luegos=reco.ant;
                    reco=reco.sig;
                    pos++;
                }
                System.out.println("Muere Soldado: " + reco.ant.info);
                inicio=reco;
                fin=luegos;
                inicio.ant = luegos;
                fin.sig = reco;
                System.out.println("nuevo inicio " + inicio.info);
                System.out.println("nuevo fin " + fin.info);
                BorrarPos(reco.sig,luegos.ant,pos);
                muerte++;
            }
        } while (muerte != (Contar() - 1));
        System.out.println("El soldado: " + reco.info + " Se ira en el caballo");
        System.out.println(muerte);
    }

    void BorrarPos(Nodos siguiente ,Nodos anterior,int pos) {
        if (pos <= Contar()) {
            if (pos == 1) {
                //Nodos siguiente = inicio.sig;
                siguiente.ant = fin;
                fin.sig = siguiente;
                inicio = siguiente;
            } else {
                if (pos == Contar()) {
                    //Nodos anterior = fin.ant;
                    anterior.sig = inicio;
                    inicio.ant = anterior;
                    fin = anterior;
                } else {
                    Nodos temp = inicio;
                    for (int i = 1; i <= pos - 2; i++) {
                        temp = temp.sig;
                    }
                   // Nodos siguiente = temp.sig;
                    temp.sig = siguiente.sig;
                    Nodos luego = siguiente.sig;
                    luego.ant = temp;
                }
            }
        } else {
            System.out.println("no existe la posicion");
        }
    }
}

