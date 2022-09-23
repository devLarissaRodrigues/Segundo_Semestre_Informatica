//Faça um programa que recebe de entrada uma String e imprime na saída: a) O número de caracteres da string digitada. b) A String digitada em letras maiúsculas c) A String digitada em letras minúsculas d) Os cinco primeiros caracteres da string digitada 

import java.util.Scanner;

public class Questao02{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um nome: ");
    String entrada = sc.nextLine();

    int numeroCaracteres = entrada.length();
    String maiusculas = entrada.toUpperCase();
    String minusculas = entrada.toLowerCase();
    String cincoPrimeirosCaracteres = entrada.substring(0,5);

    System.out.println("Número de caracteres: " + numeroCaracteres);
    System.out.println("Entrada em letras maiúsculas: " + maiusculas);
    System.out.println("Entrada em letras minúsculas: " + minusculas);
    System.out.print("Cinco primeiros caracteres: " + cincoPrimeirosCaracteres);

    }
}