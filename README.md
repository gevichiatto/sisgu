# SisGU #
## Sistema de Gerenciamento de Usuarios ##

## Atenção! O código presente na branch "develop" não compila por falta de implementações. ##
Porém, de toda maneira, contém comentários sobre implementações ausentes e o que eu, o autor, pensei
sobre as implementações que faltam.

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

