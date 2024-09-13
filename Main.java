import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quantos números você quer inserir? ");
    int tamanho = scanner.nextInt();

    int[] numeros = new int[tamanho];

    for (int i = 0; i < tamanho; i++){
      System.out.print("Digite o  número" + (i+1) + ": ");
      numeros[i] = scanner.nextInt();
    }

    
System.out.println("Você inseriu os números:  ");
    for(int i = 0; i < tamanho; i++){
      System.out.println(numeros[i]);
    }
    scanner.close();
  }


}