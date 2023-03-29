package Interfaz;

public class Ejecucion {
    public static void main(String[] args) {
      /*CaraYSello juego1=new CaraYSello();
      juego1.iniciar();
      juego1.jugar();
      juego1.finalizar();*/  

      PiedraPapelTijera jugador=new PiedraPapelTijera();
      jugador.iniciar();
      jugador.jugar();
      jugador.finalizar();

    }
}