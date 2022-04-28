public class FunctiiTema {
    //functie care face suma  adoua numere
    public static int sumaNr(int nr1, int nr2) {
        int suma = nr1 + nr2;
        return suma;
    }
    //functie care afiseaza numele com.
    public static String numeComplet(String nume, String prenume){
        String numeComplet= nume + " " + prenume;
        return numeComplet;
    }
    //functie care ne spune daca s aluam umbrela sau ochelarii de soare
    public static String vreme(boolean ploua ,boolean soare){
        if (ploua==true  && soare == false){
            return "umbrela";
        }else {
            return "ochelari de soare";
        }
    }
    //media aritmetrica a 3 numere
    public static float mediaAritmecrica(int nr1, int nr2, int nr3){
        int media = nr1 + nr2 + nr3;
        return media/3;
    }

    public static void main(String[] args) {
        System.out.println(sumaNr(3, 4));
        System.out.println(numeComplet("Agi",  "Kiss"));
        System.out.println(vreme(true , false));
        System.out.println(mediaAritmecrica(8,10,12));
    }
}
