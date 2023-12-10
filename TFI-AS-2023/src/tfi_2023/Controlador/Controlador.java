package tfi_2023.Controlador;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import tfi_2023.UI.*;
import tfi_2023.Modulos.*;
import tfi_2023.Persistencia.*;



public class Controlador implements ActionListener{
    
    private static String archProlog = "ConsorcioMariaDB.pl"; //poner ruta al archivo para que se cargue automaticamente
    private static Consorcios consorcios;
    private static Persistencia persistencia;
    
    private LoginUI UI = new LoginUI();
    
    public Controlador() {
    }
    
    public static void execute(){
        LoginUI logUI = new LoginUI();
        logUI.setVisible(true);
        
        try{
            
            persistencia = new PersistenciaProlog(archProlog);
            consorcios = new Consorcios(persistencia);
            consorcios.conectar();
            logUI.getConexionPrologODBC().setText("Conectado exitosamente"); 
        } catch (Exception ex) {
            ex.printStackTrace(); // Esto imprimirá los detalles del error en la consola
            JOptionPane.showMessageDialog(logUI, "Problemas al conectar con Prolog: " + ex.getMessage(), "Mensaje de error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
}
    }    
    public static void consultas(LoginUI log){
        CobroExpensasUI consulta = new CobroExpensasUI(log, true);
    }
        
    public static void cargaDeptos(CobroExpensasUI consulta){
        persistencia.buscaDeptos();
        cargaTablaConsultas(consulta);
    }
    
    public static void cargaTablaConsultas(CobroExpensasUI consulta){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnCount(0);
        modelo.setNumRows(0);
        modelo.addColumn("Consorcio");
        modelo.addColumn("Direccion");
        modelo.addColumn("Unidad");
        modelo.addColumn("Departamento");
        modelo.addColumn("Nombre departamento");
        modelo.addColumn("Monto puro");
        modelo.addColumn("Saldo favor");
        modelo.addColumn("Saldo contra");
        modelo.addColumn("Monto total");
        
        for(Consorcio consorcio : persistencia.getConsorcios()){
            Object[] fila = new Object[10];
            fila[0] = consorcio.getNombre();
            fila[1] = consorcio.getDireccion();
            for(Departamento depto : consorcio.getDeptos()){
                fila[2] = depto.getUnidad();
                fila[3] = depto.getDepto();
                fila[4] = depto.getNomDepto();
                fila[5] = depto.getMonPuro();
                fila[6] = depto.getSaldoFav();
                fila[7] = depto.getSaldoCon();
                fila[8] = depto.getMonTotal();
                
            modelo.addRow(fila);
            }
        }
                
    }
    
    public void actionPerformed(ActionEvent e){
        System.out.println("User: "+ UI.getUserName());
        System.out.println("Password: " + UI.getPassword());
    }
}
