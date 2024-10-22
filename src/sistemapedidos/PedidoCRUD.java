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

// Clase PedidoCRUD
class PedidoCRUD {
    private List<Pedido> pedidosList;

    public PedidoCRUD() {
        pedidosList = new ArrayList<>();
    }

    // Crear
    public void agregarPedido(Pedido pedido) {
        pedidosList.add(pedido);
        System.out.println("Pedido agregado: " + pedido);
    }

    // Leer
    public void mostrarPedidos() {
        if (pedidosList.isEmpty()) {
            System.out.println("No hay pedidos registrados.");
        } else {
            for (int i = 0; i < pedidosList.size(); i++) {
                System.out.println(i + ": " + pedidosList.get(i));
            }
        }
    }

    // Actualizar
    public void actualizarPedido(int index, Pedido nuevoPedido) {
        if (index >= 0 && index < pedidosList.size()) {
            pedidosList.set(index, nuevoPedido);
            System.out.println("Pedido actualizado: " + nuevoPedido);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Borrar
    public void eliminarPedido(int index) {
        if (index >= 0 && index < pedidosList.size()) {
            Pedido eliminado = pedidosList.remove(index);
            System.out.println("Pedido eliminado: " + eliminado);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Método para solicitar información del pedido
    public Pedido obtenerDatosPedido() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Medida: ");
        String medida = scanner.nextLine();
        System.out.print("Miconaje: ");
        String miconaje = scanner.nextLine();
        System.out.print("Material: ");
        String material = scanner.nextLine();
        System.out.print("Empresa: ");
        String empresa = scanner.nextLine();
        return new Pedido(medida, miconaje, material, empresa);
    }
}