public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("JohnWick", "Elf","Blade");
        Wizard wizard = new Wizard("Gandalf", "Wizard","Expecto Patronum");

        warrior.attack();
        wizard.attack();
    }
}
