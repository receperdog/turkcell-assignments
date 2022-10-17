public class Character {
    private String nickName;
    private String origin;

public Character(String nickName, String origin) {
        this.nickName = nickName;
        this.origin = origin;
    }

    //getter and setter methods for nickName and origin
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
