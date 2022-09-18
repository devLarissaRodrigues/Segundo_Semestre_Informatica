//Escreva um programa que leia um número e imprima na tela os seus 30 sucessores
import java.util.Scanner;

public class Questao04{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int num = sc.nextInt();

    for (int i=num+1; i<=num+30; i++){
      System.out.println(i);
    }
    
  }
}