public class Haine {
    //atribute
    private String tip_haina;
    private double pret = 100;
    private int numar_stoc =11;
    private boolean poate_fi_returnata = false;

    public Haine(String tip_haina, double pret, int numar_stoc, boolean poate_fi_returnata) {
        this.tip_haina = tip_haina;
        this.pret = pret;
        this.numar_stoc = numar_stoc;
        this.poate_fi_returnata = poate_fi_returnata;
    }

    //getter setter
    public String getTip_haina() {
        return tip_haina;
    }

    public void setTip_haina(String tip_haina) {
        this.tip_haina = tip_haina;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getNumar_stoc() {
        return numar_stoc;
    }

    public void setNumar_stoc(int numar_stoc) {
        this.numar_stoc = numar_stoc;
    }

    public boolean isPoate_fi_returnata() {
        return poate_fi_returnata;
    }

    public void setPoate_fi_returnata(boolean poate_fi_returnata) {
        this.poate_fi_returnata = poate_fi_returnata;
    }

    //metode
    public void descrie_haine() {
        System.out.println("Tipul este " + tip_haina);
        if (poate_fi_returnata) {
            System.out.println("poate fi returnata");
        }
        else {
            System.out.println("nu poate fi returnat");
        }

        System.out.println("Are pretul de " + pret );
        System.out.println("Numarul de bucati disponibile : " +numar_stoc);
    }
    public void aplica_discount() {
        if (poate_fi_returnata == false && numar_stoc >= 10) {
            pret = pret * 0.5;

        }
    }

    public void descrie_Haine() {
    }
}

