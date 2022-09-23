//Faça um algoritmo que recebe dez números, ao final calcule e mostre: a) A soma dos números digitados; b) A média dos números digitados; c) O maior número digitado; d) O menor número digitado; e) A quantidade de números pares digitados; f) A quantidade de números impares digitados; g) A quantidade de números positivos digitados; h) A quantidade de números negativos digitados.

import java.util.Scanner;

public class QuestaoExtra{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double num, media;
    double soma = 0.0;
    double maior = 0.0;
    double menor = 0.0;
    int pares = 0;
    int impares = 0;
    int positivos = 0;
    int negativos = 0;

    for (int i=0; i<10; i++){
      System.out.print("Digite um número: ");
      num = sc.nextDouble();
      soma += num;
      if(num>maior || i == 0){
        maior = num;
      }
      if(num<menor || i == 0){
        menor = num;
      }
      if(num %2 ==0.0){
        pares += 1;
      }
      else{
        impares += 1;
      }
      if (num >= 0){
        positivos += 1;
      }
      else{
        negativos += 1;
      }
    }
    media = soma/10;
  

    System.out.println("Soma: " + soma);  
    System.out.println("Média: " + media);
    System.out.println("Maior número digitado: " + maior);
    System.out.println("Menor número digitado: " + menor);
    System.out.println("Foram digitados " + pares + " números pares");
    System.out.println("Foram digitados " + impares + " números ímpares");
    System.out.println("Foram digitados " + positivos + " números positivos");
    System.out.println("Foram digitados " + negativos + " números negativos");
  }
}