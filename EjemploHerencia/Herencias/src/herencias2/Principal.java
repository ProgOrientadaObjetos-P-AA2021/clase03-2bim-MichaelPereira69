/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int op;
        String nombre;
        String apellido;
        int edad;
        // menú
        System.out.println("Opción 1: Ingresa estudiante.\n"
                + "Opción 2: Ingresa docente.\n"
                + "opción 3: Ingresa policia.");
        op = entrada.nextInt();
        entrada.nextLine();
        if ((op >= 1) && (op <= 3)) {
            System.out.println("Ingrese el nombre: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el apellido: ");
            apellido = entrada.nextLine();
            System.out.println("Ingrese la edad: ");
            edad = entrada.nextInt();
            switch (op) {
                case 1:
                    ingresarEstudiante(nombre, apellido, edad);
                    break;
                case 2:
                    ingresarDocente(nombre, apellido, edad);
                    break;
                case 3:
                    ingresarPolicia(nombre, apellido, edad);
                    break;
            }
        } else {
            System.out.println("Opción incorrecta");
        }

    }

    public static void ingresarEstudiante(String a, String b, int c) {
        Scanner entrada = new Scanner(System.in);
        double matricula;
        System.out.println("Ingrese el valor de la matícula");
        matricula = entrada.nextDouble();
        // Un docente hereda de una Persona y adicionalmente tiene 
        // la característia sueldo
        Estudiante e = new Estudiante(a, b, c, matricula);
        System.out.println(e);
    }

    public static void ingresarDocente(String a, String b, int c) {
        Scanner entrada = new Scanner(System.in);
        double sueldo;
        System.out.println("Ingrese el sueldo: ");
        sueldo = entrada.nextDouble();
        Docente d = new Docente(a, b, c, sueldo); // falta implementar
        System.out.println(d);
    }

    public static void ingresarPolicia(String a, String b, int c) {
        Scanner entrada = new Scanner(System.in);
        String rango;
        System.out.println("Ingrese el rango: ");
        rango = entrada.nextLine();
        // Un policia hereda de una Persona y adicionalmente tiene 
        // la característia rango
        Policia p = new Policia(a, b, c, rango); // falta implementar
        System.out.println(p);
    }

}
