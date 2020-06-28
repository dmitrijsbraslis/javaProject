import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Pēc īpaši karstas aizejošās nedēļas nogales jaunnedēļ pirmajā pusē laiks būs lielākoties mākoņains un daudzviet gaidāms lietus. Nedēļas sākumā Latvijas teritoriju no rietumiem šķērsos aukstā atmosfēras fronte, kas nesīs plašu nokrišņu zonu, vēsta jaunākās Latvijas Vides, ģeoloģijas un meteoroloģijas centra sinoptiķu prognozes";

        String[] words = text.split(" ");
        System.out.println("Words count is " + words.length);

        for (int i = 0; i < words.length; i = i + 2) {
            System.out.println("The word with id " + i + " is " + words[i]);
        }

        for (String word : words) {
            System.out.println(word);
        }

        List<String> names = new ArrayList<>();
        names.add("Valerij");
        names.add("Kostik the best");
        names.add("Maxik");
        names.add("uPsa - i eto aspirin");

        System.out.println(names.get(1));

        for (String name : names) {
            System.out.println(name);
        }

        HashMap<String, Integer> bookUniqueWords = new HashMap<>();
        bookUniqueWords.put("the", 1);
        bookUniqueWords.put("student", 1);
        bookUniqueWords.put("is", 1);
        bookUniqueWords.put("the", 2);

        for (Map.Entry<String, Integer> entry : bookUniqueWords.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
