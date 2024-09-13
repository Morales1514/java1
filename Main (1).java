import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Scanner scanner = new Scanner(System.in);

    System.out.println("Quantas numeros voce deseja inserir?");
    int tamanho = scanner.nextInt();

    int[] numeros = new int[tamanho];

    for (int i = 0; i < tamanho; i++) {
      System.out.println("Digite o número " + (i + 1) + ": ");
      numeros[i] = scanner.nextInt();
    }

    Arrays.sort(numeros);

    for (int i = 0; i < tamanho; i++) {
      System.out.println(numeros[i]);
    }

    scanner.close();
  }
}