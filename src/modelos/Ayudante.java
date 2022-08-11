package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{
    public ArrayList<Paralelo> paralelos;

    public Ayudante(String nombre, String apellido, int edad, String direccion, String telefono, String Matricula, String Facultad) {
        super(nombre, apellido, edad, direccion, telefono, Matricula, Facultad);
    }
    
    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
