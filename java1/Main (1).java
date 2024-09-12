import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Criando um objeto scanner para ler o teclado
    Scanner scanner =  new Scanner(System.in);

    //Solicitando o nome do Usuario
    System.out.print("Digite seu nome:");
    String nome = scanner.nextLine();

    //Solicitando a idade do Usuario
    System.out.print("Digite sua idade:");
    String idade = scanner.nextLine();


    //Exibindo o que o usuario digitou no teclado
    System.out.println(" Ola " + nome + "! Sua idade e:" + idade);

    //Fechando o scanner
    scanner.close();
  }
}