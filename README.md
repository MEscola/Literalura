# 📚 LiterAlura

O **LiterAlura** é um projeto desenvolvido em Java que permite construir seu próprio **catálogo de livros**, consumindo dados de uma API, armazenando-os em um banco de dados e possibilitando interações via console com diferentes opções de pesquisa e filtragem.

## 🎯 Objetivo
O objetivo deste projeto é criar um catálogo interativo de livros que ofereça, no mínimo, **5 opções de interação** com o usuário.  
Entre as funcionalidades, destacam-se:
- Buscar livros através de uma API específica.
- Manipular e analisar dados no formato **JSON**.
- Inserir e consultar informações no banco de dados.
- Filtrar e exibir livros e autores de interesse.

---

## 🛠 Tecnologias Utilizadas
- **Java** (JDK 17 ou superior recomendado)
- **Spring Boot** (opcional, caso queira facilitar a estrutura do projeto)
- **JPA/Hibernate** para persistência
- **PostgreSQL** (ou outro banco relacional à sua escolha)
- **Jackson** para manipulação de JSON
- **API Externa de Livros** (informações definidas no backlog do projeto)
- **Maven** para gerenciamento de dependências

---

## 📌 Funcionalidades
O sistema interage via console e conta com as seguintes opções mínimas:
1. Buscar livros na API.
2. Listar todos os livros cadastrados.
3. Listar autores cadastrados.
4. Filtrar livros por idioma.
5. Pesquisar livros por título ou autor.

---

## ⚙️ Passos para Desenvolvimento
1. **Configuração do Ambiente Java**  
   - Instalar o Java Development Kit (JDK).  
   - Configurar variáveis de ambiente.  
   - Instalar Maven (caso necessário).

2. **Criação do Projeto**  
   - Criar estrutura Maven ou utilizar Spring Initializr.

3. **Consumo da API**  
   - Realizar requisições HTTP para buscar livros.  
   - Receber e tratar a resposta JSON.

4. **Persistência dos Dados**  
   - Criar entidades JPA para Livros e Autores.  
   - Configurar repositórios para salvar e consultar dados no banco.

5. **Interação com o Usuário**  
   - Criar menu textual com as opções disponíveis.  
   - Implementar filtragem e exibição de resultados.

---

## 🚀 Como Executar
1. **Clone o repositório**
   ```bash
   git clone https://github.com/seu-usuario/literalura.git
