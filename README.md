# lab-pw-2017-1

Laboratório da turma de Programação para Web.

## Para rodar o projeto

### Para fazer clone.

`git clone https://github.com/caionaweb/lab-pw-2017-1-imc-mvc`

### Para rodar com o Tomcat na porta 9090.

`mvn org.apache.tomcat.maven:tomcat7-maven-plugin:run -Dmaven.tomcat.port=9090 -Dmaven.tomcat.path=/exercicio`

## Para acessar a aplicação

`http://localhost:9090/exercicio/imc/mvc` em qualquer navegador.

### Para rodar com o Tomcat com uma porta alternativa.

`mvnw org.apache.tomcat.maven:tomcat7-maven-plugin:run -Dmaven.tomcat.port=8181`

No Linux, use `./mvnw` ao invés de apenas `mvnw`, como no Windows. Além disso, pelo menos uma vez, é preciso dar permissão de execução ao arquivo de script **mvnw** com o comando `chmod +x mvnw`.


### Para "empacotar" a aplicação.

`mvnw package`

## Para "preparar" o projeto

### Para "embutir" o Maven no projeto.


`mvn io.takari:maven:0.3.3:wrapper -Dmaven=3.3.9`
