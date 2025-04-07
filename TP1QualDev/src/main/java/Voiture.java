public class Voiture {
    private String marque;
    private double prix;
    private String immatriculation;


    public Voiture (){
        this.marque = "BMW";
        this.prix = 0;
        this.immatriculation = "AA-AAA-AA";
    }

    public Voiture (String m, double p, String i){
        this.marque = m;
        this.prix = p;
        this.immatriculation = i;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }
}
