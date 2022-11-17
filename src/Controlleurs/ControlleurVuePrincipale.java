/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import Vues.VuePrincipale;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Victor
 */
public class ControlleurVuePrincipale implements WindowListener, ActionListener {

    private VuePrincipale vueMain;
    private ControlleurPrincipal ctrlP;

    public ControlleurVuePrincipale(VuePrincipale vue,ControlleurPrincipal ctrlP) {
        this.vueMain = vue;
        this.ctrlP = ctrlP;
        
        // le contrôleur écoute la vue
        this.vueMain.addWindowListener(this);
        this.vueMain.getButtonProgAccords().addActionListener(this);
        this.vueMain.getButtonListeAccords().addActionListener(this);
        
    }

    public VuePrincipale getVue() {
        return vueMain;
    }

    public void setVue(VuePrincipale vue) {
        this.vueMain= vue;
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vueMain.getButtonProgAccords()){
            System.out.println("Progression d'accords");
            ctrlP.afficheAccordProgresifs();
            ctrlP.remplirBox();
        }
        if (e.getSource() == vueMain.getButtonListeAccords()){
            System.out.println("Listes d'accords");
        }

    }

}
