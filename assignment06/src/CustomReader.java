import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CustomReader {
    private BufferedReader bufferedReader;
    private FileReader fileReader;
    private String path;
    private ArrayList<String> words;


    public CustomReader(String path) {
        try {
            ArrayList<String> words = new ArrayList<>();
            this.path = path;
            this.fileReader = new FileReader(this.path);
            this.bufferedReader = new BufferedReader(fileReader);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("CustomReader created.");
        }
    }

    public String readLineAt(int index) {
        String line = "";
        try {
            //reset the buffer if it is not at the beginning
            this.fileReader = new FileReader(this.path);
            this.bufferedReader = new BufferedReader(fileReader);
            for (int i = 0; i < index; i++) {
                line = this.bufferedReader.readLine();
            }
            //if the line is full of spaces, print warning message
            if (line.trim().isEmpty()) {
                System.err.print("Warning: The line is full of spaces.");
            }
        } catch (Exception e) {
            System.out.println("Error Occurred in ReadLineAt Method: " + e.getMessage());
        }
        return line;
    }

    //Read all words from file
    public List<String> readWords() {
        try{
            //reset the buffer if it is not at the beginning
            this.fileReader = new FileReader(this.path);
            this.bufferedReader = new BufferedReader(fileReader);
            //read all lines
            this.words = new ArrayList<>();
            String line = this.bufferedReader.readLine();
            while (line != null) {
                //call custom Readfile method for splitting the line
                splitLine(line);
                line = this.bufferedReader.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error Occurred in ReadWords Method: " + e.getMessage());
        }
        return this.words;
    }

    /***
     * @implNote This method is used for splitting the line into words.
     * This method created by Recep Tayyip Erdogan.
     * Split the line
     * @param line
     */
    private void splitLine(String line) {
        try{

            for (int i = 0; i < line.length(); i++) {
                if (Character.isLetter(line.charAt(i))) {
                    String word = "";
                    while (Character.isLetter(line.charAt(i))) {
                        word += line.charAt(i);
                        i++;
                    }
                    this.words.add(word);
                }
            }
        } catch (Exception e) {
            System.out.println("Error inside of Custom reader class: " + e.getMessage());
        }
    }
}
