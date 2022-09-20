import java.util.*;

public class Questao04{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int soma = 0;
    double media;
    int menor = 0;


    for (int i = 1; i < 10; i++){
      System.out.print("Digite um número: ");
      int num = sc.nextInt();
      soma += num;

      if (num < menor || i == 1){
        menor = num;
        

      }
    }

    media = (double) soma/10;

    System.out.println("A média dos números digitados é " + media);
    System.out.print("O menor número digitado foi " + menor);

    
  }
}