import java.util.Scanner;

public class Questao01{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número para cálculo do fatorial: ");
    int num = sc.nextInt();
    int fatorial = num;
    int contador = 1;

    for (int i=1; i<num; i++){
      fatorial *= contador;
      contador += 1;
    }
     System.out.print("O fatorial de " + num + " é " + fatorial);
  }
}