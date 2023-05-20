public class Radio {
    public int allStations = 10;
    public int firstStations = 0;
    public int lastStations = 9;
    private int Station;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int Volume;

    public Radio() {

    }

    public Radio(int allStations) {
        this.allStations = allStations;
        this.lastStations = allStations - 1;
    }

    public int getFirstStations() {
        return firstStations;
    }

    public int getLastStations() {
        return lastStations;
    }

    public int getStation() {
        return Station;
    }

    public void setStation(int station) {
        if (station < firstStations) {
            return;
        }
        if (station > lastStations) {
            return;
        }
        this.Station = station;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume) {
            volume = minVolume;
        }
        ;
        if (volume > maxVolume) {
            volume = maxVolume;
        }

        this.Volume = volume;

    }

    public void next() {
        if (Station != lastStations) {
            Station++;
            return;
        } else {
            Station = firstStations;
        }
    }

    public void prev() {
        if (Station != firstStations) {
            Station--;
            return;
        } else {
            Station = lastStations;
        }
    }

    public void VolumeUp() {
        if (Volume < maxVolume) {
            Volume++;
            return;
        } else {
            Volume = maxVolume;
        }

    }

    public void VolumeDown() {
        if (Volume != minVolume) {
            Volume--;
            return;
        } else {
            Volume = minVolume;
        }
    }
}
