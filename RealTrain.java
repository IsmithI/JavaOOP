package KursJavaOOP.lesson56.homework.Train;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by smith on 10/6/16.
 */
public class RealTrain implements Train {

    private int length;
    private final boolean[] vagons;
    private boolean current;
    private int currentI;

    public RealTrain() {
        length = new Random().nextInt(10) + 1;
        vagons = new boolean[length];

        for (int i = 0; i < length; i++) {
            vagons[i] = new Random().nextBoolean();
        }
        currentI = 0;
        current = vagons[currentI];
    }

    @Override
    public void turnLeft() {
        currentI--;
        if (currentI < 0) currentI = vagons.length-1;
        current = vagons[currentI];
    }

    @Override
    public void turnRight() {
        currentI++;
        if (currentI > vagons.length-1) currentI = 0;
        current = vagons[currentI];
    }

    @Override
    public void lightOn() {
        vagons[currentI] = true;
    }

    @Override
    public void lightOff() {
        vagons[currentI] = false;
    }

    @Override
    public boolean isLightOn() {
        return vagons[currentI];
    }

    @Override
    public boolean isLength(int expectedLength) {
        return expectedLength == length;
    }

    @Override
    public String toString() {
        return "RealTrain{" +
                "length=" + length +
                ", vagons=" + Arrays.toString(vagons) +
                ", current=" + current +
                ", currentI=" + currentI +
                '}';
    }
}
