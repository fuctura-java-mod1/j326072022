# Configurar Swaggger

```java
package br.com.fuctura.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	
	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.fuctura"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Java 3",
                "API REST de Gerenciamento de Times de Futebol.",
                "1.0",
                "Terms of Service",
                null,
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<>()
        );

        return apiInfo;
    }
	
}
```

# Configurar o MapStruts

## Adicionar as versões da dependência

```xml

<properties>
		<java.version>11</java.version>
		<org.mapstruct.version>1.4.2.Final</org.mapstruct.version>
		<version.mapstruct-lombok>0.2.0</version.mapstruct-lombok>
</properties>

```

## Adicionar as dependências

```xml

<dependency>
  <groupId>org.mapstruct</groupId>
  <artifactId>mapstruct</artifactId>
  <version>1.4.2.Final</version>
</dependency>
<dependency>
  <groupId>org.projectlombok</groupId>
  <artifactId>lombok-mapstruct-binding</artifactId>
  <version>0.2.0</version>
</dependency>
```

## Configurar os Plugins

```xml
<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.0</version>
				<configuration>
					<annotationProcessorPaths>
						<path>
							<groupId>org.mapstruct</groupId>
							<artifactId>mapstruct-processor</artifactId>
							<version>${org.mapstruct.version}</version>
						</path>
						<path>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
							<version>${lombok.version}</version>
						</path>
						<dependency>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok-mapstruct-binding</artifactId>
							<version>${version.mapstruct-lombok}</version>
						</dependency>
					</annotationProcessorPaths>
					<compilerArgs>
						<compilerArg>
							-Amapstruct.defaultComponentModel=spring
						</compilerArg>
					</compilerArgs>
				</configuration>
			</plugin>
```



