package KursJavaOOP.lesson56.homework.Train;

/**
 * Created by smith on 10/6/16.
 */
public interface Train {
    void turnLeft();
    void turnRight();
    void lightOn();
    void lightOff();
    boolean isLightOn();

    boolean isLength(int expectedLength);
}
