/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lanceur;
import Vues.*;
import Controlleurs.*;
/**
 *
 * @author Victor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VuePrincipale vuePrinc = new VuePrincipale();
        ControlleurVuePrincipale CtrlVuePinc = new ControlleurVuePrincipale(vuePrinc);
        
        VueProgressionAccord VueAccord = new VueProgressionAccord();
        ControlleurVueProgressionAccord CtrlAccord = new ControlleurVueProgressionAccord(VueAccord);
        
        vuePrinc.setVisible(true);
    }
    
}
