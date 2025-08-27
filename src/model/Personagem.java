package model;
import java.util.Random;

public abstract class Personagem{
   // atributos
  private String nome;
  private int hp;
  private int mana;
  private int forca;
  private int inte;
  private int defesa;
  private int danoBase;

  private Random random = new Random();

  public Personagem(String nome, int hp, int mana, int forca, int inte, int defesa, int danobase){
    this.nome = nome;
    this.hp = hp;
    this.mana = mana;
    this.forca = forca;
    this.inte = inte;
    this.defesa = defesa;
    this.danoBase = danobase;
  }

  public int atacar(Personagem alvo){
     int rolagemD20 = random.nextInt(20) + 1;

     if(rolagemD20 == 1){
      System.out.println("Errou o ataque");
      return 0;
     }
     int dano = (danoBase + forca) + rolagemD20 - alvo.defesa;
     
     if(rolagemD20 == 20){
      System.out.println("CRITICO");
      dano *= 2;
     }
     // verificacao necessaria para nao curar o inimigo
     if(dano < 0){
      dano = 0;
     }

     alvo.receberDano(dano);
     System.out.println(nome + " causou " + dano + "de dano em " + alvo.nome);

     return dano;
  }

  public int atacarMagia(Personagem alvo){
    if (mana < 5){
      System.out.println("Mana insuficiente");
      return 0;
    }
    int rolagemD20 = random.nextInt(20) + 1;

    if (rolagemD20 == 1){
      System.out.println("ERRO CRITICO");
      return 0;
    }
    mana -= 5;
    int dano = (danoBase + inte) + rolagemD20 - alvo.defesa;
    
    if(rolagemD20 == 20){
      System.out.println("ACERTO CRITICO");
      dano *= 2;
    }
    if(dano < 0){
      dano = 0;
    }

    alvo.receberDano(dano);
    System.out.println(nome + " causou " + dano + "de dano atraves de magia em " + alvo.nome);
    return dano;
  }

  public void receberDano(int dano){
    this.hp -= dano;
    if(hp < 0){
      hp = 0;
    }
  }

  public boolean estaVivo(){
    return hp > 0;
  }

  public String getNome(){
    return nome;
  }
  public int getHp(){
    return hp;
  }
  public int getMana(){
    return mana;
  }

}


  
