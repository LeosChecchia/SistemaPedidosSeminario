/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapedidos;

/**
 *
 * @author Leoch
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase ClientesCRUD
class ClientesCRUD {
    private List<Clientes> clientesList;

    public ClientesCRUD() {
        clientesList = new ArrayList<>();
    }

    // Crear
    public void agregarCliente(Clientes cliente) {
        clientesList.add(cliente);
        System.out.println("Cliente agregado: " + cliente);
    }

    // Leer
    public void mostrarClientes() {
        if (clientesList.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (int i = 0; i < clientesList.size(); i++) {
                System.out.println(i + ": " + clientesList.get(i));
            }
        }
    }

    // Actualizar
    public void actualizarCliente(int index, Clientes nuevoCliente) {
        if (index >= 0 && index < clientesList.size()) {
            clientesList.set(index, nuevoCliente);
            System.out.println("Cliente actualizado: " + nuevoCliente);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Borrar
    public void eliminarCliente(int index) {
        if (index >= 0 && index < clientesList.size()) {
            Clientes eliminado = clientesList.remove(index);
            System.out.println("Cliente eliminado: " + eliminado);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Método para solicitar información del cliente
    public Clientes obtenerDatosCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Empresa: ");
        String empresa = scanner.nextLine();
        return new Clientes(nombre, apellido, direccion, telefono, empresa);
    }
}


