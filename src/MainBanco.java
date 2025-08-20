import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        int opcion;
        do {
            System.out.println("\n===================================");
            System.out.println("       🏦 MINI BANCO JAVA 🏦       ");
            System.out.println("===================================");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Seleccionar cliente");
            System.out.println("4. Salir");
            System.out.println("===================================");
            System.out.print("👉 Elige una opción: ");

            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    // Lógica para registrar cliete
                    System.out.println("Ingrese un codigo de cliente (4 digitos):");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el nombre del cliente:");
                    String name = sc.nextLine();

                    //Elegir tipo de cuenta
                    boolean validOption = false;
                    Cuenta cuenta = null;

                    while (!validOption) {
                        System.out.print("Tipo de cuenta (1: Ahorro, 2: Corriente): ");
                        int tipoCuenta = sc.nextInt();

                        if(tipoCuenta == 1 || tipoCuenta == 2) {
                            System.out.print("Saldo inicial: ");
                            double saldo = sc.nextDouble();

                            if(tipoCuenta == 1) {
                                cuenta = new CuentaAhorro(codigo, saldo);
                            } else {
                                cuenta = new CuentaCorriente(codigo, saldo);
                            }
                            validOption = true; // opción válida, salimos del bucle
                        } else {
                            System.out.println("Ingrese una opción válida");
                        }
                    }
                    Cliente cliente = new Cliente(codigo, name, cuenta);
                    banco.addClient(cliente);
                    System.out.println("Cliente registrado con exito");
                    break;
                case 2:
                    banco.listClients(); // Muestra todos los clientes
                    break;
                case 3:
                    banco.listClients(); // Mostrar todos los clientes

                    System.out.print("Ingrese el código del cliente a seleccionar: ");
                    int codigoSeleccion = sc.nextInt();
                    Cliente clienteSeleccionado = banco.searchClient(codigoSeleccion);

                    if(clienteSeleccionado == null) {
                        System.out.println("Cliente no encontrado");
                        break; // volvemos al menú principal
                    }
                    System.out.println("Cliente seleccionado: " + clienteSeleccionado.getName());

                    int opcionCuenta;
                    do {
                        System.out.println("\n--- Operaciones de " + clienteSeleccionado.getName() + " ---");
                        System.out.println("1. Consultar saldo");
                        System.out.println("2. Depositar");
                        System.out.println("3. Retirar");
                        System.out.println("4. Volver al menú principal");
                        System.out.print("Elija una opción: ");
                        opcionCuenta = sc.nextInt();

                        switch(opcionCuenta) {
                            case 1:
                                clienteSeleccionado.mostrarEstadoCuenta();
                                break;
                            case 2:
                                System.out.print("Monto a depositar: ");
                                double deposit = sc.nextDouble();
                                clienteSeleccionado.depositar(deposit);
                                System.out.println("Depósito realizado exitosamente.");
                                break;
                            case 3:
                                System.out.print("Monto a retirar: ");
                                double retiro = sc.nextDouble();
                                clienteSeleccionado.retirar(retiro);
                                break;
                            case 4:
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Opción inválida");
                        }
                    } while(opcionCuenta != 4);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo");
            }

        } while(opcion != 4);
        sc.close();
    }
}