package tfi_2023.Modulos;

import tfi_2023.Persistencia.Persistencia;
import java.util.ArrayList;

public class Consorcios {
    
    private Persistencia persistencia;
    
    private ArrayList<Consorcio> consorcios = new ArrayList<>();
    
    public Consorcios (Persistencia persistencia){
        this.persistencia = persistencia;
    }    
    
    public boolean conectar(){
        return persistencia.conectar();
    }
    
    public boolean desconectar(){
        return persistencia.desconectar();
    }
    
    public void agregarConsorcio(Consorcio cons){
        consorcios.add(cons);
    }

    public Persistencia getPersistencia() {
        return persistencia;
    }

    public void setPersistencia(Persistencia persistencia) {
        this.persistencia = persistencia;
    }

    public ArrayList<Consorcio> getConsorcios() {
        return consorcios;
    }

    public void setConsorcios(ArrayList<Consorcio> consorcios) {
        this.consorcios = consorcios;
    }
    
}
