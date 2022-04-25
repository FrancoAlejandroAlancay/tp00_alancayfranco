package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
  private int num1;
  private int num2;

  public int getNum1() {
    return num1;
  }
  public int getNum2() {
    return num2;
  }
  public void setNum2(int numero2) {
    this.num2 = numero2;
  }
  public void setNum1(int numero1) {
    this.num1 = numero1;
  }
  public int SumaNumeros(){
    int resultado=num1+num2;
    return resultado;
  }
  public int RestaNumeros(){
    int resultado=num1-num2;
    return resultado;
  }
  public int MultiplicarNumeros(){
    int resultado=num1*num2;
    return resultado;
  }
  public int DivisionNumeros(){
    int resultado;
    if(num2==0){
      System.out.println("NO SE PUEDE DIVIDIR");
      resultado=0;
    }else{
      resultado=num1/num2;
    }
    return resultado;
  }
  public int PotenciaNumeros(){
    int resultado=1;
    for(int i=1;i<=num2;i++){
      resultado = resultado*num1;
    }
    return resultado;
  }
  public double RaizNumero(){
    double resultado;
    resultado=Math.sqrt(num1);
    return resultado;
  }
}