//Escreva um programa em Java que leia três valores não numéricos para representar a “rua”, “bairro” e “cidade”. No final é exibido o endereço completo do usuário.

import java.util.Scanner;

class Questao01 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    String rua;
    String bairro;
    String cidade;

    System.out.printf("Digite sua rua: ");
    rua = entrada.nextLine();
    
    System.out.printf("Digite seu bairro: ");
    bairro = entrada.nextLine();
    
    System.out.printf("Digite sua cidade: ");
    cidade = entrada.nextLine();

    System.out.printf("O usuário mora na Rua: %s, bairro: %s da cidade: %s", rua, bairro, cidade);
  }
}