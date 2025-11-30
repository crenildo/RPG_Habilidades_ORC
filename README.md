# 🐲 RPG Orc Abilities — Java OOP Project

Um projeto Java focado em **Programação Orientada a Objetos**, demonstrando conceitos avançados como:

* Herança
* Classes Abstratas
* Interfaces (contratos)
* Delegação / Traits Pattern
* Baixo acoplamento
* Alta coesão
* Modelagem de personagens em RPG

Este projeto modela um **Orc** com diferentes habilidades, organizadas de maneira profissional e seguindo padrões utilizados no desenvolvimento backend.

---

## 📌 Objetivo do Projeto

Demonstrar como estruturar um sistema orientado a objetos limpo, modular e extensível, através da criação de:

* Uma **raça (ORC)** como classe abstrata
* Um **conjunto de habilidades** definido por uma interface
* Uma **implementação concreta** dessas habilidades via Traits
* Uma **classe final** que representa um Orc completo e funcional no jogo

---

# 🧠 Arquitetura do Código

A estrutura foi organizada da seguinte forma:

```
ORC (abstract)
   ↑
ORCs (concreta) —— implements —— ITOrc (interface)
                           ↓
                     OrcTraits (classe auxiliar)
```

### ✔ **ORC (classe abstrata)**

Define **o que um Orc é** (atributos como nome, idade, posição hierárquica).

### ✔ **ITOrc (interface)**

Define **o que um Orc deve saber fazer** (habilidades obrigatórias):

* furia()
* grito()
* autoDestruicao()

### ✔ **OrcTraits (classe auxiliar — Traits Pattern)**

Implementa os métodos da interface.
Centraliza a lógica das habilidades.

### ✔ **ORCs (classe final)**

É o **personagem jogável**:

* estende a raça ORC
* implementa as habilidades da interface
* delega a execução para a classe Traits
* adiciona comportamento adicional (mensagens narrativas do RPG)

---

# 🧩 Por que usar Traits?

Esse padrão permite:

* ✔ Código mais organizado
* ✔ Facilidade para trocar comportamentos
* ✔ Evita duplicação
* ✔ Representa múltiplos “tipos” sem herança múltipla
* 
Empresas usam esse estilo para **modularizar habilidades**, regras, comportamentos e lógicas reaproveitáveis.

---

# 🕹 Exemplo de Execução

Saída simplificada ao rodar o `main`:

```
Nome: Gorak, o Destruidor
Idade: 237
Posição Hierarquica: General

Gorak, o Destruidor está ativando a habilidade FÚRIA!
Habilidade FÚRIA! aumenta a força e regeneração!

Gorak, o Destruidor está ativando a habilidade GRITO!
GRITO! aumenta a força e velocidade de feras aliadas!

Gorak, o Destruidor está ativando a habilidade AUTO DESTRUIÇÃO!
AUTO DESTRUIÇÃO! causa uma explosão massiva!

Estado atual:
FÚRIA!
Habilidade FÚRIA ficará ativa até o fim do combate!
```

---

# 🚀 Como Executar

1. Clone o repositório:

```
https://github.com/crenildo/RPG_Habilidades_ORC/blob/main/README.md
```

2. Abra no IntelliJ ou VS Code
3. Execute a classe **Main.java**
4. Veja a magia acontecer 🐉🔥

---

# 🛠 Tecnologias Utilizadas

* Java 17+
* Programação Orientada a Objetos
* Padrões de Projeto (Traits / Delegation)

---

# 📚 Conceitos Demonstrados

Este projeto mostra domínio de:

* ✔ Herança
* ✔ Polimorfismo
* ✔ Contratos via Interface
* ✔ Classes Abstratas
* ✔ Delegação
* ✔ Separação de responsabilidades
* ✔ Arquitetura limpa para objetos de jogo (RPG)

É um excelente exemplo de modelagem OO para portfolio.

---

# 🤝 Contribuições

Sugestões são bem-vindas!
Sinta-se livre para abrir **Issues** ou **Pull Requests**.

---

# 🧙 Autor

Projeto feito para estudo e demonstração de domínio de OOP.
**Desenvolvedor:** Crenildo Oliveira

---
