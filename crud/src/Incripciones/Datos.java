package Incripciones;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Datos {
    private static final String FILE_NAME = "estudiantes.dat";
    private List<Estudiante> estudiantes;

    public Datos() {
        estudiantes = cargarDatos();
    }

    // Crear
    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
        guardarDatos();
    }

    // Leer
    public List<Estudiante> obtenerTodos() {
        return estudiantes;
    }

    // Actualizar
    public void actualizarEstudiante(String codigo, Estudiante nuevo) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getCodigo().equals(codigo)) {
                estudiantes.set(i, nuevo);
                break;
            }
        }
        guardarDatos();
    }

    // Eliminar
    public void eliminarEstudiante(String codigo) {
        estudiantes.removeIf(e -> e.getCodigo().equals(codigo));
        guardarDatos();
    }

    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(estudiantes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Estudiante> cargarDatos() {
        File archivo = new File(FILE_NAME);
        if (!archivo.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Estudiante>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
