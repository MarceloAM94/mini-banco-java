# 🏦 Mini Banco Java

![Java](https://img.shields.io/badge/Language-Java-orange)
![License](https://img.shields.io/badge/License-MIT-green)
![Platform](https://img.shields.io/badge/Platform-Consola-blue)
![Status](https://img.shields.io/badge/Status-Completo-success)
![POO](https://img.shields.io/badge/Concept-POO-lightgrey)

---

## 📖 Descripción
Mini Banco Java es una **aplicación de consola** que simula un sistema bancario básico.  

Permite:  

💰 Registrar clientes y asignarles cuentas (Cuenta de Ahorro o Cuenta Corriente).  
🏦 Realizar operaciones como depósitos, retiros y consulta de saldo.  
📋 Listar clientes y seleccionar uno para gestionar su cuenta.  

El proyecto está desarrollado usando **Programación Orientada a Objetos (POO)** en Java, aplicando herencia, polimorfismo, encapsulamiento y abstracción.

---

## 🛠️ Estructura del proyecto

### Clases principales

- **Cuenta (abstracta)**  
  Representa una cuenta bancaria genérica.  
  - Atributos: `nroAccount`, `balance`.  
  - Métodos: `deposit()`, `withdraw()` (abstracto), `getBalance()`.  

- **CuentaAhorro**  
  Subclase de `Cuenta`.  
  - Requiere un saldo mínimo de 50 al retirar.  
  - Implementa `withdraw()` y `toString()` personalizado.  

- **CuentaCorriente**  
  Subclase de `Cuenta`.  
  - Permite sobregiro hasta -500.  
  - Implementa `withdraw()` y `toString()` personalizado.  

- **Cliente**  
  Representa un cliente del banco.  
  - Atributos: `codClient`, `name`, `account`.  
  - Métodos: `depositar()`, `retirar()`, `mostrarEstadoCuenta()`.  

- **Banco**  
  Maneja la lista de clientes.  
  - Métodos: `addClient()`, `listClients()`, `searchClient()`.  

- **MainBanco**  
  Clase principal con menú interactivo para la consola.  
  - Permite registrar clientes, listar clientes y operar sobre las cuentas seleccionadas.

---

## 🚀 Uso

1. Clonar el repositorio:
```
git clone git@github.com:MarceloAM94/mini-banco-java.git
```
2. Compilar el proyecto:
```
javac src/*.java
```
3. Ejecutar la aplicación:
```
java src.MainBanco
```

4. Interactuar con el menú de consola para registrar clientes, listar y seleccionar cuentas para operaciones.

## 💡 Conceptos de POO aplicados
### Encapsulamiento: atributos privados con getters y setters.

### Abstracción: Cuenta es una clase abstracta.

### Herencia: CuentaAhorro y CuentaCorriente extienden Cuenta.

### Polimorfismo: las operaciones withdraw() y deposit() se comportan según el tipo de cuenta.

## 📝 Licencia
Este proyecto está bajo la licencia MIT.
