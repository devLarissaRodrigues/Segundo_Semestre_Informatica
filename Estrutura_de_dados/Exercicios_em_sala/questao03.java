import java.util.Scanner;

public class questao03{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = 0;
    int soma = 0;

    while (true){
      System.out.print("Digite um valor: ");
      num = sc.nextInt();
      if (num < 0){
        break;
      }
      else{
        soma += num;
      }
      
    }

    System.out.print("A soma dos números positivos é: " + soma);

    
  }
}