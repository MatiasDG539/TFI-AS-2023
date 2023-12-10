package tfi_2023.Persistencia;

import java.util.ArrayList;
import tfi_2023.Modulos.Consorcio;
import tfi_2023.Modulos.Departamento;
import org.jpl7.Query;

public interface Persistencia {
    
    public ArrayList<Consorcio> getConsorcios();
    
    public void setConsorcios(ArrayList<Consorcio> consorcios);
    
    public Consorcio isConsorcio(String consorcio);
    
    public boolean depto (int unidad, String depto);
    
    public ArrayList<Consorcio> buscaDeptos();
    
    public ArrayList<Consorcio> buscaDeptos(String depto);
    
    
    public ArrayList<String> cargaDeptos();
    
                
    public Query getQuery();
    
    public void setQuery(Query query);
    
    public boolean conectar();
    
    public boolean desconectar();
}
