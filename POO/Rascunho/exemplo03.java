import java.util.Scanner;

class exemplo03{
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Digite um valor limite para contar: ");
    int limite = entrada.nextInt();
    for (int i = 1; i <= limite; i++){
      System.out.println(i+ " ");
    }
    
  }
}

  