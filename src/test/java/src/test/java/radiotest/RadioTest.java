package src.test.java.radiotest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.main.java.radio.Radio;

public class RadioTest {

    @Test
    public void shouldSetProgramme() {
        Radio radio = new Radio(20);

        int expected = 20;
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

        int expected = 100;
        int actual = radio.increaseVolume(100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lastProgramme() {
        Radio radio = new Radio(30);

        int expected = 0;
        int actual = radio.switchProgrammeUp(29);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstProgramme() {
        Radio radio = new Radio(34);

        int expected = 33;
        int actual = radio.switchProgrammeDown(0);

        Assertions.assertEquals(expected, actual);
    }
}

