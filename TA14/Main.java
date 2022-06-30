package TA14;

public class Main {

    public static void main(String[] args){

        Alumno alumno = new Alumno("Carlos","Martel",33333333,"23/02/2010");
        Docente docente = new Docente("Leonardo","Matos",777777, "10/01/1970");
        Matricula matricula = new Matricula(12345);
        Curso mate = new Curso("Calculo");
        Curso lengua = new Curso("Lenguaje literal");

        System.out.println ("\n");
        System.out.println("Matricula:");
        System.out.println("Codigo de matricula: "+matricula.getCodigo());
        System.out.println ("\n");

        System.out.println("Alumno:");
        System.out.println("Nombre: "+alumno.getNombres());
        System.out.println("Apellido: "+alumno.getApellido());
        System.out.println("Dni: "+alumno.getDni());
        System.out.println("Fecha de Nacimiento: "+alumno.getFechaNacimiento());
        alumno.setDia(23);
        alumno.setMes(02);
        alumno.setAño(2010);
        alumno.calcularEdad();
        System.out.println ("\n");

        System.out.println("Cursos:");
        System.out.println("Curso 1: "+mate.getAsignatura());
        System.out.println("Curso 2: "+lengua.getAsignatura());
        System.out.println ("\n");

        System.out.println("Docente:");
        System.out.println("Nombre: "+docente.getNombres());
        System.out.println("Apellido: "+docente.getApellido());
        System.out.println("Dni: "+docente.getDni());
        System.out.println("Fecha de Nacimiento: "+docente.getFechaNacimiento());
        docente.setDia(10);
        docente.setMes(01);
        docente.setAño(1970);
        docente.calcularEdad();
        System.out.println ("\n");
    }

}