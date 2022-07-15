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
    public void switchProgrammeUp() {
        Radio radio = new Radio();

        int expected = 5;
        int actual = radio.switchProgrammeUp(4);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void switchProgrammeDown() {
        Radio radio = new Radio();

        int expected = 5;
        int actual = radio.switchProgrammeDown(6);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setProgrammeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentProgramme(-1);

        int expected = 0;
        int actual = radio.getCurrentProgramme();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setProgrammeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentProgramme(12);

        int expected = 0;
        int actual = radio.getCurrentProgramme();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio radio = new Radio();

        int expected = 5;
        int actual = radio.decreaseVolume(6);

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
    public void changeVolumeUp() {
        Radio radio = new Radio();

        int expected = 5;
        int actual = radio.increaseVolume(4);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void changeVolumeDown() {
        Radio radio = new Radio();

        int expected = 5;
        int actual = radio.decreaseVolume(6);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void changeVolumeBelowMin() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.decreaseVolume(0);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void changeVolumeAboveMax() {
        Radio radio = new Radio();

        int expected = 10;
        int actual = radio.increaseVolume(10);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lastProgramme() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.switchProgrammeUp(9);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstProgramme() {
        Radio radio = new Radio();

        int expected = 9;
        int actual = radio.switchProgrammeDown(0);

        Assertions.assertEquals(expected, actual);
    }
}