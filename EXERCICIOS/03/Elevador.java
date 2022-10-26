public class Elevador{
  private int atual = 0, total, cap = 6, pessoas;

  public Elevador(){}

  public int getAtual(){
    return atual;
  }

  public int getTotal(){
    return total;
  }

  public int getCap(){
    return cap;
  }

  public int getPessoas(){
    return pessoas;
  }

  public void setAtual(int atual){
    this.atual = atual;
  }

  public void setTotal(int total){
    this.total = total;
  }

  public void setCap(int cap){
    this.cap = cap;
  }

  public void inicializa(){
    total = 10;
    pessoas = 0;
    System.out.println("Elevador ligado");
  }

  public void entra(){
    if(pessoas < cap){
      pessoas = pessoas + 1;
    }else{
      System.out.println("O elevador esta cheio");
    }
  }

  public void sai(){
    if(pessoas != 0){
      pessoas = pessoas - 1;
    }else{
      System.out.println("Não tem mais pessoas dentro do elevador");
    }
  }

  public void sobe(){
    if(atual < total){
      atual = atual + 1;
    }else{
      System.out.println("Você ja esta no ultimo andar");
    }
  }

  public void desce(){
    if(atual != 0){
      atual = atual - 1;
    }else{
      System.out.println("Você esta no terreo");
    }
  }

}