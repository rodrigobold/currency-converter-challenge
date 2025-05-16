# 💱 Currency Converter Challenge

## 📝 Visão Geral
Este projeto é um desafio do curso da **Alura**, implementando um conversor de moedas virtual que permite ao usuário converter entre diferentes moedas latino-americanas e o dólar americano. Ele possui uma interface baseada em console com taxas de câmbio em tempo real obtidas de uma API externa.

---

## ✨ Funcionalidades
✅ **Converter entre múltiplos pares de moedas**:
- USD 🇺🇸 ⟷ Peso Argentino 🇦🇷
- USD 🇺🇸 ⟷ Real Brasileiro 🇧🇷
- USD 🇺🇸 ⟷ Peso Colombiano 🇨🇴

✅ **Taxas de câmbio em tempo real utilizando a ExchangeRate API**  
✅ **Interface de console amigável com elementos visuais**  
✅ **Configuração da API através de arquivo `.properties`**


---

## ✅ Pré-requisitos
- ☕ Java 17 ou superior (necessário para utilizar `switch expressions`)
- 🌐 Conexão com a internet (para buscar as taxas de câmbio)
- 🔑 Chave de API válida para a **ExchangeRate API**

---

## ⚙️ Configuração
1. Clone este repositório
2. Crie um arquivo `config.properties`  com a sua chave da API:
   api.key=YOUR_API_KEY_HERE
3. Compile o projeto utilizando sua ferramenta Java de preferência

---

## ▶️ Como Executar
Execute a classe `Main` para iniciar o conversor de moedas.  
Siga as instruções na tela para:  
1️⃣ Selecionar a opção de conversão (1 a 6)  
2️⃣ Inserir o valor a ser convertido  
3️⃣ Visualizar o resultado da conversão

---

## 🌐 Integração com a API
Este projeto utiliza a **ExchangeRate API v6** para obter taxas de câmbio em tempo real.  
A comunicação com a API é gerenciada pela classe `ExchangeRateService`, que envia requisições HTTP e interpreta as respostas.

---

## 🧩 Dependências
- 📦 **Google Gson**: Para análise de JSON
- 🌐 **Java HTTP Client**: Para comunicação com a API

---


## 🙌 Agradecimentos
- 👨‍🏫 **Alura**, por fornecer o desafio e os materiais de aprendizado
- 💹 **ExchangeRate API**, por fornecer os dados de câmbio
