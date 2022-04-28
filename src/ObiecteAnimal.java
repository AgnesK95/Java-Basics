public class ObiecteAnimal {
    public static void main(String[] args) {
        //obiecte de tip animal (conform definitiei ele iau viata in mod concret
        //obiectele sunt instante ale clasei ex:cainele este un obiect de tip animal
        Animal catel_Blacky = new Animal("caine",5);
        Animal pisica_miti = new Animal("pisica", 2);
        catel_Blacky.setNume("Blacky");
        pisica_miti.setNume("Miti");
        catel_Blacky.setEste_deparazitat(true);
        pisica_miti.setEste_deparazitat(false);
        catel_Blacky.setCuloare("Negru");
        pisica_miti.setCuloare("Gri");
        System.out.println(catel_Blacky.getCuloare());
        System.out.println(pisica_miti.getCuloare());
        catel_Blacky.descrie_animal();
        pisica_miti.descrie_animal();
        //moare un animal
        pisica_miti.setEste_in_viata(false);
        pisica_miti.descrie_animal();
    }

}
