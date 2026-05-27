# MagicFridgeAI

## 📌 Sobre o Projeto

O **MagicFridgeAI** é uma aplicação de geladeira inteligente desenvolvida em Java com Spring Boot.

O objetivo do projeto é permitir que o usuário cadastre os ingredientes disponíveis em sua geladeira e utilize Inteligência Artificial para gerar receitas automaticamente com base nesses ingredientes.

---

## 🚀 Funcionalidades

- ✅ Cadastro de alimentos
- ✅ Listagem de ingredientes
- ✅ Busca de alimentos por ID
- ✅ Atualização de itens
- ✅ Remoção de alimentos
- 🤖 Geração de receitas utilizando IA
- 🌐 API RESTful

---

## 🛠️ Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven
- Lombok
- Banco de Dados SQL
- Inteligência Artificial

---

## 📂 Estrutura do Projeto

```bash
src
 ┣ main
 ┃ ┣ java
 ┃ ┃ ┗ dev.java10x.magicfridgeai
 ┃ ┃ ┣ controller
 ┃ ┃ ┣ model
 ┃ ┃ ┣ repository
 ┃ ┃ ┗ service
 ┃ ┗ resources
 ┗ test
```

---

## 🔥 Endpoints da API

### Criar alimento

```http
POST /food
```

### Listar alimentos

```http
GET /food
```

### Buscar alimento por ID

```http
GET /food/{id}
```

### Atualizar alimento

```http
PUT /food/{id}
```

### Deletar alimento

```http
DELETE /food/{id}
```

---

## 📦 Exemplo de JSON

```json
{
  "name": "Tomate",
  "categoria": "Legume",
  "quantidade": 5,
  "validade": "2026-06-10"
}
```

---

## ▶️ Como Executar o Projeto

### Clonar o repositório

```bash
git clone https://github.com/Marquin25/MagicFridgeAI.git
```

### Entrar na pasta do projeto

```bash
cd MagicFridgeAI
```

### Executar o projeto

```bash
./mvnw spring-boot:run
```

Ou execute diretamente pela IDE.

---

## 📈 Futuras Melhorias

- Integração com API de IA
- Sistema de autenticação
- Interface Web
- Dashboard da geladeira
- Upload de imagens de alimentos
- Sugestões inteligentes de receitas
- Controle de validade dos produtos

---

## 👨‍💻 Autor

Desenvolvido por Marcus Antônio Rodrigues Monteiro Rios de Pina.
