package Interfaz;

import java.util.Random;
import java.util.*;

public class CaraYSello implements Juego{

//ATRIBUTOS
    private int moneda;
    private String jugador;
    private int eleccion;
    Scanner Lectura=new Scanner(System.in);
    
public void iniciar(){
    System.out.println(" POR FAVOR INGRESE EL NOMBRE DEL JUGADOR");
    jugador=Lectura.next();
}
public void jugar(){
System.out.println(jugador+"REALICE SU ELECCIÓN \n 1.CARA \n 2.SELLO");
  eleccion=Lectura.nextInt(); 
  Random aleatorio=new Random();
  moneda=aleatorio.nextInt(2)+1;
  System.out.println("HA LANZADO LA MONEDA");
}
public void finalizar(){
    if(moneda==1 && eleccion==1){
        System.out.println("CAYÓ CARA Y GANASTE"+jugador);
    }
    else if(moneda==2 && eleccion==2){
        System.out.println("CAYÓ SELLO Y GANASTE "+jugador);
    }
    else if(moneda==1 && eleccion==2){
        System.out.println("CAYÓ CARA Y PERDISTE"+jugador);
    }
    else if(moneda==2 && eleccion==1){
        System.out.println("CAYÓ SELLOS Y PERDISTE "+jugador);
    }
    
}
}