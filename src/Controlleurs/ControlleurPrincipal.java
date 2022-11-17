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
    private ControlleurVuePrincipale ctrlVuePrinc;
    private ControlleurVueProgressionAccord CtrlAccord;

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
    
    public void afficheAccordProgresifs (){
        this.ctrlVuePrinc.getVue().setVisible(false);
        this.CtrlAccord.getVue().setVisible(true);
    }
    
    public void retourPrinciaple (){
        this.CtrlAccord.getVue().setVisible(false);
        this.ctrlVuePrinc.getVue().setVisible(true);
    }
    
    public void remplirBox(){
        this.CtrlAccord.remplirJcomboBox();
    }
}
