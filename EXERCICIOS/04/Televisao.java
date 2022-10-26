public class Televisao{
  private int volume = 50 , canal = 7;

  public Televisao(){

  }
  
  public Televisao(int volume, int canal){
    this.volume = volume;
    this.canal = canal;
  }

  public int getVolume(){
    return volume;
  }

  public int getCanal(){
    return canal;
  }

  public void setVolume(int volume){
    this.volume = volume;
  }

  public void setCanal(int canal){
    this.canal = canal;
  }
}