package model;

public abstract class Personagem{
   // atributos
  private String nome;
  private int hp;
  private int mana;
  private int forca;
  private int inte;
  private int defesa;
  private int danoBase;

  public Personagem(String nome, int hp, int mana, int forca, int inte, int defesa, int danobase){
    this.nome = nome;
    this.hp = hp;
    this.mana = mana;
    this.forca = forca;
    this.inte = inte;
    this.defesa = defesa;
    this.danoBase = danobase;
  }

}


  
