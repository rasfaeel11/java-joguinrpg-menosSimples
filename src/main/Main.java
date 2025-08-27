package main;
import model.*;
import java.util.Random;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) { 
    // criacao do scanner
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    Personagem[] inimigosPossiveis = {
    new Guerreiro("Artorias"),
    new Mago("Saruman"),
    new Barbaro("Conan"),
    new Feiteceiro("Gandalf"),
    new Monge("Li Shang"),
    new Paladino("Uther"),
    new Patrulheiro("Legolas")
};

    // Introducao do Jogo
    System.out.println("Seja bem vindo ao Jogo mini RPG");
    System.out.println("por favor, digite seu nome de jogador: ");
    String nomeJogador = input.nextLine();

    //Selecao de Classes
    System.out.println("Escolha sua classe: ");
    System.out.println("[1] Guerreiro");
    System.out.println("[2] Mago");
    System.out.println("[3] Barbaro");
    System.out.println("[4] Feiticeiro");
    System.out.println("[5] Monge");
    System.out.println("[6] Paladino");
    System.out.println("[7] Patrulheiro");
    int escolhaClasse = input.nextInt();


    // Criacao dos objetos
    Personagem jogador;
    Personagem inimigo;

    // selecao das escolhas
    switch (escolhaClasse) {
      case 1:
        jogador = new Guerreiro(nomeJogador);
        break;
      case 2:
        jogador = new Mago(nomeJogador);
        break;
      case 3:
        jogador = new Barbaro(nomeJogador);
        break;

      case 4:
        jogador = new Feiteceiro(nomeJogador);
        break;

      case 5:
        jogador = new Monge(nomeJogador);
        break;

      case 6:
        jogador = new Paladino(nomeJogador);
        break;

      case 7:
        jogador = new Patrulheiro(nomeJogador);
        break;

      default:
          System.out.println("Opção inválida, escolhendo Guerreiro por padrão.");
          jogador = new Guerreiro(nomeJogador);

          break;
    }
    int indice = random.nextInt(inimigosPossiveis.length);
    inimigo = inimigosPossiveis[indice];
    System.out.println("Inimigo selecionado: " + inimigo.getNome());


      // loop do jogo
      while(jogador.estaVivo() && inimigo.estaVivo()){
        System.out.println("\n--- Seu turno ---");
        System.out.println("HP: " + jogador.getHp() + " | Mana: " + jogador.getMana() + " | Pocoes: " + jogador.getPocaoDeVida());
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
      if(inimigo.getPocaoDeVida() > 0 && inimigo.getHp() <= 15 && chance < 0.3){
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