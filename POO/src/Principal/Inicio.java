package Principal;

import Salud.Empleado;

public class Inicio {
    public static void main(String[] args) {
      
        //RETO 1 Y 2
        //Crear objeto-> Instancia de una clase

        /*Persona opcion=new Persona(null, 0, null, null, estatura, estatura, 0, null);

        //INVOCANDO UN MÉTODO
        
        opcion.pedirDatos();
        opcion.mostrarPersona();
        resultado=opcion.calcularImc(peso, estatura);
        if (resultado<20){
            System.out.println("PESOBAJO");
        }
        else if (resultado >= 20 && resultado <= 25){
            System.out.println("PESOIDEAL");
        }
        else{
            System.out.println("SOBREPESO");
        }
        opcion.mayorEdad();*/

        //RETO 3
        Empleado resultado=new Empleado(null, 0, null, null, 0, 0, 0, null, 0, null, null, 0, 0);
        resultado.pedirDatos();
        resultado.pedirEmpleado();
        resultado.mostrarEmpleado();
        resultado.calcularHonorarios();
   }
}