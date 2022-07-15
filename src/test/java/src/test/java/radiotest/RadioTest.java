package src.test.java.radiotest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.main.java.radio.Radio;

public class RadioTest {

    @Test
    public void shouldSetProgramme() {
        Radio radio = new Radio();

        radio.setCurrentProgramme(5);

        int expected = 5;
        int actual = radio.getCurrentProgramme();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.decreaseVolume(0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() {
        Radio radio = new Radio();

        int expected = 10;
        int actual = radio.increaseVolume(10);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lasProgramme() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.switchProgrammeUp(9);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstProgramme() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.switchProgrammeDown(0);

        Assertions.assertEquals(expected, actual);
    }
}