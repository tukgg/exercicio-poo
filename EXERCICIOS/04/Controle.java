import java.util.Scanner;

public class Controle {

  public void aumentarVolume(Televisao tv){
    tv.setVolume(tv.getVolume() + 1);
  }

  public void diminuirVolume(Televisao tv){
    tv.setVolume(tv.getVolume() - 1);
  }

  public void aumentarCanal(Televisao tv){
    tv.setCanal(tv.getCanal() + 1);
  }

  public void diminuirCanal(Televisao tv){
    tv.setCanal(tv.getCanal() - 1);
  }

  public void escolherCanal(Televisao tv){
    int escolha;
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o numero do canal:");
    escolha = scan.nextInt();
    tv.setCanal(escolha);
  }

  public void visualizar(Televisao tv){
    System.out.println("Canal: " + tv.getCanal());
    System.out.println("Volume: " + tv.getVolume());
  }
}
