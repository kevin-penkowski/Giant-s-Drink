package drinkGame.ptui;

import drinkGame.Observer;
import drinkGame.model.GiantsDrinkData;
import drinkGame.model.GiantsDrinkModel;

public class GiantsDrinkPTUI implements Observer<GiantsDrinkModel, GiantsDrinkData> {

    private char[][] map;

    @Override
    public void update(GiantsDrinkModel model, GiantsDrinkData data) {

    }

    public void display(){
        System.out.println();
    }
}


/**
 * . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .
 *  . . . . . . . . . . ___________________________________________________ . . . . . . . . . .
 * . . . . . . . . . . / . . . . . . . . . . . . . . . . . . . . . . . . . \ . . . . . . . . . .
 *  . . . . . . . . ./. . . . . . . . . . . . . . . . . . . . . . . . . . . .\. . . . . . . . .
 * . . . . . . . \~~~~~~/. . . . . . . . . . . . . . . . . . . . . . . . . \~~~~~~/. . . . . . .
 *  . . . . . . ./\___/ . . . . . . . . . . . . . . . . . . . . . . . . . . \___/\. . . . . . .
 * . . . . . . / . .|. . . . . . . . . . . . . . . . . . . . . . . . . . . . .|. . \ . . . . . .
 *  . . . . ./. . . - . . . . . . . . . . . . . . . . . . . . . . . . . . . . - . . .\. . . . .
 * . . . . / . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . \ . . . .
 *  . . ./. . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .\. . .
 * . . / . . . . . . . . . . . . . . . . . . .*. . . . . . . . . . . . . . . . . . . . . . \ . .
 *  ./. . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .\.
 * / . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . \
 */

          . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .
           . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .
          . . . . . . . . . . . . . . . . . . . . . _________ . . . . . . . . . . . . . . . . . . . . .
           . . . . . . . . . . . . . . . . . . . . /vvvvvvvvv\ . . . . . . . . . . . . . . . . . . . .
          . . . . . . . . . . . . . . . . . . . . .|  O   O  |. . . . . . . . . . . . . . . . . . . . .
           . . . . . . . . . . _______-----________| _______ |_________-----______ . . . . . . . . . .
          . . . . . . . . . . / . . .(     )  . . .\_________/. . . . (     ). . .\ . . . . . . . . . .
           . . . . . . . . ./. . . . .uuuuu. . . . . . . . . . . . . . uuuuu. . . .\ . . . . . . . . .
          . . . . . . . \~~~~~/ . . . . . . . . . . . . . . . . . . . . . . . . . \~~~~~/ . . . . . . .
           . . . . . . ./\___/ . . . . . . . . . . . . . . . . . . . . . . . . . . \___/\. . . . . . .
          . . . . . . / . .|. . . . . . . . . . . . . . . . . . . . . . . . . . . . .|. . \ . . . . . .
           . . . . ./. . . - . . . . . . . . . . . . . . . . . . . . . . . . . . . . - . . .\. . . . .
          . . . . / . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . \ . . . .
           . . ./. . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .\. . .
          . . / . . . . . . . . . . . . . . . . . . .*. . . . . . . . . . . . . . . . . . . . . . \ . .
           ./. . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .\.
          / . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . \
          _____________________________________________________________________________________________
          **GIANT** "Well, Rat, what will it be?"
          To your left is...
          To your right is...
                  Choose (right/left):