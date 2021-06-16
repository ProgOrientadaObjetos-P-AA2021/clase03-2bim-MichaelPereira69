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
class Policia extends Persona {
      private double rango;
    
    public Policia(String n, String a, int e, double Rang){
        super(n, a, e);
        setRango(Rang);
    }
    
    public void setRango(double ed){
        rango = ed;
    }
    
    
    public double getRango(){
        return rango;
    }
    
      @Override
    public String toString(){
        
        return String.format("%s - %s", super.toString(),
                getRango());
    }
}
