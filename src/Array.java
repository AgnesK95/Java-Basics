import java.util.Arrays;
//tema
public class Array {
    public static void main(String[] args) {
        //declaram si initializam
        String[] note = {"Do", "Re", "Mi", "Fa", "Sol", "La", "Si", "Do"};
        for (String nota : note) {
            System.out.println(nota);
        }
        for (int i = 0; i <note.length;i++  ){
            System.out.println(note[i]);
        }
        for (int i =note.length-1; i >=0;i--){
            System.out.println(note[i]);
        }
    }
};