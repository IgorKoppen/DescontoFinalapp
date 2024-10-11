# DescontoFinalApp

DescontoFinalApp é um aplicativo Android simples que permite calcular descontos e o preço total após a aplicação do desconto.


<p align="center">
  <img src="https://github.com/IgorKoppen/DescontoFinalapp/blob/main/screenshot/AppScreenShot.png" alt="Captura de Tela do App" width="300"/>
</p>

## Funcionalidades

- Calcula o valor do desconto com base no preço original e na porcentagem de desconto.
- Exibe o preço total após a aplicação do desconto.
- Interface amigável que inclui uma folha de detalhes (Bottom Sheet) mostrando os resultados.
- **Animação de sucesso** após o cálculo usando Lottie Animation.

## Tecnologias Utilizadas

- Kotlin
- Android Jetpack (ViewModel, LiveData)
- Material Design Components
- **Lottie para Android** para animações

## Requisitos

- Android Studio
- SDK Mínimo: API 21 (Lollipop)
- SDK Alvo: API mais recente

## Instalação

1. Clone este repositório para sua máquina local usando:

   ```bash
   git clone https://github.com/igorkoppen/descontofinalapp.git
   ```

2. Abra o projeto no Android Studio.

3. Certifique-se de que você está usando um emulador ou dispositivo real com a versão mínima suportada do Android.

4. Compile e execute o aplicativo.

## Como Usar

1. Insira o preço original no campo de entrada "Preço".
2. Insira a porcentagem de desconto no campo de entrada correspondente.
3. Pressione o botão "Calcular". O valor do desconto e o preço total serão exibidos em uma folha de detalhes, juntamente com uma animação de sucesso.
4. Para limpar os campos e fazer novos cálculos, pressione o botão "Limpar".

## Lottie Animation

DescontoFinalApp utiliza Lottie para exibir animações após o cálculo do desconto. Lottie é uma biblioteca que renderiza animações exportadas do Adobe After Effects (usando bodymovin). É uma maneira eficaz de adicionar animações personalizadas ao aplicativo sem comprometer o desempenho.

Para mais informação sobre como integrar Lottie, consulte a [documentação oficial do Lottie](https://airbnb.io/lottie/#/android).

## Estrutura do Código

- **`DiscountModel`**: Classe responsável por calcular o valor do desconto e o preço total.
  
- **`MainViewModel`**: Gerencia os dados de desconto e preço total usando LiveData para comunicação com a Activity.
  
- **`MainActivity`**: Controla a interface do usuário, gerencia interações de usuário e exibe resultados, incluindo a execução da animação Lottie.

## Contribuição

Contribuições são bem-vindas! Por favor, siga estes passos:

1. Faça um fork do projeto.
2. Crie um ramo (`git checkout -b feature/NovaFeature`).
3. Commit suas mudanças (`git commit -am 'Adiciona nova funcionalidade'`).
4. Faça o push do ramo (`git push origin feature/NovaFeature`).
5. Crie uma solicitação de pull.

## ScreenShot
