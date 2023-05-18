public class Radio {
    private int Station;
    private int Volume;

    public int getStation() {
        return Station;
    }

    public void setStation(int station) {
        if (station < 0) {
            return;
        }
        if (station > 9) {
            return;
        }
        this.Station = station;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            volume = 0;
        }
        ;
        if (volume > 100) {
            volume = 100;
        }

        this.Volume = volume;

    }

    public void next() {
        if (Station != 9) {
            Station++;
            return;
        } else {
            Station = 0;
        }
    }

    public void prev() {
        if (Station != 0) {
            Station--;
            return;
        } else {
            Station = 9;
        }
    }

    public void VolumeUp() {
        if (Volume < 100) {
            Volume++;
            return;
        } else {
            Volume = 100;
        }

    }

    public void VolumeDown() {
        if (Volume != 0) {
            Volume--;
            return;
        } else {
            Volume = 0;
        }
    }
}
