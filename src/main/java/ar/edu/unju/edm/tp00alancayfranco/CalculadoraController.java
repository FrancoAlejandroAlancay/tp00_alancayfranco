package ar.edu.unju.edm.tp00alancayfranco;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Calculadora;

@Controller
public class CalculadoraController {

  @GetMapping("/menu")
  public String mostrarMenuCalculadora(){
    return "index";
  }
  
  @GetMapping ("/CalculoDeLaSuma")
  public String getSumaPage (@RequestParam (name = "num1") int num1, @RequestParam(name ="num2") int num2, Model model){
    int resultado=0;
    Calculadora nuevaCalculadora = new Calculadora();
    nuevaCalculadora.setNum1(num1);
    nuevaCalculadora.setNum2(num2);
    resultado = nuevaCalculadora.SumaNumeros();
    model.addAttribute("Resultados",resultado);
    return "Resultado";

  }

  @GetMapping ("/CalculoDeLaResta")
  public String getRestaPage (@RequestParam (name = "num1") int num1, @RequestParam(name ="num2") int num2, Model model){
    int resultado=0;
    Calculadora nuevaCalculadora = new Calculadora();
    nuevaCalculadora.setNum1(num1);
    nuevaCalculadora.setNum2(num2);
    resultado = nuevaCalculadora.RestaNumeros();
    model.addAttribute("Resultador",resultado);
    return "Resultado";

  }
  
  @GetMapping ("/CalculoDeLaMultiplicacion")
  public String getMultiplicacionaPage (@RequestParam (name = "num1") int num1, @RequestParam(name ="num2") int num2, Model model){
    int resultado=0;
    Calculadora nuevaCalculadora = new Calculadora();
    nuevaCalculadora.setNum1(num1);
    nuevaCalculadora.setNum2(num2);
    resultado = nuevaCalculadora.MultiplicarNumeros();
    model.addAttribute("Resultadom",resultado);
    return "Resultado";

  }

  @GetMapping ("/CalculoDeLaDivision")
  public String getDivisionPage (@RequestParam (name = "num1") int num1, @RequestParam(name ="num2") int num2, Model model){
    int resultado=0;
    Calculadora nuevaCalculadora = new Calculadora();
    nuevaCalculadora.setNum1(num1);
    nuevaCalculadora.setNum2(num2);
    resultado = nuevaCalculadora.DivisionNumeros();
    model.addAttribute("Resultadod",resultado);
    return "Resultado";

  }

  @GetMapping ("/CalculoDeLaPotencia")
  public String getPotenciaPage (@RequestParam (name = "num1") int num1, @RequestParam(name ="num2") int num2, Model model){
    int resultado=0;
    Calculadora nuevaCalculadora = new Calculadora();
    nuevaCalculadora.setNum1(num1);
    nuevaCalculadora.setNum2(num2);
    resultado = nuevaCalculadora.PotenciaNumeros();
    model.addAttribute("Resultadop",resultado);
    return "Resultado";

  }

}