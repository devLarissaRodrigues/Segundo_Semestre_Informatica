import java.util.*;

class exemplo01{
  public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite a quantidade do estoque: ");
    int quantidade = entrada.nextInt();

    if (quantidade >= 100){
      System.out.print("Suficiente");
      }
      else if (quantidade < 100 && quantidade > 50){
        System.out.print("Avaliar pedido");
      }
    else{
      System.out.print("Fazer um novo pedido");
      
      }
      
      

    
    
  }
}