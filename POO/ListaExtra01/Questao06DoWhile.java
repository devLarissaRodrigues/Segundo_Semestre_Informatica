//Uma instância de uma classe é um objeto
//Instância: valores que são atribuídos para a entidade
//Sempre fazer uma classe com letra inicial maiúscula
import java.util.*;

public class Questao06DoWhile{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite seu login: ");
    String login = sc.nextLine();
    boolean resultado;
    
    do{
      System.out.print("Digite sua senha: ");
      String senha = sc.nextLine();
      resultado = senha.equals("12345");
      if (!resultado){
        System.out.println("Cuidado! Senha incorreta!");
      }
    }while(!resultado);
    
    System.out.println("Parabéns, " + login + ". Senha correta!");
  
    
  }
}