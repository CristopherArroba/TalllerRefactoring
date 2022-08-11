package modelos;

import java.util.ArrayList;

public class Estudiante extends Persona{
    //Informacion del estudiante
    public String matricula;
    public String facultad;
    public ArrayList<Paralelo> paralelos;

    public Estudiante(String nombre, String apellido, int edad, String direccion, String telefono, String Matricula, String Facultad){
        super(nombre, apellido, edad, direccion, telefono);
        this.matricula = matricula;
        this.facultad = facultad;
    }
    
    //Getter y setter de Matricula

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //Getter y setter de la Facultad
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNotaInicial(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        double notaInicial=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
                double notaPractico=(ntalleres)*0.20;
                notaInicial=notaTeorico+notaPractico;
            }
        }
        return notaInicial;
    }
    
    //Calcula y devuelve la nota final contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    
    public double CalcularNotaFinal(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        double notaFinal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
                double notaPractico=(ntalleres)*0.20;
                notaFinal=notaTeorico+notaPractico;
            }
        }
        return notaFinal;
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                notaTotal=(p.getMateria().notaInicial+p.getMateria().notaFinal)/2;
                
            }
        }
        return notaTotal;
        
    }
}
        
    
    
    
            
        
        
