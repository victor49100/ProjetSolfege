/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlleurs;

/**
 *
 * @author Victor
 */
public class ControlleurPrincipal {
    private ControlleurVuePrincipale ctrlVuePrinc = null;
    private ControlleurVueProgressionAccord CtrlAccord = null;
    
    // acceuseur mutateur 

    public ControlleurVuePrincipale getCtrlVuePrinc() {
        return ctrlVuePrinc;
    }

    public void setCtrlVuePrinc(ControlleurVuePrincipale ctrlVuePrinc) {
        this.ctrlVuePrinc = ctrlVuePrinc;
    }

    public ControlleurVueProgressionAccord getCtrlAccord() {
        return CtrlAccord;
    }

    public void setCtrlAccord(ControlleurVueProgressionAccord CtrlAccord) {
        this.CtrlAccord = CtrlAccord;
    }
    
    
}
