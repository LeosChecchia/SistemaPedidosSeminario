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

// Clase AlmacenDepositoCRUD
class AlmacenDepositoCRUD {
    private List<AlmacenDeposito> almacenList;

    public AlmacenDepositoCRUD() {
        almacenList = new ArrayList<>();
    }

    // Crear
    public void agregarAlmacen(AlmacenDeposito almacen) {
        almacenList.add(almacen);
        System.out.println("Almacen agregado: " + almacen);
    }

    // Leer
    public void mostrarAlmacenes() {
        if (almacenList.isEmpty()) {
            System.out.println("No hay almacenes registrados.");
        } else {
            for (int i = 0; i < almacenList.size(); i++) {
                System.out.println(i + ": " + almacenList.get(i));
            }
        }
    }

    // Actualizar
    public void actualizarAlmacen(int index, AlmacenDeposito nuevoAlmacen) {
        if (index >= 0 && index < almacenList.size()) {
            almacenList.set(index, nuevoAlmacen);
            System.out.println("Almacen actualizado: " + nuevoAlmacen);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Borrar
    public void eliminarAlmacen(int index) {
        if (index >= 0 && index < almacenList.size()) {
            AlmacenDeposito eliminado = almacenList.remove(index);
            System.out.println("Almacen eliminado: " + eliminado);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Método para solicitar información del almacen
    public AlmacenDeposito obtenerDatosAlmacen() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sector: ");
        String sector = scanner.nextLine();
        System.out.print("Cliente: ");
        String cliente = scanner.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();
        return new AlmacenDeposito(sector, cliente, cantidad);
    }
}