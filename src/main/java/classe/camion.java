/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author HP
 */
public class camion extends vechicule {
    private boolean remorque;
    
    public camion(String marque, String modele, String imatriculation, boolean remorque) {
        super(marque, modele, imatriculation);
        this.remorque = remorque;
    }

    public boolean isRemorque() {
        return remorque;
    }

    public void setRemorque(boolean remorque) {
        this.remorque = remorque;
    }
    
    
        @Override
    public String toString() {
        String chaine ;
        if(isRemorque()){
                chaine= "le camion est de marque " + getMarque() + " mdodele " + getModele() + " son immatriculation est " + getImatriculation() + " contient un remorque" ;

        }    
        else{
            chaine= "le camion est de marque " + getMarque() + " mdodele " + getModele() + " son immatriculation est " + getImatriculation() + " ne pas contient un remorque" ;

        }
        return chaine; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
