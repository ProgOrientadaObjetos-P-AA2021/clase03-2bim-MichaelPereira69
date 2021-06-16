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
class Docente extends Persona {

    private double sueldo;

    public Docente(String n, String a, int e, double mat) {
        super(n, a, e);
        setSueldo(mat);
    }

  public void setSueldo(double s){
        if(s < 1000){
            sueldo = 1000;
        }else{
            sueldo = s;
        }
        
    }
    
    public double  setSueldo(){
        
        return sueldo;
    }
    
    @Override
    public String toString(){
        
        return String.format("%s - %.2f", super.toString(),
                setSueldo());
    }
}