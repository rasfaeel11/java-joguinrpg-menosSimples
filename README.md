# 🎮 Mini RPG em Java  

Este é um projeto simples de **RPG em turnos** desenvolvido em **Java**, com foco em **aprendizado de Programação Orientada a Objetos (POO)**.  
O jogador pode escolher uma classe (Guerreiro ou Mago) e batalhar contra um inimigo controlado pela máquina.  

---

## ⚔️ Funcionalidades  

- Escolha de classe do jogador: **Guerreiro** ou **Mago**  
- Sistema de **batalhas em turnos** (jogador x inimigo)  
- Ações do jogador:
  - Ataque físico  
  - Ataque mágico (consome mana)  
  - Usar item (poção de cura)  
- Inimigo com **IA simples**, que escolhe ações com base em vida, mana e chance aleatória  
- Sistema de **crítico e falha crítica** (d20 rolado em cada ataque)  

---

## 🏗️ Estrutura do Projeto  
📂 src
┣ 📂 main
┃ ┗ 📜 Main.java # Classe principal (fluxo do jogo)
┣ 📂 model
┃ ┣ 📜 Personagem.java # Classe abstrata com atributos e métodos base
┃ ┣ 📜 Guerreiro.java # Classe específica para Guerreiros
┃ ┗ 📜 Mago.java # Classe específica para Magos

🎯 Próximas Melhorias

 Sistema de inventário

 Novas classes D&D-Like (Patrulheiro, Paladino, etc.)

 Sistema de alocação de pontos em atributos

 Múltiplos inimigos

 Interface gráfica

 👨‍💻 Autor

Projeto desenvolvido por Rafael Melo como parte dos estudos de Java e POO.
