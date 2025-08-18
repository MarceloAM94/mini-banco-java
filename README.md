# 🏦 Mini Banco en Java

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

### 🔹 Clase `MiniBanco (Main)`
- Contiene el método `main`  
- Muestra un menú en consola:
=== Mini Banco ===

Registrar cliente

Depositar dinero

Retirar dinero

Consultar saldo

Mostrar clientes

Salir

yaml
Copiar
Editar

---
