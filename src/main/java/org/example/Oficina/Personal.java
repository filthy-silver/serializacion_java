package org.example.Oficina;

import org.example.Ejercicios.SerializarTHPSG;

import java.io.*;
import java.util.ArrayList;

public class Personal {

    public static void main(String[] args) {
        serializar();
        deserializar();
    }

    public static void serializar(){
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan", 30000));
        empleados.add(new Empleado("Ana", 35000));
        empleados.add(new Jefe("Carlos", 32000, "Recursos Humanos"));
        empleados.add(new Jefe("Laura", 60000, "Finanzas"));
        empleados.add(new Empleado("Pedro", 2800));
        empleados.add(new Empleado("Lucía", 3200));
        empleados.add(new Jefe("María", 70000, "Marketing"));
        empleados.add(new Jefe("Luis", 80000, "IT"));
        empleados.add(new Empleado("Sofía", 29000));
        empleados.add(new Empleado("David", 31000));
        empleados.add(new Jefe("Elena", 75000, "Ventas"));

        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/resources/personal.ser"));
            out.writeObject(empleados);
            out.close();
            System.out.println("Objeto serializado en personal.ser");
        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }
    }

    public static void deserializar() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/resources/personal.ser"));
            ArrayList<Empleado> empleados = (ArrayList<Empleado>) in.readObject();
            in.close();
            System.out.println("\nJefes:");
            for (Empleado empleado : empleados) {
                if (empleado instanceof Jefe) {
                    System.out.println(empleado);
                }
            }
            System.out.println("\nEmpleados:");
            for (Empleado empleado : empleados) {
                if (!(empleado instanceof Jefe)) {
                    System.out.println(empleado);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo. Creando archivo con datos por defecto...");
            serializar();
            deserializar();
        } catch (IOException e) {
            System.out.println("Archivo vacío o dañado. Creando archivo con datos por defecto...");
            serializar();
            deserializar();
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error inesperado.");
            e.printStackTrace();
        }
    }
}
