/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author HP
 */
public class voiture extends vechicule {
    private int nombrePorte;
    public voiture(String marque, String modele, String imatriculation,int nombrePorte) {
        super(marque, modele, imatriculation);
        this.nombrePorte=nombrePorte;
    }

    public int getNombrePorte() {
        return nombrePorte;
    }

    public void setNombrePorte(int nombrePorte) {
        this.nombrePorte = nombrePorte;
    }
    
}
