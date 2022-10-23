import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("JohnWick", "Elf","Blade");
        Wizard wizard = new Wizard("Gandalf", "Wizard","Expecto Patronum");

        //Hashmaplerin Entryleri vardır. Entrylerin key ve value değerleri vardır.

        warrior.attack();
        wizard.attack();


    }
}
