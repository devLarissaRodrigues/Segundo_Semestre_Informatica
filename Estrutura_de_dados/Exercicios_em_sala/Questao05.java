//Criar um vetor com a classe Random.

import java.util.*;

public class Questao05{
  public static void main(String[] args){
    Random objeto = new Random();
    int[] vetor = new int[10];
    for (int contador = 0; contador < vetor.length; contador++){
      vetor[contador] = objeto.nextInt(110);
      }
      System.out.println(Arrays.toString(vetor));
    }
  }

