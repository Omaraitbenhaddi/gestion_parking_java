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
    
}
