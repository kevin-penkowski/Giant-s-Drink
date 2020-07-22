package drinkGame.ptui;

public class Character {
    private String representation = "*";
    private String spot;

    public Character(String spot){
        this.spot = spot;
    }

    public String move(String newSpot) {
        String ph = spot.toString();
        this.spot = newSpot;
        return ph;
    }

}
