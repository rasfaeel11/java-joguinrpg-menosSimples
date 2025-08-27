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
          System.out.println("Opção inválida, escolhendo Guerreiro por padrão.");
          jogador = new Guerreiro(nomeJogador);
          inimigo = new Mago("Saruman");

        break;
    }

      while(jogador.estaVivo() && inimigo.estaVivo()){
        System.out.println("\n--- Seu turno ---");
        System.out.println("HP: " + jogador.getHp() + " | Mana: " + jogador.getMana());
        System.out.println("Escolha uma ação:");
        System.out.println("[1] - Ataque Físico");
        System.out.println("[2] - Ataque Mágico");
        System.out.println("[3] - Usar Item (poção de cura)");

        int escolhaAcao = input.nextInt();

        switch (escolhaAcao) {
          case 1:
            jogador.atacar(inimigo);
            break;
          case 2:
            jogador.atacarMagia(inimigo);
            break;
          case 3:
            jogador.curar(15);
            break;
          default:
            System.out.println("Ação inválida, turno perdido!");
            break;
        }
        if (!inimigo.estaVivo()){
          break;
        }
        double chance = Math.random();
      System.out.println("\n---Turno do Inimigo---");
      if(inimigo.getHp() <= 15 && inimigo.getMana() >= 5 && chance < 0.3){
        inimigo.curar(10);
      } else if (inimigo.getMana() >= 5 && chance <0.7){
        inimigo.atacarMagia(jogador);
      } else {
        inimigo.atacar(jogador);
      }
      System.out.println("HP: " + inimigo.getHp() + " | Mana: " + inimigo.getMana());
    }

    if(jogador.estaVivo()){
      System.out.println(jogador.getNome() + "venceu");
    } else{
      System.out.println(inimigo.getNome() + "venceu");
    }
    input.close();
  }
}