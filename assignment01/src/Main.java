import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Find the letters occurrences count from given string
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Integer> occurrences = new ArrayList<>();
        String str = "Hello World";
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (letters.contains(letter)) {
                int index = letters.indexOf(letter);
                occurrences.set(index, occurrences.get(index) + 1);
            } else {
                letters.add(letter);
                occurrences.add(1);
            }
        }
        for (int i = 0; i < letters.size(); i++) {
            System.out.print(letters.get(i) +""+ occurrences.get(i));
        }
        System.out.println("\n");
        // Non Repeating letters
        for (int i = 0; i < letters.size(); i++) {
            System.out.print(letters.get(i));
        }

    }
}
