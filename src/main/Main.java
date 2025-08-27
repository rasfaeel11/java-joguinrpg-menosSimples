package main;
import model.*;

public class Main{
  public static void main(String[] args) {
    Guerreiro guerreiro = new Guerreiro("Artorias");
    Mago mago = new Mago("Gandalf");

    while (guerreiro.estaVivo() && mago.estaVivo()){
      guerreiro.atacar(mago);
      if(!mago.estaVivo()){
        break;
      }
      mago.atacarMagia(guerreiro);
    }

      if(guerreiro.estaVivo()){
        System.out.println(guerreiro.getNome() + "venceu");
      } else{
        System.out.println(mago.getNome() + "venceu");
      }
    
  }
}