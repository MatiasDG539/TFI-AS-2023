package tfi.as.pkg2023.Controlador;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import tfi.as.pkg2023.UI.LoginUI;

public class Controler implements ActionListener{
    
    private LoginUI UI = new LoginUI();
    
    public Controler() {
    }
    
    public void execute(){
        UI.setControlator(this);
        UI.execute();
    }
    
    public void actionPerformed(ActionEvent e){
        System.out.println("User: "+ UI.getUserName());
        System.out.println("Password: " + UI.getPassword());
    }
}
