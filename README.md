# 🏦 Mini Banco en Java
![Java](https://img.shields.io/badge/Java-17-orange)
![Status](https://img.shields.io/badge/Status-In%20Progress-yellow)
![License](https://img.shields.io/badge/License-MIT-blue)

Aplicación de consola desarrollada en **Java** para practicar **Programación Orientada a Objetos (POO)**.  
El sistema permite registrar clientes con sus cuentas, realizar depósitos, retiros, consultar saldos y mostrar la lista de clientes.

---

## 🧩 Modelo de Clases

### 🔹 Clase `Cuenta`
- **Atributos:**
  - `numeroCuenta: int`
  - `saldo: double`
- **Métodos:**
  - `depositar(monto: double)`
  - `retirar(monto: double)`
  - `consultarSaldo(): double`

---

### 🔹 Clase `Cliente`
- **Atributos:**
  - `id: int`
  - `nombre: String`
  - `cuenta: Cuenta`
- **Métodos:**
  - `mostrarInfoCliente()`
  - `getCuenta(): Cuenta`

---

### 🔹 Clase `Banco`
- **Atributos:**
  - `clientes: ArrayList<Cliente>`
- **Métodos:**
  - `registrarCliente(cliente: Cliente)`
  - `buscarCliente(id: int): Cliente`
  - `mostrarClientes()`

---
Copiar
Editar

---
