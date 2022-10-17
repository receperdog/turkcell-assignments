import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author: Recep Tayyip Erdogan
 * @date: 2022-11-07
 * @description: This class is a solution for the problem of finding the number of occurrences of each character in a string.
 */

public class SolutionWithHashSet {
    //main method
    public static void main(String[] args) {
        //get string value from console using scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string value: ");
        String str = scanner.nextLine();
        //lowercase the string
        String stringEnteredByUser = str.toLowerCase();

        //create arraylist to hold characters
        ArrayList<Character> characters = new ArrayList<>();
        //create arraylist to hold counts of characters
        ArrayList<Integer> count = new ArrayList<>();

        //create a hashset for finding duplicates in characters
        HashSet<Character> hashSet = new HashSet<>();
        for (char c : stringEnteredByUser.toCharArray()) {
            //if character is whitespace skip it
            if (c == ' ') {
                continue;
            }
            //if character is not in hashset add it to hashset and add it to characters arraylist
            else if (hashSet.add(c)) {
                //There is no duplicate character is unique
                characters.add(c);
                count.add(1);
            }
            //if character is already in hashset then increment the count of that character
            else {
                //There is a duplicate character
                int index = characters.indexOf(c);
                count.set(index, count.get(index) + 1);
            }
        }
        //print the characters and their counts
        for (int i = 0; i < characters.size(); i++) {
            System.out.print(characters.get(i) + "" + count.get(i));
        }
        //print the unique characters
        System.out.print("\n");
        System.out.print("--------------------------");
        System.out.print("\n");
        for (Character character : characters) {
            System.out.print(character);
        }


    }
}