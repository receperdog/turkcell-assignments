import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author: Recep Tayyip Erdogan
 * @date: 2022-11-09
 * @description: This class is a solution for the problem of finding the number of occurrences of each character in a string.
 */

public class SolutionWithHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string value: ");
        String str = scanner.nextLine();
        //lowercase the string
        String stringEnteredByUser = str.toLowerCase();
        //Create Linked hashmap to hold every character and its count
        /**
         * LinkedHashMap is used to maintain the order of insertion
         * I used linked hashmap to keep the order of characters
         */
        Map<String, Integer> hashMap = new LinkedHashMap<>();
        // I converted the string to a string array to avoid char unicode issues
        for (String c : stringEnteredByUser.split("")) {
            //if character is whitespace skip it
            if (c.equals(" ")) {
                continue;
            }
            //if character is not in hashmap add it to hashmap
            else if (!hashMap.containsKey(c)) {
                //There is no duplicate character is unique
                hashMap.put(c, 1);
            }
            //if character is already in hashmap then increment the count of that character
            else {
                //There is a duplicate character
                hashMap.put(c, hashMap.get(c) + 1);
            }
        }
        //print the characters and their counts
        for (String key : hashMap.keySet()) {
            System.out.print(key + "" + hashMap.get(key));
        }

    }
}
