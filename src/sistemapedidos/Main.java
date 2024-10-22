/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemapedidos;

/**
 *
 * @author Leoch
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase Principal
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClientesCRUD clientesCRUD = new ClientesCRUD();
        PedidoCRUD pedidoCRUD = new PedidoCRUD();
        AlmacenDepositoCRUD almacenDepositoCRUD = new AlmacenDepositoCRUD();
        int opcion;

        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Gestionar Clientes");
            System.out.println("2. Gestionar Pedidos");
            System.out.println("3. Gestionar Almacenes");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    int opcionCliente;
                    do {
                        System.out.println("\nSeleccione una opción para Clientes:");
                        System.out.println("1. Agregar Cliente");
                        System.out.println("2. Mostrar Clientes");
                        System.out.println("3. Actualizar Cliente");
                        System.out.println("4. Eliminar Cliente");
                        System.out.println("5. Salir");
                        opcionCliente = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer

                        switch (opcionCliente) {
                            case 1:
                                clientesCRUD.agregarCliente(clientesCRUD.obtenerDatosCliente());
                                break;
                            case 2:
                                clientesCRUD.mostrarClientes();
                                break;
                            case 3:
                                System.out.print("Ingrese el índice del cliente a actualizar: ");
                                int indexCliente = scanner.nextInt();
                                scanner.nextLine(); // Limpiar el buffer
                                clientesCRUD.actualizarCliente(indexCliente, clientesCRUD.obtenerDatosCliente());
                                break;
                            case 4:
                                System.out.print("Ingrese el índice del cliente a eliminar: ");
                                int eliminarCliente = scanner.nextInt();
                                clientesCRUD.eliminarCliente(eliminarCliente);
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opción inválida.");
                        }
                    } while (opcionCliente != 5);
                    break;

                case 2:
                    int opcionPedido;
                    do {
                        System.out.println("\nSeleccione una opción para Pedidos:");
                        System.out.println("1. Agregar Pedido");
                        System.out.println("2. Mostrar Pedidos");
                        System.out.println("3. Actualizar Pedido");
                        System.out.println("4. Eliminar Pedido");
                        System.out.println("5. Salir");
                        opcionPedido = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer

                        switch (opcionPedido) {
                            case 1:
                                pedidoCRUD.agregarPedido(pedidoCRUD.obtenerDatosPedido());
                                break;
                            case 2:
                                pedidoCRUD.mostrarPedidos();
                                break;
                            case 3:
                                System.out.print("Ingrese el índice del pedido a actualizar: ");
                                int indexPedido = scanner.nextInt();
                                scanner.nextLine(); // Limpiar el buffer
                                pedidoCRUD.actualizarPedido(indexPedido, pedidoCRUD.obtenerDatosPedido());
                                break;
                            case 4:
                                System.out.print("Ingrese el índice del pedido a eliminar: ");
                                int eliminarPedido = scanner.nextInt();
                                pedidoCRUD.eliminarPedido(eliminarPedido);
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opción inválida.");
                        }
                    } while (opcionPedido != 5);
                    break;

                case 3:
                    int opcionAlmacen;
                    do {
                        System.out.println("\nSeleccione una opción para Almacenes:");
                        System.out.println("1. Agregar Almacen");
                        System.out.println("2. Mostrar Almacenes");
                        System.out.println("3. Actualizar Almacen");
                        System.out.println("4. Eliminar Almacen");
                        System.out.println("5. Salir");
                        opcionAlmacen = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer

                        switch (opcionAlmacen) {
                            case 1:
                                almacenDepositoCRUD.agregarAlmacen(almacenDepositoCRUD.obtenerDatosAlmacen());
                                break;
                            case 2:
                                almacenDepositoCRUD.mostrarAlmacenes();
                                break;
                            case 3:
                                System.out.print("Ingrese el índice del almacen a actualizar: ");
                                int indexAlmacen = scanner.nextInt();
                                scanner.nextLine(); // Limpiar el buffer
                                almacenDepositoCRUD.actualizarAlmacen(indexAlmacen, almacenDepositoCRUD.obtenerDatosAlmacen());
                                break;
                            case 4:
                                System.out.print("Ingrese el índice del almacen a eliminar: ");
                                int eliminarAlmacen = scanner.nextInt();
                                almacenDepositoCRUD.eliminarAlmacen(eliminarAlmacen);
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opción inválida.");
                        }
                    } while (opcionAlmacen != 5);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
