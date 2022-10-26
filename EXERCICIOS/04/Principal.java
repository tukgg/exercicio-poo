import java.util.Scanner;

public class Principal{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Televisao t1 = new Televisao();
    Controle c1 = new Controle();

    int resposta = 1;

    while ( resposta == 1 ){

      int opcao;

      System.out.println("Digite o que gostaria de fazer:");
      System.out.println("1-Aumentar volume");
      System.out.println("2-Diminuir dolume");
      System.out.println("3-Aumentar canal");
      System.out.println("4-Diminuir canal");
      System.out.println("5-Escolher canal");
      System.out.println("6-Visualizar volume e canal");

      opcao = scan.nextInt();

      switch(opcao){
        case 1:
          c1.aumentarVolume(t1);
          break;
        case 2:
          c1.diminuirVolume(t1);
          break;
        case 3:
          c1.aumentarCanal(t1);
          break;
        case 4:
          c1.diminuirCanal(t1);
          break;
        case 5:
          c1.escolherCanal(t1);
          break;
        case 6:
          c1.visualizar(t1);
          break;
        }
        
        System.out.println("Deseja realizar outra operação?[1]SIM [2]Não");
        resposta = scan.nextInt();
        if( resposta != 1 ){
        System.out.println("Operação finalizada");
        System.out.println("Canal: " + t1.getCanal());
        System.out.println("Volume: " + t1.getVolume());
      }

    }

  }
  
}
