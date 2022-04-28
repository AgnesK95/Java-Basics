public class Animal {
    //oop (programare orientata pe obiecte)
    //clasa animal = definitia teoretica a conceptului animal

    //atribute
    private String tip_animal;
    private String culoare;
    private String nume;
    private int varsta;
    private boolean este_deparazitat;
    private boolean este_in_viata = true;
    private int numar_de_picioare = 4;
    //constructor ( ce atribute sunt necesare)
    public Animal(String tip_animal, int varsta) {
        this.tip_animal = tip_animal;
        this.varsta = varsta;
    }
    //getter and setter (metode care returneaza sau editeaza atributele)
    public String getTip_animal() {
        return tip_animal;
    }

    public void setTip_animal(String tip_animal) {
        this.tip_animal = tip_animal;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public boolean isEste_deparazitat() {
        return este_deparazitat;
    }

    public void setEste_deparazitat(boolean este_deparazitat) {
        this.este_deparazitat = este_deparazitat;
    }

    public boolean isEste_in_viata() {
        return este_in_viata;
    }

    public void setEste_in_viata(boolean este_in_viata) {
        this.este_in_viata = este_in_viata;
    }

    public int getNumar_de_picioare() {
        return numar_de_picioare;
    }

    public void setNumar_de_picioare(int numar_de_picioare) {
        this.numar_de_picioare = numar_de_picioare;
    }
    //metode create de noi
    public void descrie_animal(){
        System.out.println("Animalul este " + tip_animal);
        System.out.println("Are numele de  " + nume + " si are varsta de " + varsta);
        System.out.println("are culoarea " + culoare + " si are " + numar_de_picioare +" picioare ");
        if (este_in_viata){
            System.out.println("este in viata");
            if (este_deparazitat){
                System.out.println("este deparazitat");
            }else {
                System.out.println("nu este deparazitat");
            }
        }else {
            System.out.println("nu este in viata");
        }
    }
}
