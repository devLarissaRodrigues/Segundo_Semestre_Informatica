//Uma instância de uma classe é um objeto
//Sempre fazer uma classe com letra inicial maiúscula
import java.util.*;

public class questao06{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite seu login: ");
    String login = sc.nextLine();
    System.out.print("Digite sua senha: ");
    String senha = sc.nextLine();
    String senhaCorreta = "12345";
    boolean resultado = senha.equals(senhaCorreta);
    
    while (resultado == false){
      System.out.println("Cuidado! Senha incorreta."); 
      System.out.print("Digite sua senha: ");
      senha = sc.nextLine();
      resultado = senha.equals(senhaCorreta);
    }
    System.out.println("Parabéns! " + login + ". Senha Correta!");
    

  // do{
  //   executa tudo que está no bloco, enquanto a condição verdadeira
  // }while(condicao)
    
  }
}