<h1 align="center">
   DSDelivery
</h1>


![index](https://user-images.githubusercontent.com/87610833/188266118-16a24cf7-c35c-4e66-9270-aa977539b392.png)
## 📃 Sobre

**DSDeliver** é o projeto desenvolvido durante a **Semana DevSuperior 2.0**, um evento online produzido pela [**DevSuperior**](https://github.com/devsuperior) com duração de uma semana.

## ✨ Features

✔ Listagem de produtos via API (backend).

✔ Seleção de items do pedido

✔ Busca de endereços através de um mapa interativo e dinâmico

✔ Validação e finalização de pedidos

✔ Layout responsivo

## 🚀 Tecnologias utilizadas
Este projeto foi desenvolvido com as seguintes tecnologias:

- [**JDK 17**](https://www.oracle.com/java/technologies/downloads/#java17): Java Development Kit 17 - um kit de desenvolvimento para construção de aplicações e componentes usando a linguagem de programação Java;

- [**STS (Spring Tool Suite)**](https://spring.io/tools): um ambiente de desenvolvimento baseado em Eclipse, personalizado para desenvolvimento de aplicações Spring;

- [**Postman**](https://www.postman.com/): uma ferramenta que tem como objetivo testar serviços RESTful (Web APIs) por meio do envio de requisições HTTP e da análise do seu retorno;


- [**Git**](https://git-scm.com/downloads): o sistema de controle de versão distribuído de código aberto mais utilizado;

- [**Visual Studio Code**](https://code.visualstudio.com/): um editor de código-fonte desenvolvido pela Microsoft para Windows, Linux e macOS, recomendado para o desenvolvimento de aplicações web;

- [**Node.js**](https://nodejs.org/en/): um interpretador de JavaScript assíncrono com código aberto orientado a eventos;

- [**TypeScript**](https://www.typescriptlang.org/): um super conjunto da linguagem JavaScript que fornece classes, interfaces e tipagem estática opcional. Utilizado em conjunto com React no frontend web;

- [**React**](https://reactjs.org): uma biblioteca JavaScript de código aberto com foco em criar interfaces de usuário (frontend) em páginas web. É mantido pelo Facebook, Instagram, outras empresas e uma comunidade de desenvolvedores individuais. É utilizado nos sites da Netflix, Imgur, Feedly, Airbnb, SeatGeek, HelloSign, Walmart e outros;

- [**H2**](https://www.h2database.com/): um banco de dados em memória para testes de seed na aplicação.
## 📟 Layout
<p align="center">Tela inicial</p>
<img align="center" alt="pagina-inicial" src="https://user-images.githubusercontent.com/87610833/188266460-1fd87137-b01d-4411-b60f-ebb9ea26f60c.png">

<p align="center">Tela de pedidos</p>
<img align="center" alt="pagina-pedidos" src="https://user-images.githubusercontent.com/87610833/188266824-6fc33b7a-7475-4a73-8a51-522a674195c3.png">

## 🔧 Instalação e execução

Para baixar o código-fonte do projeto em sua máquina, primeiramente terá que ter instalado o [**Git**](https://git-scm.com/).

Com o Git instalado, em seu terminal execute o seguinte comando:

```bash
$ git clone git@github.com:luanraffaell/Ds-delivery.git
```

### Backend

- Com o projeto baixado, abra-o em sua IDE (Spring Tool Suite).
- Aguarde enquanto o maven baixe as dependências do projeto.
- Recomendo que após o download das dependência você dê um "clean" no projeto através da aba "project/clean"
- Execute o arquivo **`DsdeliverApplication.java`**.
- A aplicação Spring Boot será executada no endereço: _**`http://localhost:8080/`**_.

---
### Frontend web

Para instalar e executar o frontend-web do DSDeliver, terá que ter instalado em sua máquina também o [**Node.js**](https://nodejs.org/en/).

1. Vá até a pasta front-web do repositório:
   ```bash
   $ cd front-web
   ```
2. Instale as dependências do projeto:
   ```bash
   $ npm install
   ```
   Atenção, antes de executar a aplicação React:

> Para a busca de endereços no mapa, foi utilizado o [**Mapbox**](https://www.mapbox.com/), uma plataforma de mapeamento que permite que seus clientes criem soluções de mapeamento personalizadas.
- Então, se deseja carregar os endereços no mapa, você precisará [**criar uma conta gratuita na plataforma**](https://account.mapbox.com/auth/signup/) e utilizar seu token pessoal de acesso à API.
- Após a criação da sua conta, na página principal do MapBox, clique em “Account”. Em configurações, clique em **“API access tokens”** e depois em “Create a new token”;
- Copie o token gerado, e dentro da pasta **`front-web`**, crie um arquivo com a extensão **`.env`**, onde serão definidas as variáveis de ambiente do projeto.
- Adicione o seguinte conteúdo ao seu arquivo, substituindo **`token`** pelo seu token copiado:

  ```
  REACT_APP_ACCESS_TOKEN_MAP_BOX=token
  ```

- Inicie a aplicação React:
  ```bash
  $ npm start
  ```
- Acesse a aplicação pelo endereço: _**`http://localhost:3000/`**_.

---
