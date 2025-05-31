package org.example.Oficina;

public class Jefe extends Empleado {

    private String departamento;
    private String nombre;
    private float salario;

    public Jefe(String nombre, float salario, String departamento) {
        super(nombre, salario);
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Departamento: " + departamento + "\n" + nombre + "\t - Salario Anual : " + salario + " €" + "\t - Salario Mensual : " + String.format("%.1f", (salario / 12)) + " €\n";
    }
}
