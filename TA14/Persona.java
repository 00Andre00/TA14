package TA14;

public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected Integer dni;
    protected String fechaNacimiento;

    public Persona(String nombre, String apellido, Integer dni, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombres() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public abstract Integer calcularEdad();
}