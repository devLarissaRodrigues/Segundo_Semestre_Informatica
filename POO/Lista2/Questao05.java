//Escreva um programa que calcule e mostre a soma de todos os números pares de 1 até 100

public class Questao05{
  public static void main(String[] args){
    int soma = 0;
    
    for(int i=1; i<=100; i++){
      if (i%2==0){
        soma += i;
      }
    }
    System.out.print("A soma de todos os números pares de 1 até 100 é " + soma);
    }
  }