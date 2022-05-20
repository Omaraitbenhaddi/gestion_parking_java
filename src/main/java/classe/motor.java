/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author HP
 */
public class motor extends vechicule {
    private int vitesseMax ;
    
    public motor(String marque, String modele, String imatriculation, int vitesseMax) {
        super(marque, modele, imatriculation);
        this.vitesseMax=vitesseMax;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }
    
}
