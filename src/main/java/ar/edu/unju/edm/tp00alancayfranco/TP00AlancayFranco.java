package ar.edu.unju.edm.tp00alancayfranco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Calculadora;
import ar.edu.unju.edm.model.Estudiante;

@SpringBootApplication
public class TP00AlancayFranco{

    public static void main(String [] args){
      SpringApplication.run(TP00AlancayFranco.class, args);
      String nombre= "Ancolay";
      System.out.println("Hola edm, dice" + nombre + " " + darNombre ());
      Estudiante unEstudiante = new Estudiante ();
      unEstudiante.setDNI("45559972");
      unEstudiante.setNombre("Franco");

      System.out.println("El estudiante" + unEstudiante.getNombre() + "Dice WEEEEEEENAS");

      Calculadora UnaCalculadora = new Calculadora();
      UnaCalculadora. setNum1(8);
      UnaCalculadora. setNum2(10);
      System.out.println("El Resultado de esta Suma es: "+ UnaCalculadora.SumaNumeros());
      System.out.println("El Resultado de esta Resta es: "+ UnaCalculadora.RestaNumeros());
      System.out.println("El Resultado de esta Multiplicacion es: "+ UnaCalculadora.MultiplicarNumeros());
      System.out.println("El Resultado de esta Division es: "+ UnaCalculadora.DivisionNumeros());
    }

 public static String darNombre(){
     String NuevoNombre = "y coco";
     return NuevoNombre;
}
}