package tfi_2023.Modulos;

import java.util.ArrayList;

public class Consorcio {
    
    private String nombre;
    private String direccion;
    
    private ArrayList<Departamento> deptos = new ArrayList<>();
    
    public Consorcio(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Departamento> getDeptos(){
        return deptos;
    }
    
    public void agregarDeptos(Departamento depto){
        deptos.add(depto);
    }
    
    @Override
    public String toString() {
        
        return "Consorcio{" + " Nombre consorcio: " + nombre + ", Direccion consorcio: " + direccion + '}';
     
    }
    
}