/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapedidos;

/**
 *
 * @author Leoch
 */
class AlmacenDeposito {
    private String sector;
    private String cliente;
    private int cantidad;

    // Constructor
    public AlmacenDeposito(String sector, String cliente, int cantidad) {
        this.sector = sector;
        this.cliente = cliente;
        this.cantidad = cantidad;
    }

    // Getters
    public String getSector() {
        return sector;
    }

    public String getCliente() {
        return cliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "AlmacenDeposito{" +
                "sector='" + sector + '\'' +
                ", cliente='" + cliente + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
