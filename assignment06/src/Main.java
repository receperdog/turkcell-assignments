import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {
        //Example of usage of CustomReader
        CustomReader reader = new CustomReader("C:\\Users\\erdog\\IdeaProjects\\turkcell-assignments\\assignment06\\src\\deneme.txt");
        System.out.println("Words = " + reader.readWords());
        System.out.println("Line at 2 = " + reader.readLineAt(3));

    }
}
