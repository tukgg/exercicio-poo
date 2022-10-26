public class Pessoa{
  
  private String nome;
  private int dia, mes, ano;
  private float altura;

  public Pessoa(String nome, int dia, int mes, int ano, float altura){
    this.nome = nome;
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
    this.altura = altura;
  }

  public String getNome(){
    return nome;
  }

  public int getDia(){
    return dia;
  }

  public int getMes() {
    return mes;
  }

  public int getAno(){
    return ano;
  }

  public float getAltura(){
    return altura;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setDia(int dia){
    this.dia = dia;
  }

  public void setMes(int mes){
    this.mes = mes;
  }

  public void setAno(int ano){
    this.ano = ano;
  }

  public void setAltura(float altura){
    this.altura = altura;
  }

  public void imprimir(){
    System.out.println("Nome: " + nome);
    System.out.println("Data de nascimento: " + dia + "/" + mes + "/" + ano);
    System.out.println("Altura: " + altura);
  }

  public void calcularIDADE(){
    int idade = (2022 - ano);
    System.out.println("idade: " + idade + " anos");
  }
}
