/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;
/**
 *
 * @author memaldonado28
 */
public class Docente extends Persona {

    private double sueldo;

    public Docente(String n, String a, int e, double sueld) {
        super(n, a, e);
        setSueldo(sueld);
    }

//    @Override
//    public void setNombre(String n) {
//        nombre = n.toUpperCase();
//    }

    public void setSueldo(double sueld) {
        if (sueld < 1000) {
            sueldo = 1000;
        } else {
            sueldo = sueld;
        }
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {

        return String.format("%s - %.2f", super.toString(), getSueldo());
    }

}
