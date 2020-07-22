package drinkGame.ptui;

import drinkGame.Observer;
import drinkGame.model.GiantsDrinkData;
import drinkGame.model.GiantsDrinkModel;

public class GiantsDrinkPTUI implements Observer<GiantsDrinkModel, GiantsDrinkData> {

    private CharacterMap[][] map;

    @Override
    public void update(GiantsDrinkModel model, GiantsDrinkData data) {
        GiantsDrinkData.GiantsDrinkDataType type = data.getType();
        switch (type){
            case MOVE:
                break;
            case DEATH:
                break;
            case MESSAGE:
                System.out.println(data.getMsg());
                break;
            case RESTART:
                break;
        }
    }

    public void display(){
        System.out.println(map);
        System.out.println("**GIANT** \"Well, Rat, which will it be?\"");
        System.out.println(left.getMsg);
        System.out.println(right.getMsg);
    }
}

//          . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .
//           . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .
//          . . . . . . . . . . . . . . . . . . . . . _________ . . . . . . . . . . . . . . . . . . . . .
//           . . . . . . . . . . . . . . . . . . . . /vvvvvvvvv\ . . . . . . . . . . . . . . . . . . . .
//          . . . . . . . . . . . . . . . . . . . . .|  O   O  |. . . . . . . . . . . . . . . . . . . . .
//           . . . . . . . . . . _______-----________| _______ |_________-----______ . . . . . . . . . .
//          . . . . . . . . . . / . . .(     )  . . .\_________/. . . . (     ). . .\ . . . . . . . . . .
//           . . . . . . . . ./. . . . .uuuuu. . . . . . . . . . . . . . uuuuu. . . .\ . . . . . . . . .
//          . . . . . . . \~~~~~/ . . . . . . . . . . . . . . . . . . . . . . . . . \~~~~~/ . . . . . . .
//           . . . . . . ./\___/ . . . . . . . . . . . . . . . . . . . . . . . . . . \___/\. . . . . . .
//          . . . . . . / . .|. . . . . . . . . . . . . . . . . . . . . . . . . . . . .|. . \ . . . . . .
//           . . . . ./. . . - . . . . . . . . . . . . . . . . . . . . . . . . . . . . - . . .\. . . . .
//          . . . . / . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . \ . . . .
//           . . ./. . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .\. . .
//          . . / . . . . . . . . . . . . . . . . . . .*. . . . . . . . . . . . . . . . . . . . . . \ . .
//           ./. . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .\.
//          / . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . \
//          _____________________________________________________________________________________________
//          **GIANT** "Well, Rat, what will it be?"
//          To your left is...
//          To your right is...
//                  Choose (right/left):