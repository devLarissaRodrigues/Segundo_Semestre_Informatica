//Escreva um programa que determine o grau de obesidade de uma pessoa, sendo fornecido como entrada o peso (em kilogramas) e a altura (em metros) da pessoa. O grau de obesidade é determinado pelo IMC – Índice de Massa Corpórea (IMC = Peso / Altura2).
import java.util.*;

public class Questao02{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite seu peso (em kilogramas): ");
    double peso = sc.nextDouble();
    System.out.print("Digite sua altura (em metros): ");
    double altura = sc.nextDouble();
    String msg;

    double imc = peso/(Math.pow(altura,2));
    if (imc < 18.5){
      msg = "Você está abaixo do peso ideal";
    }
    else if (imc >= 18.5 && imc <= 24.9){
      msg = "Parabéns — você está em seu peso normal!";
    }
    else if (imc >= 25 && imc <= 29.9){
      msg = "Você está acima de seu peso (sobrepeso)";      
    }
    else if (imc >= 30 && imc <= 34.9){
      msg = "Obesidade grau I";
    }
    else if (imc >= 35 && imc <= 39.9){
      msg = "Obesidade grau II";
    }
    else{
      msg = "Obesidade grau III";
    }
    System.out.printf(msg + ". Seu IMC é %.2f", imc);
  }
}