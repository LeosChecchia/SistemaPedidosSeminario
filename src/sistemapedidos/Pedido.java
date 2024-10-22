/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapedidos;

/**
 *
 * @author Leoch
 */
// Clase Pedido
class Pedido {
    private String medida;
    private String miconaje;
    private String material;
    private String empresa;

    // Constructor
    public Pedido(String medida, String miconaje, String material, String empresa) {
        this.medida = medida;
        this.miconaje = miconaje;
        this.material = material;
        this.empresa = empresa;
    }

    // Getters
    public String getMedida() {
        return medida;
    }

    public String getMiconaje() {
        return miconaje;
    }

    public String getMaterial() {
        return material;
    }

    public String getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "medida='" + medida + '\'' +
                ", miconaje='" + miconaje + '\'' +
                ", material='" + material + '\'' +
                ", empresa='" + empresa + '\'' +
                '}';
    }
}