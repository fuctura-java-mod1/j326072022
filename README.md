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



