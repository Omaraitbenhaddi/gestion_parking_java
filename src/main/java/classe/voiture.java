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

    @Override
    public String toString() {
        String chaine = "le voiture est de marque " + getMarque() + " mdodele " + getModele() + " son immatriculation est " + getImatriculation() + " avec nombre de porte " + getNombrePorte() ;
        return chaine; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
