/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcialMEEDD;

import java.util.ArrayList;

/**
 *
 * @author MARCO RENÉ ESQUIVEL JUÁREZ
 */
public class Alumno {
    public String nombre;
    public String carnet;
    public String carrera;
    public int materiasCursadas;
    public double CUM;
    ArrayList<Materia> lMat;
    
    public Alumno(String pNom, String pCarnet, String pCarrera){
        this.nombre = pNom;
        this.carnet = pCarnet;
        this.carrera = pCarrera;
    }
    
    public void calc(){
        this.materiasCursadas = this.lMat.size();
        this.CUM =0;
        for (int i = 0; i < this.lMat.size(); i++) {
            this.CUM += this.lMat.get(i).promedio;
        }
        this.CUM = this.CUM/this.lMat.size();
        this.CUM *= 10;
        this.CUM = Math.round(this.CUM);
        this.CUM /= 10;
    }
}
