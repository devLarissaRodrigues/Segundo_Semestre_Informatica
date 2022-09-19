import java.util.Scanner;

class Questao01{
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o número referente ao seu destino: (Norte – 1, Nordeste – 2, Centro-Oeste – 3 e Sul – 4)");
    int destino = entrada.nextInt();
    System.out.print("Digite 1 se sua passagem é de ida e 2 se é ida e volta: ");
    int passagem = entrada.nextInt();
    double preco;
    String regiao, valor;
    
valor = "";
    
      if (destino == 1){
      regiao = "Norte";
        if (passagem == 1){
valor = "R$ 500,00";      
        }
        else{
          valor = "R$ 900,00";
        }
    }
      else if (destino == 2){
        regiao = "Nordeste";
        if (passagem == 1){
valor = "R$ 350,00";      
        }
        else{
          valor = "R$ 650,00";
        }
      }
    else if (destino == 3){
      regiao = "Centro-Oeste";
      if (passagem == 1){
valor = "R$ 350,00";      
        }
        else{
          valor = "R$ 600,00";
        }
    }
      else if (destino == 4){
        regiao = "Sul";
        if (passagem == 1){
valor = "R$ 300,00";      
        }
        else{
          valor = "R$ 550,00";
        }
      }
  

    System.out.print("O valor da sua passagem é: " + valor);
    
  }
}