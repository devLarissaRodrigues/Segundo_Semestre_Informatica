import java.util.Scanner;

class questao02 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int a = entrada.nextInt();
    int b = entrada.nextInt();
    int c = entrada.nextInt();
    int d = entrada.nextInt();

    int soma;
    double media;
    
    soma = a + b + c + d;
    media = soma/4;
    System.out.print(media);


  }
}