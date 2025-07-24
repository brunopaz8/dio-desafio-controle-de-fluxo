# 📚 Desafio de Contador em Java 🔢

Este projeto foi desenvolvido como parte de um desafio de código proposto pela DIO (Digital Innovation One), com o objetivo de praticar e testar conhecimentos sobre controle de fluxo em Java.

---

## 💡 Proposta

Este repositório contém um pequeno projeto em Java que simula um contador numérico baseado em parâmetros informados pelo usuário.

---

## 🛠️ Tecnologias

* **Java 17+**
  - Programação orientada a objetos(POO)
  - Tratamento de exceções

---

## 🔧 Funcionalidades

* O programa solicita dois números inteiros.
* Se o primeiro número for **maior que o segundo**, uma exceção personalizada (`ParametrosInvalidosException`) é lançada.
* Caso contrário, o programa **conta do primeiro número até o segundo**, exibindo os números no console.

---

## 📂 Estrutura

```
dio-desafio-controle-de-fluxo/
├── src/
│   ├── handler/
│   │    └── ParametrosInvalidosException.java
│   └── Contador.java
├── .gitignore
└── README.md
```

---

## 🚀 Como Executar o Projeto

1️⃣ **Clone o repositório:**

```bash
git clone https://github.com/brunopaz8/dio-desafio-controle-de-fluxo.git
```

2️⃣ **Navegue até o diretório do projeto:**

```bash
cd dio-desafio-controle-de-fluxo
```

3️⃣ **Compile os arquivos Java:**

```bash
javac Contador.java ParametrosInvalidosException.java
```

4️⃣ **Execute o programa:**

```bash
java Contador
```

> Certifique-se de ter o [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) instalado na sua máquina.

