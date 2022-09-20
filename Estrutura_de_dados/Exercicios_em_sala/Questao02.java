import java.util.*;

public class Questao02{
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    System.out.print("Preço do pão: R$ ");
    double preco = entrada.nextDouble();
    System.out.print("Panificadora Pão de Ontem - Tabela de preços\n");

    for (int i = 1; i <= 50; i++){
      System.out.printf("%02d - R$ %.2f\n", i, preco * i);
      
    }
    
  }
}