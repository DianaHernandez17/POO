package FigurasGeometricas;

import java.util.*;

public class Ejecucion {
    public static void main(String[] args) {
        //ATRIBUTOS
        float lado, base, altura, radio;
        int desicion, i=1;
        try (Scanner Lectura = new Scanner(System.in)) {
            while(i==1){
                
            System.out.println("DIGITE EL NÚMERO, SEGÚN LA FIGURA LA CUAL DESEE CALCULAR EL ÁREA");
            System.out.println("1 SI SU FIGURA ES CUADRADO");
            System.out.println("2 SI SU FIGURA ES RECTÁNGULO");
            System.out.println("3 SI SU FIGURA ES TRIÁNGULO");
            System.out.println("4 SI SU FIGURA ES CIRCULO");
            desicion=Lectura.nextInt();

            
            if(desicion==1){
            System.out.println("POR FAVOR INGRESE EL VALOR DEL LADO DEL CUADRO");
            lado=Lectura.nextFloat();
            Cuadrado c1=new Cuadrado(lado);
            c1.calcularArea();
            }
            
            else if(desicion==2){
            System.out.println("POR FAVOR INGRESE EL VALOR DE LA BASE DEL RECTÁNGULO");
            base=Lectura.nextInt();
            System.out.println("POR FAVOR INGRESE EL VALOR DE LA ALTURA DEL RECTÁNGULO");
            altura=Lectura.nextInt();
            Rectangulo resultado1=new Rectangulo(base, altura);
            resultado1.calcularArea();
            }

            else if(desicion==3){
            System.out.println("POR FAVOR INGRESE EL VALOR DE LA BASE DEL TRIÁNGULO");
            base=Lectura.nextInt();
            System.out.println("POR FAVOR INGRESE EL VALOR DE LA ALTURA DEL RECTÁNGULO");
            altura=Lectura.nextInt();
            Triangulo triangulo1=new Triangulo(base, altura);
            triangulo1.calcularArea();
            }
   
            else if(desicion==4){
            System.out.println("INGRESE EL VALOR DEL RADIO DEL CIRCULO");
            radio=Lectura.nextFloat();
            Circulo circulo1=new Circulo(radio);
            circulo1.calcularArea();
            }
            i++;
   } 

   System.out.println("¿DESEA CALCULAR EL ÁREA DE OTRA FIGURA GEOMÉTRICA?, DIGITE 0 SI; O CUALQUIER OTRO NÚMERO SI NO");
   i=Lectura.nextInt();
        }

        if(i!=1){
        System.out.println("GRACIAS POR USAR EL PROGRAMA");
    }
    }
     //Lectura.close();   
}