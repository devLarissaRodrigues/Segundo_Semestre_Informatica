import java.util.*;

public class Questao01{
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite sua idade: ");
    int idade = entrada.nextInt();
    double peso = entrada.nextDouble();
    int risco = 0; 


    if (idade <= 20 && peso <= 60.0){
      risco = 9;
    }
    else if (idade <= 20 && peso > 60.0 && peso <= 90.0){
      risco = 8;
    }
    else if (idade <= 20 && peso > 90.0){
      risco = 7;
    }
     else if (idade >= 21 && idade <= 50 && peso <= 60.0){
      risco = 6;
    }
    else if (idade >= 21 && idade <= 50 && peso > 60.0 && peso <= 90.0){
      risco = 5;
    }
    else if (idade >= 21 && idade <= 50.0 && peso > 90.0){
      risco = 4;
    }
    else if (idade > 50 && peso <= 60.0){
      risco = 3;
    }
    else if (idade > 50 && peso > 60.0 && peso <= 90.0){
      risco = 2;
    }
    else{
      risco = 1;
    }
    
    
  System.out.print("Você faz parte do grupo de risco: " + risco);
    
  }
}