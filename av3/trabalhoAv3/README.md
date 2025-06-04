# Trabalho Av3

Este projeto é uma aplicação Java simples que demonstra a estrutura básica de um projeto Java utilizando Maven.

## Estrutura do Projeto

```
trabalhoAv3
├── src
│   └── Main.java
├── .gitignore
├── README.md
└── pom.xml
```

## Como Configurar

1. Certifique-se de ter o Java Development Kit (JDK) e o Apache Maven instalados em sua máquina.
2. Clone este repositório em sua máquina local.

## Como Executar

1. Navegue até o diretório do projeto.
2. Compile o projeto usando o Maven com o comando:
   ```
   mvn clean install
   ```
3. Execute a aplicação com o comando:
   ```
   mvn exec:java -Dexec.mainClass="Main"
   ```

## Dependências

Este projeto pode incluir dependências que serão gerenciadas pelo Maven, conforme especificado no arquivo `pom.xml`.