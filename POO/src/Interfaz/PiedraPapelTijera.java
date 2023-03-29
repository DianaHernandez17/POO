package Interfaz;

import java.util.Random;
import java.util.*;

public class PiedraPapelTijera implements Juego { 
        private int mano;
        private String jugador;
        private int eleccion;
        Scanner Lectura=new Scanner(System.in);
        
    public void iniciar(){
        System.out.println("POR FAVOR INGRESE EL NOMBRE DEL JUGADOR ");
        jugador=Lectura.next();
    }
    public void jugar(){
    System.out.println(jugador+"REALICE SU ELECCIÓN \n 1.PIEDRA \n 2.PAPEL \n 3.TIJERA");
      eleccion=Lectura.nextInt(); 
      Random aleatorio=new Random();
      mano=aleatorio.nextInt(3)+1;
      System.out.println("PIEDRA, PAPEL Y/O TIJERA");
    }
    public void finalizar(){
        if(mano==1 && eleccion==1){
            System.out.println("LA MÁQUINA SACO PIEDRA, HAS EMPATADO "+jugador);
        }
        else if(mano==2 && eleccion==1){
            System.out.println("LA MÁQUINA SACO PAPEL HAS PERDIDO "+jugador);
        }
        else if(mano==3 && eleccion==1){
            System.out.println("LA MÁQUINA SACO TIJERAS, HAS GANADO "+jugador);
        }
        else if(mano==1 && eleccion==2){
            System.out.println("LA MÁQUINA SACO PIEDRA, HAS GANADO "+jugador);
        }
        else if(mano==2 && eleccion==2){
            System.out.println("LA MÁQUINA SACO PAPEL HAS EMPATADO "+jugador);
        }
        else if(mano==3 && eleccion==2){
            System.out.println("LA MÁQUINA SACO TIJERAS HAS PERDIDO"+jugador);
        }
        else if(mano==1 && eleccion==3){
            System.out.println("LA MÁQUINA SACO PIEDRA HAS PERDIDO "+jugador);
        }
        else if(mano==2 && eleccion==3){
            System.out.println("LA MÁQUINA SACO PAPEL, HAS GANADO "+jugador);
        }
        else if(mano==3 && eleccion==3){
            System.out.println("LA MÁQUINA SACO TIJERAS, HAS EMPATADO  "+jugador);
        }
        
    }
    }