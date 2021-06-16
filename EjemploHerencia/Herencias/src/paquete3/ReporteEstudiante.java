/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author memaldonado28
 */
public class ReporteEstudiante extends Reporte {

    double promedioMartriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String a, ArrayList<Estudiante> li) {
        super(a);
        setLista(li);
    }

    public void setPromedioMartriculas() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + getLista().get(i).getMatricula();
        }
        promedioMartriculas = suma / lista.size();
    }

    public double getPromedioMartriculas() {
        return promedioMartriculas;
    }

    public ArrayList<Estudiante> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Estudiante> li) {
        lista = li;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s El reporte de Estudiantes es:\n",
                super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s %s %s  %.2f\n", cadena,
                    getLista().get(i).getNombre(),
                    getLista().get(i).getApellido(),
                    getLista().get(i).getMatricula());
        }
        cadena = String.format("%s El Promedio de las matrículas son: %.2f"
                , cadena,getPromedioMartriculas());
        return cadena;
    }

}