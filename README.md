# Exercício 2 - Sistema Gerenciador de Times (Entrega 1)

Para este exercício utilizaremos a modelagem a seguir:

![ Spring Suite Tools](https://i.ibb.co/hXHtQ6z/image.png "Spring Suite Tools")

# Requisitos:
- Este projeto precisa ser feito por 2 ou mais pessoas
- Este projeto deve ser versionado e compartilhado utilizando o Github
- Cada integrante deve ficar responsável por criar algum controlador

# Objetivos:

- Crie um projeto Spring chamado: SistemaGerenciadorDeTimes
- Para cada entidade (Jogador, Contrato, Clube, etc...) da imagem acima crie um Controlador.
- Cada controlador deve fornecer enpoints para gerenciar cada entidade. Utilize a imagem abaixo como referência

![ Spring Suite Tools](https://i.ibb.co/wJ3XM5J/image.png "Spring Suite Tools")

Ou seja, para o controlador Clube, por exemplo, você deve criar os endpoints:


| Endpoint        | Método           
| ------------- |:-------------:| 
| /clube/       | GET           | 
| /clube/       | POST          |
| /clube/{id}   | GET           |
| /clube/{id}   | PUT           |
| /clube/{id}   | PATCH         |
| /clube/{id}   | DELETE        |
