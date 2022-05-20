
package classe;

/**
 *
 * @author HP
 */
public abstract class vechicule {
    protected String marque;
    protected String modele;
    protected String imatriculation;

    public vechicule(String marque, String modele, String imatriculation) {
        this.marque = marque;
        this.modele = modele;
        this.imatriculation = imatriculation;
    }
    

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getImatriculation() {
        return imatriculation;
    }

    public void setImatriculation(String imatriculation) {
        this.imatriculation = imatriculation;
    }

    
}
