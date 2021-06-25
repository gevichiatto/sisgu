# SisGU #
## Sistema de Gerenciamento de Usuarios ##

### Início ###
Esse é um sistema básico de gerenciamento de usuários

### Pré requisitos ###
- NodeJs
- Java

### Passo a passo para execução do sistema ###
1. Clone o projeto deste repositório :)

2. No diretório do repositório clonado, execute o seguinte comando para instalar as dependências do backend:
```
mvn clean install
```

3. Navegue até o diretório src/main/ui e execute o seguinte comando para instalar as dependências do frontend:
```
npm install
```

4. Para iniciar o sistema é necessário executar comandos para o backend e para o frontend. Dessa forma, execute:
```
java -jar target/sisgu-0.0.1-SNAPSHOT.jar
````
no diretório raiz do sistema, para iniciar a execução do backend e execute:
```
npm run serve
```
no diretório src/main/ui, para iniciar a execução do backend.

5. Acesse o sistema por meio do link http://localhost:4000


### Avisos ###
1. Note que o código estável desse sistema está na branch "main". O código na branch "develop" tem status de desenvolvimento não finalizado.

2. Algumas funcionalidades do sistema não estão presentes na branch "main". O pseudo-código dessas funcionalidades está descrito na branch "develop", com o intuito de demonstrar a lógica para a implementação.

3. O penúltimo commit na branch "develop" (https://github.com/gevichiatto/sisgu/commit/77d5c28ccd85f7fd690c13325b143c97667d7a3e) contém os comentários sobre as implementações faltantes no código. Procurei demonstrar minhas intenções sobre a implementação dos códigos.
