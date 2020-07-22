package drinkGame.model;

public class GiantsDrinkData {

    private final GiantsDrinkDataType type;
    private final String msg;

    public GiantsDrinkData(GiantsDrinkDataType type, String msg){
        this.type = type;
        this.msg = msg;
    }

    public enum GiantsDrinkDataType{
        MOVE,
        DEATH,
        RESTART,
        MESSAGE;
    }

    public GiantsDrinkDataType getType() {
        return this.type;
    }

    public String getMsg() {
        return this.msg;
    }
}
