package tfi_2023.Persistencia;

import java.util.ArrayList;
import java.util.Map;
import tfi_2023.Modulos.Consorcio;
import tfi_2023.Modulos.Departamento;
import org.jpl7.*;

public class PersistenciaProlog implements Persistencia{
 
    private int ultimoNumUnidad = 0;
    
    private Query query;
    
    private ArrayList<Consorcio> consorcios = new ArrayList<>();
    
    public PersistenciaProlog(String archProlog) throws Exception {
        if (!new Query("consult('" + archProlog + "')").hasSolution()) {
            throw (new Exception("error"));
        }
    }
    
    @Override
    public Query getQuery(){
        return query;
    }
    
    @Override
    public void setQuery(Query query){
        this.query = query;
    }
    
    @Override
    public boolean conectar(){
        query = new Query("abrir_conexion");
        return query.hasSolution();
    }
    
    @Override
    public boolean desconectar(){
        query = new Query("cerrar_conexion");
        return query.hasSolution();
    }
    
    @Override
    public ArrayList<Consorcio> getConsorcios(){
        return consorcios;
    }
    
    @Override
    public void setConsorcios(ArrayList<Consorcio> consorcios){
        this.consorcios = consorcios;
    }
    

    public Consorcio isConsorcio (String consorcio){
        for (Consorcio con : consorcios){
            System.out.println(con);
            if (con.equals(null)) {
                con.setNombre(consorcio);
                con.setDireccion(consorcio);
                return con;
            }
        }
        return (new Consorcio());
    }
    
    @Override
    public boolean depto(int unidad, String depto){
        
        String clausula = "depto(" + unidad + ",'" + depto + "')";
        return (new Query(clausula)).hasSolution();  
    }
    
    @Override
    public ArrayList<Consorcio> buscaDeptos(){
        String clausula = "depto(Unidad, Depto, NomDepto, MontPuro, SaldoFav, SaldoCon, MonTotal)";
        return inferirDeptos(clausula, "");
    }
    
    @Override
    public ArrayList<Consorcio> buscaDeptos(String depto){
        System.out.println(depto);
        String clausula = "depto(Unidad, Depto, NomDepto, MontPuro, SaldoFav, SaldoCon, MonTotal)";
        
        if (!depto.equals("")){
            clausula = "depto(Unidad, Depto, NomDepto, MontPuro, SaldoFav, SaldoCon, MonTotal)";
        }
        return inferirDeptos(clausula, depto);
    }
    
    @Override
    public ArrayList<String> cargaDeptos(){
        String clausula = "depto(unidad, Depto)";
        ArrayList<String> deptos = new ArrayList<>();
        query = new Query(clausula);
        for(Map<String, Term> q : query.allSolutions()){
            String depto;
            depto = String.valueOf(q.get("Depto").toString().substring(1, q.get("Depto").toString().length() - 1));
            deptos.add(depto);
        }
        return deptos;
    }
    
    private ArrayList<Consorcio> inferirDeptos(String t0, String depto){
        System.out.println(t0);
        consorcios.removeAll(consorcios);
        query = new Query(t0);
        for(Map<String, Term> q : query.allSolutions()){
            System.out.println(q);
            String consorcioNom = (q.get("Nombre consorcio").toString().substring(1, q.get("Nombre consorcio").toString().length() - 1));
            Consorcio consorcio = isConsorcio(consorcioNom);
            consorcio.setNombre(consorcioNom);
            
            consorcio.setDireccion(q.get("Direccion consorcio").toString().substring(1, q.get("Direccion consorcio").toString().length() - 1));
            
            Departamento dep = new Departamento();
            
            if(depto.equals("")){
                dep.setDepto(q.get("Depto").toString().substring(1, q.get("Depto").toString().length() - 1));
                
            } else{
                dep.setDepto(depto);
            }
                        
            ultimoNumUnidad++;
            dep.setUnidad(ultimoNumUnidad);
            dep.setDepto(q.get("Depto").toString().substring(1, q.get("Depto").toString().length() - 1));
            dep.setNomDepto(q.get("Nombre depto").toString().substring(1, q.get("Nombre depto").toString().length() - 1));
            dep.setMonPuro(Double.valueOf(q.get("Monto puro").toString()));
            dep.setSaldoCon(Double.valueOf(q.get("Saldo favor").toString()));
            dep.setSaldoCon(Double.valueOf(q.get("Saldo contra").toString()));
            dep.setMonTotal(dep.getMonPuro() + dep.getSaldoCon() - dep.getSaldoFav());
            
            consorcio.agregarDeptos(dep);
            consorcios.add(consorcio);
        }
        
        return consorcios;
    }

}