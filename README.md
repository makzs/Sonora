# 🎵 Sonora - Aplicativo de Streaming de Música 🎵

**Sonora** é um aplicativo Android desenvolvido em **Kotlin** e **Android Studio** que permite aos usuários explorar, reproduzir e gerenciar músicas de forma interativa. Ele utiliza o **Google Firebase** para autenticação, gerenciamento de dados e armazenamento de músicas e imagens.

---

## 📋 Funcionalidades

### Autenticação de Usuários:
- Cadastro e login utilizando o **Firebase Authentication**.

### Exploração de Categorias e Seções:
- Visualização de músicas organizadas por categorias e seções dinâmicas.

### Reprodução de Músicas com ExoPlayer:
- Controle completo: play, pause, avanço e ajuste de tempo da música.

### UI Intuitiva:
- Design responsivo e moderno para melhorar a experiência do usuário.

---

## 🛠️ Tecnologias Utilizadas

- **Kotlin** como linguagem principal.
- **Android Studio** para desenvolvimento.
- **Firebase**:
  - **Authentication** (login/cadastro).
  - **Firestore** (armazenamento de dados).
- **ExoPlayer** para reprodução de músicas.
- **Glide** para carregamento e exibição de imagens.

---

## 📱 Estrutura do Aplicativo

### Tela de Cadastro e Login:
- Os usuários podem criar uma conta ou efetuar login para acessar o aplicativo.

### Página Principal:
- Exibe categorias e seções de músicas.
- Mostra as músicas mais tocadas e "tocando agora".

### Tela de Reprodutor de Músicas:
- Permite pausar, avançar e ajustar a reprodução de músicas.

### Exploração de Músicas por Categoria:
- Listagem de músicas em cada categoria com imagens e títulos.

---

## ⚙️ Instalação e Execução

## ⚙️ Instalação e Execução

1. **Clone o Repositório**:  
   Execute o comando a seguir no terminal para clonar o repositório:  
   `git clone https://github.com/seu-usuario/sonora.git`

2. **Abra no Android Studio**:  
   - Certifique-se de que o **Android Studio** esteja instalado em seu computador.  
   - Abra o projeto clonado no **Android Studio**.  

3. **Configure o Firebase**:  
   - Acesse o site do Firebase e crie um novo projeto.  
   - Configure os serviços de **Authentication** e **Firestore**.  
   - Baixe o arquivo `google-services.json` e coloque-o na pasta `app` do projeto.  

4. **Execute no Emulador ou Dispositivo**:  
   - Conecte um dispositivo físico ao computador ou configure um emulador Android no **Android Studio**.  
   - No Android Studio, clique em "Run" para iniciar o aplicativo.  

