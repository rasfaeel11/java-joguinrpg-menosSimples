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
📂 src <br>
┣ 📂 main <br>
┃ ┗ 📜 Main.java # Classe principal (fluxo do jogo) <br>
┣ 📂 model <br>
┃ ┣ 📜 Personagem.java # Classe abstrata com atributos e métodos base <br>
┃ ┣ 📜 Guerreiro.java # Classe específica para Guerreiros <br>
┃ ┣ 📜 Mago.java # Classe específica para Magos <br>
┃ ┣ 📜 Barbaro.java # Classe específica para Bárbaros <br>
┃ ┣ 📜 Feiticeiro.java # Classe específica para Feiticeiros <br>
┃ ┣ 📜 Monge.java # Classe específica para Monges <br>
┃ ┣ 📜 Paladino.java # Classe específica para Paladinos <br>
┃ ┗ 📜 Patrulheiro.java # Classe específica para Patrulheiros <br>


| Classe      | HP | Mana | Força | Inteligência | Defesa | Dano Base | Poções de Vida | Estilo                                       |
| ----------- | -- | ---- | ----- | ------------ | ------ | --------- | -------------- | -------------------------------------------- |
| Guerreiro   | 50 | 10   | 7     | 2            | 4      | 5         | 3              | Corpo a corpo resistente, dano físico        |
| Mago        | 35 | 30   | 2     | 7            | 2      | 4         | 3              | Ataques mágicos poderosos, frágil            |
| Bárbaro     | 60 | 10   | 8     | 2            | 4      | 6         | 1              | Dano bruto, pouca magia, resistente          |
| Feiticeiro  | 35 | 40   | 2     | 8            | 2      | 4         | 2              | Magias poderosas, frágil fisicamente         |
| Monge       | 40 | 20   | 7     | 4            | 3      | 5         | 1              | Corpo a corpo ágil, ataques especiais        |
| Paladino    | 55 | 25   | 6     | 4            | 5      | 5         | 2              | Defesa sólida, suporte com cura              |
| Patrulheiro | 45 | 15   | 5     | 3            | 3      | 6         | 3              | Ataques rápidos e consistentes, baixa defesa |

🎯 Próximas Melhorias

 Sistema de inventário

 Criacao de Personagem Proprio

 Sistema de alocação de pontos em atributos

 Múltiplos inimigos

 Interface gráfica

 👨‍💻 Autor

Projeto desenvolvido por Rafael Melo como parte dos estudos de Java e POO.
