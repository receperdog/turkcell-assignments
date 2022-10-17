public class Main {
    public static void main(String[] args) {
        //model two has fast charging
        Tesla modelOne = new Tesla("Model One", "2022", "Red", "Tesla",
                2022, 0, 200, 0, false, false, false, 100, 100, false, false,
                true, false, true, true);
        modelOne.move();
        modelOne.chargeBattery();
        modelOne.move();
        modelOne.move();
        modelOne.stopEngine();

        //model two has not fast charging
        Tesla modelTwo = new Tesla("Model Two", "2022", "Red", "Tesla",
                2022, 0, 200, 0, false, false, false, 50, 100, false, false,
                true, false, true, false);
        modelTwo.move();
        modelTwo.chargeBattery();
        modelTwo.move();
        modelTwo.move();
        modelTwo.stopEngine();

        //create new Clio with LPG :)
        Clio clio = new Clio("Clio 1", "2021", "Gray", "Renault",
                2001, 0, 110, 0, false, false, false, 100, 100, false, true,
                false, false, true, true, false, false, true, true);
        clio.move();

        Clio clio2 = new Clio("Clio 2", "2021", "Gray", "Renault",
                2001, 0, 110, 0, false, false, false, 100, 0, false, false,
                false, false, true, true, false, false, true, true);
        clio2.refuel();
        clio2.move();


    }
}
