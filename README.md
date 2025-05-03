# 📦 Consulta CEP API

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.5-brightgreen.svg)
![License](https://img.shields.io/badge/license-MIT-blue.svg)

API REST desenvolvida com **Spring Boot** para realizar consultas de endereço a partir de um **CEP**, utilizando o serviço gratuito [ViaCEP](https://viacep.com.br/).

---

## ✨ Funcionalidades

- 🔍 Consulta de endereço via CEP (Integração com ViaCEP)
- ⚡ API REST rápida e simples
- 🛠️ Exemplo de consumo de API externa com **RestTemplate**

---

## 🚀 Tecnologias

- Java 17
- Spring Boot 3.4.5
- Maven
- ViaCEP API

---

## 📂 Estrutura de Pastas

```bash
consulta-cep/
├── src/
│   ├── main/
│   │   ├── java/com/reginalddev/consultacep/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   └── service/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

---

## ⚙️ Como rodar o projeto

### 1️⃣ Clone o repositório

```bash
git clone https://github.com/ReginaldDev/consulta-cep.git
cd consulta-cep
```

### 2️⃣ Compile o projeto

```bash
./mvnw clean install
```

### 3️⃣ Execute a aplicação

```bash
./mvnw spring-boot:run
```

A API estará disponível em:  
`http://localhost:8080`

---

## 🛠️ Exemplo de uso

### Endpoint

```
GET /api/cep/{cep}
```

### Exemplo

```bash
GET http://localhost:8080/api/cep/01001000
```

### Retorno (JSON)

```json
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "lado ímpar",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP",
  "ibge": "3550308",
  "gia": "1004",
  "ddd": "11",
  "siafi": "7107"
}
```

---

## ✍️ Autor

**Reginaldo Junior**  
[![GitHub](https://img.shields.io/badge/GitHub-ReginaldDev-181717?logo=github)](https://github.com/ReginaldDev)

---

## ⚖️ Licença

Este projeto está licenciado sob a licença **MIT**.  
Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
