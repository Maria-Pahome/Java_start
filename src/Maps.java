import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
       //declaram un map
        Map <String, Integer> note_elevi = new HashMap <>();

        //adaugam elemente
        note_elevi.put("Gigel", 10);
        note_elevi.put("Costel", 9);
        note_elevi.put("Ana", 10);

        //aflu notele
        System.out.println("Ana are note " + note_elevi.get("Ana"));

        //actualizam valori
        note_elevi.replace("Costel",10);
        System.out.println("Costel are noua nota de " + note_elevi.get("Costel"));

        //aflam dimensiunea
        System.out.println(note_elevi.size());

        //stergem valori
        note_elevi.remove("Gigel");
        System.out.println(note_elevi.get("Gigel"));

        //declaram si initializam cu valori
        //map nu este ordonat
        Map<String, Integer> luni = new HashMap <>()
        {{
            put("jan", 2);
            put("feb", 2);
            put("mar", 3);
        }};
        System.out.println(luni);
    }
}
