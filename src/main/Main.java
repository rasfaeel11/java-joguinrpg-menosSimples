package main;
import model.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Seja bem vindo ao Jogo mini RPG");
    System.out.println("por favor, digite seu nome de jogador: ");
    String nomeJogador = input.nextLine();

   System.out.println("Escolha sua classe: ");
   System.out.println("[1] Guerreiro");
   System.out.println("[2] Mago");
   int escolhaClasse = input.nextInt();

   Personagem jogador;
   Personagem inimigo;
   switch (escolhaClasse) {
    case 1:
      jogador = new Guerreiro(nomeJogador);
      inimigo = new Mago("Saruman");
      break;
    case 2:
      jogador = new Mago(nomeJogador);
      inimigo = new Guerreiro("Artorias");
      break;
    default:
      break;
   }

    if(jogador.estaVivo()){
      System.out.println(jogador.getNome() + "venceu");
    } else{
      System.out.println(inimigo.getNome() + "venceu");
    }
    input.close();
  }
}