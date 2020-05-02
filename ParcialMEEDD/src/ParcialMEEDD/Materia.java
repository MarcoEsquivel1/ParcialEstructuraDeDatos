/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcialMEEDD;

/**
 *
 * @author MARCO RENÉ ESQUIVEL JUÁREZ
 */
public class Materia {
    public String nombreMateria;
    public double periodo1;
    public double periodo2;
    public double periodo3;
    public double promedio;
    
    public Materia(String pNom, double per1, double per2, double per3){
        this.nombreMateria = pNom;
        this.periodo1 = per1;
        this.periodo2 = per2;
        this.periodo3 = per3;
        this.promedio = (per1 + per2 +per3)/3;
    }
    
    public void redond(){
        this.periodo1 *= 10;
        this.periodo1 = Math.round(this.periodo1);
        this.periodo1 /= 10;
        
        this.periodo2 *= 10;
        this.periodo2 = Math.round(this.periodo2);
        this.periodo2 /= 10;
        
        this.periodo3 *= 10;
        this.periodo3 = Math.round(this.periodo3);
        this.periodo3 /= 10;
        
        this.promedio *= 10;
        this.promedio = Math.round(this.promedio);
        this.promedio /= 10;
    }
}
