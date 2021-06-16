/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Docente;
import java.util.ArrayList;
/**
 *
 * @author memaldonado28
 */


public class ReporteDocente extends Reporte {

   double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String a, ArrayList<Docente> li) {
        super(a);
        setLista(li);
    }

    public void setPromedioSueldos() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + getLista().get(i).getSueldo();
        }
        promedioSueldos = suma / lista.size();
    }

    public double getPromedioSueldos() {
        return promedioSueldos;
    }

    public ArrayList<Docente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Docente> li) {
        lista = li;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s El Reporte de Estudiantes es:\n",
                super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s %s %s %.2f\n", cadena,
                    getLista().get(i).getNombre(),
                    getLista().get(i).getApellido(),
                    getLista().get(i).getSueldo());
        }
        cadena = String.format("%s El promedio de Sueldos es: %.2f", cadena,
                getPromedioSueldos());
        return cadena;
    }

}