public class ObiecteHaine {
    public static void main(String[]args){
        Haine bluza=new Haine("bluza", 90.5,9, false);
        Haine caciula = new Haine("caciula", 100.0,20,false);
        bluza.descrie_haine();
        caciula.descrie_haine();
        bluza.aplica_discount();
        caciula.aplica_discount();
        System.out.println(bluza.getPret());
        System.out.println(caciula.getPret());
        bluza.setNumar_stoc(11);
        bluza.aplica_discount();
        bluza.descrie_haine();
        Haine tricou = new Haine("tricou",115, 23, true);
        Haine boxeri = new Haine("boxeri",95 , 55,false);
        Haine sutien = new Haine("sutien", 150 ,200, false );
        tricou.setNumar_stoc(11);
        tricou.aplica_discount();
        tricou.descrie_Haine();
        boxeri.setNumar_stoc(9);
        boxeri.aplica_discount();
        boxeri.descrie_haine();
        sutien.setNumar_stoc(17);
        sutien.aplica_discount();
        sutien.descrie_haine();




    }
}
