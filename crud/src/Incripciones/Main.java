package Incripciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Datos datos = new Datos();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Actualizar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();
                    System.out.print("Carrera: ");
                    String carrera = sc.nextLine();
                    datos.agregarEstudiante(new Estudiante(nombre, codigo, carrera));
                    break;
                case 2:
                    for (Estudiante e : datos.obtenerTodos()) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.print("Código del estudiante a actualizar: ");
                    String codigoOld = sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Nueva carrera: ");
                    String nuevaCarrera = sc.nextLine();
                    datos.actualizarEstudiante(codigoOld, new Estudiante(nuevoNombre, codigoOld, nuevaCarrera));
                    break;
                case 4:
                    System.out.print("Código del estudiante a eliminar: ");
                    String codigoDel = sc.nextLine();
                    datos.eliminarEstudiante(codigoDel);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }
}

