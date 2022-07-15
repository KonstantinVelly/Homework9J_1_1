package src.main.java.radio;

public class Radio {
    private int currentProgramme;
    private int currentVolume;

    //public int getCurrentVolume() {
      //  return currentVolume;
    //}

    public int getCurrentProgramme() {
        return currentProgramme;
    }

    public int increaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        else {
            currentVolume = 10;
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
        if (currentProgramme < 9) {
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
            currentProgramme = 9;
        }
        return currentProgramme;
    }
    public void setCurrentProgramme(int newCurrentProgramme) {
        if (newCurrentProgramme < 0) {
            return;
        }
        if (newCurrentProgramme > 9) {
            return;
        }
        currentProgramme = newCurrentProgramme;
    }
}

