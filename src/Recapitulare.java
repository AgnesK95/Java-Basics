public class Recapitulare {
    //definire metode
    public static int sumaNumerelor(int a, int b, int c) {
        int suma = a + b + c;
        return suma;
    }
    public static boolean estePozitiv(double nr) {
        if (nr > 0){
        return true;
    }else {
            return false;
        }
}
    public static void main(String[] args) {
        //tipuri de date
        String nume = "Agi";//sir de caractere delimitat de ghilimele
        int varsta = 26;//numar intreg
        double pret = 101.3; //numar zecimal
        boolean casatorit = true;
        System.out.println("Numele meu este " + nume);
        System.out.println("Am varsta de " + varsta);
        //if else
        if (casatorit == true) {
            System.out.println("Am verigheta");
        } else {
            System.out.println("Nu am verigheta");
        }
        if (pret < 0) {
            System.out.println("Pret invalid");
        }else if (pret == 0 ){
            System.out.println("Donatie");
        }else if (pret < 100){
            System.out.println("Ieftin");
        }else{
            System.out.println("Scump");
        }
        //while
        int mario = 3;
        while (mario > 0) {
            System.out.println("vieti : "+mario);
            System.out.println("Incepe jocul");
            System.out.println("Am pierdut o viata");
            mario = mario - 1;
        }
        System.out.println("Game over");
        //array
        String[] culori= {"roz", "mov", "albastru", "alb","negru"};
        System.out.println(culori[0]);//primul element are index 0
        System.out.println(culori.length);
        System.out.println(culori[culori.length-1]);//ultimul element
        culori[4] = "rosu";
        System.out.println(culori[4]);
        //for each
        for (String culoare : culori) {
            System.out.println(culoare);
        }
        //for
        for (int i = 0; i < culori.length; i++){
            System.out.println(culori[i]);
        }
        //metode
         int suma1=sumaNumerelor(1 ,2 ,3 );
        System.out.println(suma1);
        System.out.println(sumaNumerelor(10 , 20 , 30));
        System.out.println(estePozitiv(10.5));
        System.out.println(estePozitiv(-2.3));




    }//inchide funcita main
}//inchide clasa