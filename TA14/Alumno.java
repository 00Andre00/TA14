package TA14;

public class Alumno extends Persona{

    protected int año;
    protected int mes;
    protected int dia;

    public Alumno(String nombre, String apellido, Integer dni, String fechaNacimiento) {
        super(nombre, apellido, dni, fechaNacimiento);
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public Integer calcularEdad() {

        int edad;
        edad = 2022 - año;
        if( mes > 6 ||( mes == 6 && dia > 30))
            edad = edad - 1;
        System.out.println("Edad del alumno: " + edad);
        return edad;
    }
}