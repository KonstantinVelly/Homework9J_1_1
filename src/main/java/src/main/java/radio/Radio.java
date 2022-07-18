package src.main.java.radio;

public class Radio {
    private int currentProgramme;
    private int currentVolume;
    private int numberOfProgrammes;

    public Radio(int numberOfProgrammes) {
        this.numberOfProgrammes = numberOfProgrammes;
        currentProgramme = numberOfProgrammes;
    }

    public Radio() {
        numberOfProgrammes = 10;
    }

    public int getCurrentProgramme() {

        return currentProgramme;
    }

    public int increaseVolume(int currentVolume) {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
        return currentVolume;
    }

    public int decreaseVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
        return currentVolume;
    }

    public int switchProgrammeUp(int currentProgramme) {
        if (currentProgramme < numberOfProgrammes - 1) {
            currentProgramme = currentProgramme + 1;
        } else {
            currentProgramme = 0;
        }
        return currentProgramme;
    }

    public int switchProgrammeDown(int currentProgramme) {
        if (currentProgramme > 0) {
            currentProgramme = currentProgramme - 1;
        } else {
            currentProgramme = numberOfProgrammes - 1;
        }
        return currentProgramme;
    }

    public void setCurrentProgramme(int newCurrentProgramme) {
        if (newCurrentProgramme < 0) {
            return;
        }
        if (newCurrentProgramme > numberOfProgrammes) {
            return;
        }
        currentProgramme = newCurrentProgramme;
    }
}

