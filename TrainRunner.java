package KursJavaOOP.lesson56.homework.Train;

/**
 * Created by smith on 10/6/16.
 */
public class TrainRunner {

    public static void main(String[] args) {
        Train train = new RealTrain();

        if (train.isLength(findTrainLength(train)))
            System.out.println("You got out of the train, its length = " + findTrainLength(train) + "!");
    }

    public static int findTrainLength(Train train) {

        //starts position
        int number;
        int current = 1;

        //check if current light is on (set it to on) and make a single step
        train.lightOn();
        train.turnRight();

        while (true) {
            //if the light is off just continue the movement
            if (!train.isLightOn()) {
                train.turnRight();
                current++;
            }
            //else set the current (enabled light) to off and turn around, then make steps until u reach start position
            //and track the total vagons number
            else {
                train.lightOff();
                number = current;
                for (int i = 0; i < number; i++)
                    train.turnLeft();
                current = 0;
                //We are at the start position, now check if the start light is off, if so then exit and return number
                if (!train.isLightOn()) break;
                //If it's not off, then turn around and repeat all actions
                else {
                    train.turnRight();
                    current++;
                }
            }

        }

        return number;
    }

}
