package Model;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private Double nota;

    public Alumno() {
        this.nombre="";
        this.nota=0.0;
    }

    public Alumno(String nombre, Double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public String toString() {
        return "\n\tAlumno---->" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}
