# 💱 Conversor de Monedas en Java

Proyecto de **conversor de monedas** desarrollado en **Java**.  
El programa permite realizar conversiones entre distintas monedas utilizando una **API externa de tasas de cambio en tiempo real**.

---

## 🚀 Funcionalidades

- Conversión de monedas usando una API
- Moneda base: **Dólar estadounidense (USD)**
- Conversiones disponibles:
    - 🇦🇷 Peso Argentino (ARS)
    - 🇧🇷 Real Brasileño (BRL)
    - 🇨🇴 Peso Colombiano (COP)
- Conversión directa e inversa
- Menú por consola
- Código organizado en clases (sin lógica en `main`)

---

## 🛠️ Tecnologías utilizadas

- ☕ **Java**
- 🌐 **HttpClient** (Java 11+)
- 📡 **ExchangeRate API**
- 🧩 Programación orientada a objetos
- 🗂️ Git & GitHub

---

## 📂 Estructura del proyecto

```text
src/
├── Main.java
└── conversor/
    └── herramientas/
        ├── Conversor.java
        ├── RatioExchangeApi.java
        └── ServicioApi.java
```


- `Main.java`  
  Punto de entrada del programa.

- `Conversor`  
  Contiene la lógica principal de conversión de monedas.

- `ServicioApi`  
  Encargado de comunicarse con la API externa y obtener la tasa de cambio.

- `RatioExchangeApi`  
  Record utilizado para mapear la respuesta de la API.

---

## ▶️ Cómo ejecutar el proyecto

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/MarcosMzz/ConversorMoneda-Manejo-de-API-.git
2. Abrir el proyecto en IntelliJ IDEA (u otro IDE compatible)

3. Ejecutar la clase Main

## 📌 Notas

- Las tasas de cambio dependen de la API externa y pueden variar con el tiempo.
- El proyecto está pensado para ejecutarse por consola.
- El foco está puesto en la **organización del código y el uso correcto de APIs**, no en una interfaz gráfica.

---

## 👤 Autor

**Marcos Mazzanti**

GitHub: [MarcosMzz](https://github.com/MarcosMzz)


