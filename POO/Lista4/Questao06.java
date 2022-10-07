// Guarde em um array o nome de cinco pessoas e no outro os telefones. Solicite para o usuário digitar um nome para consulta. Encontrando este nome, exiba o telefone desta pessoa.   

import java.util.*;

public class Questao06{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String [] nomes = {"ANA", "BIA", "IURY", "REBECA", "ANDRE"};
    String [] telefones = {"(83) 981111-0000", "(83) 981111-1111", "(83) 981111-2222", "(83) 981111-3333", "(83) 981111-4444"};

    System.out.print("Digite um nome: ");
    String nome = sc.nextLine().toUpperCase();
    
    for(int i=0; i<nomes.length; i++){
        if(nome.equals(nomes[i])){
          System.out.printf("O telefone de %s é %s .", nome, telefones[i]);
          break;
      }  
    } 
  }
}