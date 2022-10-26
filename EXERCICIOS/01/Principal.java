import java.util.Scanner;

public class Principal{

  public static void main(String[] args){
    String nome;
    int dia, mes, ano;
    float altura;
    Scanner scan = new Scanner(System.in);

    System.out.println("Exercicio 1");
  
    System.out.println("Digite seu nome:");
    nome = scan.nextLine();

    System.out.println("Digite na ordem o dia/mes/ano que você nasceu");
    dia = scan.nextInt();
    mes = scan.nextInt();
    ano = scan.nextInt();

    System.out.println("Digite sua Altura");
    altura = scan.nextFloat();

    for (int i = 0; i < 100; ++i)  
     System.out.println(); 

    Pessoa p1 = new Pessoa(nome, dia, mes, ano, altura);
    p1.imprimir();
    p1.calcularIDADE();
  }

}