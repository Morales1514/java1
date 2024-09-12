import java.util.Scanner;
//Somando dois numeros

public class Main {
  public static void main(String[] args) {
    //Criando um objeto scanner 
    Scanner scanner = new Scanner(System.in);

    //Digite o primeiro numero
    System.out.println("Digite o primeiro numero: ");
    double num1 = scanner.nextDouble();

    //Digite o primeiro numero
        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

    //Somando os dois numeros
    double soma = (num1 + num2);

    //Exibindo o resultado
    System.out.println("A soma e:" + soma);
  }
}