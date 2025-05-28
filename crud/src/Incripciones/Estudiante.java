package Incripciones;
// se realizo el trabajo con ayuda externa y por medio de una herramineta sugerida por el docente para la compresion y realizacion sobre una base de datos 
//persistentes de manera basica.
import java.io.Serializable;

public class Estudiante implements Serializable {
    private String nombre;
    private String codigo;
    private String carrera;

    public Estudiante(String nombre, String codigo, String carrera) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = carrera;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
