public class Wizard extends Character implements Weapon{
    private String spell;

    public Wizard(String nickName, String origin, String spell) {
        super(nickName, origin);
        this.spell = spell;
    }

    @Override
    public void attack() {
        System.err.println("Wizard attacks with " + spell);
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }
}

