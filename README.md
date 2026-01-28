# Jogo RPG em Java 🎮

Este projeto é um jogo de batalha entre um **Herói** e um **Boss**, desenvolvido em Java.  
O objetivo é derrotar o Boss utilizando diferentes tipos de ataque e estratégias de cura, enquanto o Boss reage de forma aleatória às ações do jogador.

## 🕹️ Como funciona
- O **Herói** começa com uma quantidade fixa de vida e pode realizar diferentes ações:
  - **Curar** (+500 de vida, limitado a 3 vezes).
  - **Atacar com espada** (250 de dano).
  - **Atacar com raio** (250 de dano).
  - **Atacar com fogo** (500 de dano).
- O **Boss** possui vida maior e diferentes poderes de ataque.  
- A cada ação do jogador, o Boss pode contra-atacar de forma aleatória, causando diferentes tipos de dano.
- Existe uma mecânica extra: se o jogador repetir ataques de fogo muitas vezes, o Boss pode “decorar” o padrão e reagir de forma mais forte.

## 🎨 Detalhes
- O jogo utiliza **ASCII art** para representar o Boss durante a batalha.
- As consequências das ações são **aleatórias**, tornando cada partida única.
- O jogo termina quando:
  - O Boss perde toda a vida → vitória do Herói.
  - O Herói perde toda a vida → vitória do Boss.
  - Ambos perdem a vida ao mesmo tempo → empate trágico.

## 🎯 Objetivo
Treinar conceitos de:
- Programação orientada a objetos (classes `Heroi`, `Boss`, `Personagens`).
- Estruturas de repetição e decisão (`while`, `switch`).
- Uso de entrada de dados com `Scanner`.
- Implementação de regras e mecânicas de jogo.

---
