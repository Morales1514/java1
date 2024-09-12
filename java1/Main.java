//Exemplo 3 
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // entrada de dados
    System.out.println("Digite o primeiro numero: ");
    double num1 = scanner.nextDouble();

    //Digite o primeiro numero
        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

    //Processando dados
    double res = num1 * num2;

    //Saida de dados
    System.out.println("O resultado da multiplicação dos numeros informados e igual a:" + res);
    scanner.close();
  }
}
