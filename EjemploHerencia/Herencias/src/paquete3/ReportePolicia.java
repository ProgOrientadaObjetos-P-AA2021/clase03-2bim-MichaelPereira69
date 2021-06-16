/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.*;
import java.util.ArrayList;

/**
 *
 * @author memaldonado28
 */
public class ReportePolicia extends Reporte {

   double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String a, ArrayList<Policia> li) {
        super(a);
        setLista(li);
    }

    public void setPromedioEdades() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + getLista().get(i).getEdad();
        }
        promedioEdades = suma / lista.size();
    }

    public double getPromedioEdades() {
        return promedioEdades;
    }

    public ArrayList<Policia> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Policia> li) {
        lista = li;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s El reporte de policias son:\n",
                super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s %s %s %d\n", cadena,
                    getLista().get(i).getNombre(),
                    getLista().get(i).getApellido(),
                    getLista().get(i).getEdad());
        }
        cadena = String.format("%s El promedio de matrículas son : %.2f",
                cadena,getPromedioEdades());
        return cadena;
    }

}