package org.example.Oficina;

public class Empleado implements java.io.Serializable {
    private String nombre;
    private float salario;

    public Empleado(String nombre, float salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return nombre + "\t - Salario Anual : " + salario + " €" + "\t - Salario Mensual : " + String.format("%.1f", (salario / 12)) + " €";
    }
}
