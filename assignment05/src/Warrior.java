public class Warrior extends Character implements Weapon{
    private String weapon;
    public Warrior(String nickName, String origin, String weapon) {
        super(nickName, origin);
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        System.err.println("Warrior attacks with " + weapon);
    }
}
