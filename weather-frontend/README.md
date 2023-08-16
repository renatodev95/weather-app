# WeatherApp - Aplicação Web de Previsão do Tempo

Bem-vindo ao WeatherApp! Este é um projeto de aplicação web desenvolvido utilizando Java no backend e Angular no frontend para fornecer informações precisas sobre a previsão do tempo em diferentes cidades do mundo. Através da integração com a API da OpenWeatherAPI e o uso do Spring Boot, esta aplicação permite aos usuários obterem informações sobre a temperatura, umidade, temperaturas mínima e máxima, além de visualizarem a imagem correspondente à descrição do clima corrente na cidade escolhida.

## Funcionalidades Principais

- Acesse o site e insira o nome de uma cidade para obter informações detalhadas sobre a previsão do tempo.
- Receba dados precisos de temperatura, umidade, temperaturas mínima e máxima para a cidade selecionada.
- Visualize uma imagem que representa a descrição do clima atual na localidade.

## Tecnologias Utilizadas

- **Backend**: Java com Spring Boot
  - Utilização do Spring Boot para criação de uma API RESTful.
  - Integração com a OpenWeatherAPI para obtenção dos dados de previsão do tempo.
  - Endpoint `/api/weather/{city}` para receber o nome da cidade como parâmetro na requisição.

- **Frontend**: Angular
  - Desenvolvimento de uma interface de usuário moderna e interativa.
  - Interação com o backend através do endpoint de API.
  - Apresentação dos dados da previsão do tempo de forma amigável.

## Instruções de Uso

1. Certifique-se de ter o Java e o Node.js instalados em seu sistema.
2. Clone este repositório para a sua máquina local.
3. Navegue até a pasta `weather-frontend` e execute `npm install` para instalar as dependências do frontend.
4. Inicie o frontend com o comando `ng serve`.
5. Navegue até a pasta `WeatherApp` e execute o aplicativo Spring Boot. (Lembre-se de informar a chave da sua API da Open Weather API na classe controller)
6. Acesse o site através do navegador e insira o nome de uma cidade para obter a previsão do tempo.

## Contribuição

Contribuições são bem-vindas! Se você deseja melhorar este projeto, fique à vontade para criar um fork do repositório e submeter um pull request com as suas modificações.

## Contato

Se você tiver alguma dúvida ou sugestão relacionada a este projeto, sinta-se à vontade para entrar em contato através das issues do repositório.
