//Determinar o índice do maior elemento de um vetor;

import java.util.*;

public class Questao06{
  public static void main(String[] args){
    Random objeto = new Random();
    int[] vetor = new int[10];
    int maior=0, posicao=0;

    for (int contador = 0; contador < vetor.length; contador++){
      vetor[contador] = objeto.nextInt(110);
      
      if(vetor[contador] > maior || contador == 0){
        maior = vetor[contador];
        posicao = contador;
      }
    }
      System.out.println(Arrays.toString(vetor));  
      System.out.println(posicao);
  }
}
