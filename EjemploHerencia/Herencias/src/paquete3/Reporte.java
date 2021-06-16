/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author memaldonado28
 */
public class Reporte {

    protected String codigo;

    public Reporte(String c) {
        setCodigo(c);
    }

    public void setCodigo(String c) {
        codigo = c;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        String cadena = String.format(">>>CODIGO\n", getCodigo());

        return cadena;
    }
}
