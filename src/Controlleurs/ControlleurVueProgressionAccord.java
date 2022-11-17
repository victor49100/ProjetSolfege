/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import Vues.VueProgressionAccord;
/**
 *
 * @author Victor
 */
public class ControlleurVueProgressionAccord implements WindowListener, ActionListener {
    private ControlleurPrincipal ctrlP;
    private VueProgressionAccord vue;
    
    
    public ControlleurVueProgressionAccord(VueProgressionAccord vue,ControlleurPrincipal ctrlP){
        this.ctrlP = ctrlP;
        this.vue = vue;
        this.vue.addWindowListener(this);
        this.vue.getButtonRetour().addActionListener(this);
        
    }

    public VueProgressionAccord getVue() {
        return vue;
    }

    public void setVue(VueProgressionAccord vue) {
        this.vue = vue;
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
        
        if (e.getSource() == vue.getButtonRetour()){
            System.out.println("retour");
            ctrlP.retourPrinciaple();
        }
        
    }
    
}
