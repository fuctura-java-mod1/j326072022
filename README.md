# Aula 4/5


### Modelo

![ Spring Suite Tools](https://i.ibb.co/hXHtQ6z/image.png "Spring Suite Tools")


### Nesta aula nós iremos utilizar o Spring Data JPA junto com o banco de dados H2. 

- Adicione as seguinte dependências ao seu projeto:

```xml
 <dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-data-jpa</artifactId>
 </dependency>
<dependency>
   <groupId>com.h2database</groupId>
   <artifactId>h2</artifactId>
   <scope>runtime</scope>
</dependency>
```

- Crie uma interface chamada **JogadorRepository** no pacote **br.com.fuctura.repository**
- Configure a entidade **Jogador**

## Repositórios Spring
- Query Methods
- Externalizar Consultas
- JPQL com @Query
- CommandLineRunner

### Query Methods
https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods

### Externalizar Consulta
```xml
<?xml version="1.0" encoding="UTF-8"?>
<entity-mappings
        xmlns="http://xmlns.jcp.org/xml/ns/persistence/orm"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/orm_2_2.xsd"
        version="2.2">
        <named-query name="JogadorEntity.consultarPorAltura">
            <query>
                SELECT J FROM JogadorEntity J WHERE altura BETWEEN :min AND :max
            </query>
        </named-query>
</entity-mappings>
```
