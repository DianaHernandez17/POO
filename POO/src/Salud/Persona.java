package Salud;

import java.util.*;
public class Persona {

    //Atributos
   private String tipoDoc; 
   private int documento;
   private String nombre;
   private String apellido;
   private double peso;
   private double estatura;
   private int edad;
   private String sexo;
  // private double pesoActual;


  //MÉTODOS
  //Reto 3
public Persona(String tipoDoc, int documento, String nombre, String apellido, double peso,
 double estatura, int edad, String sexo) {
    this.tipoDoc = tipoDoc;
    this.documento = documento;
    this.nombre = nombre;
    this.apellido = apellido;
    this.peso = peso;
    this.estatura = estatura;
    this.edad = edad;
    this.sexo = sexo;
}

public String getTipoDoc() {
    return tipoDoc;
}

public void setTipoDoc(String tipoDoc) {
    this.tipoDoc = tipoDoc;
}

public int getDocumento() {
    return documento;
}

public void setDocumento(int documento) {
    this.documento = documento;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public double getPeso() {
    return peso;
}

public void setPeso(double peso) {
    this.peso = peso;
}

public double getEstatura() {
    return estatura;
}

public void setEstatura(double estatura) {
    this.estatura = estatura;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public String getSexo() {
    return sexo;
}

public void setSexo(String sexo) {
    this.sexo = sexo;
}

   //RETO 1 Y 2
   public void pedirDatos(){
    try (Scanner Lectura = new Scanner(System.in)) {
        System.out.println("POR FAVOR DIGITE SU TIPO DE DOCUMENTO");
        tipoDoc=Lectura.next();
        System.out.println("POR FAVOR DIGITE SU NÚMERO DE DOCUMENTO");
        documento=Lectura.nextInt();
        System.out.println("POR FAVOR DIGITE SÚ NOMBRE");
        nombre=Lectura.next();
        System.out.println("POR FAVOR DIGITE SU APELLIDO");
        apellido=Lectura.next();
    }
    

    /*//RETO 1 Y 2
    System.out.println("POR FAVOR DIGITE SU PESO");
    peso=Lectura.nextDouble();
    System.out.println("POR FAVOR DIGITE SU ESTATURA");
    estatura=Lectura.nextDouble();
    System.out.println("POR FAVOR DIGITE SU EDAD");
    edad=Lectura.nextInt();
    System.out.println("POR FAVOR INGRESE SU GENERO");
    sexo=Lectura.next();*/
   }
   public void mostrarPersona(){
    System.out.println("SU TIPO DE DOCUMENTO ES: "+tipoDoc);
    System.out.println("SU NÚMERO DE DOCUMENTO ES: "+documento);
    System.out.println("SU NOMBRE ES: "+nombre);
    System.out.println("SU APELLIDO ES: "+apellido);
    System.out.println("SU PESO ES: "+peso);
    System.out.println("SU ESTATURA ES: "+estatura);
    System.out.println("SU EDAD ES: "+edad);
    System.out.println("SU GENERO ES: "+sexo);
   }
   public double calcularImc(double peso, double estatura){
    double pesoActual=peso/estatura/estatura;
    //RETO 2
    return pesoActual;
   }
   //RETO 1
    /*if (pesoActual<20){
        System.out.println("EL PESO ESTÁ POR DEBAJO DE LO IDEAL");
    }
    else if (pesoActual >= 20 && pesoActual <= 25){
        System.out.println("EL PESO ES IDEAL");
    }
    else{
        System.out.println("TIENE SOBREPESO");
    }
   }*/

   public void mayorEdad(){
    if (edad>=18){
        System.out.println("USTED ES MAYOR DE EDAD");
    }
    else{
        System.out.println("USTED ES MENOR DE EDAD");
    
    }
}
   //Lectura.close();
}
    
    
        

   




