import java.util.Scanner;

public class Principal {
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Elevador ev1 = new Elevador();

    ev1.inicializa();

    int x = 1;
    while( x == 1){

      for (int i = 0; i < 100; ++i)  
     System.out.println(); 
      
      int opcao;

      System.out.println("Escolha uma opção");
      System.out.println("1 - Entrar uma pessoa");
      System.out.println("2 - Sair uma pessoa");
      System.out.println("3 - Subir um andar");
      System.out.println("4 - Descer um andar");

      opcao = scan.nextInt();

      
      switch (opcao){
        case 1:
          ev1.entra();
          break;
        case 2:
          ev1.sai();
          break;
        case 3:
          ev1.sobe();
          break;
        case 4:
          ev1.desce();
          break;
        default:
          System.out.println("Numero invalido");  
      }

      System.out.println("Deseja fazer outra operação?[1]Sim [2]Não");
      x = scan.nextInt();
      if( x != 1){
        for (int i = 0; i < 100; ++i)  
          System.out.println(); 
        System.out.println("Elevador parou");
        System.out.println("Pessoas: " + ev1.getPessoas());
        System.out.println("Andar: " + ev1.getAtual());
      }

    }

  }

}
