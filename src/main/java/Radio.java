public class Radio {
    public int allStations = 10;
    public int firstStations = 0;
    public int lastStations = 9;
    private int station;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume;

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
        return station;
    }

    public void setStation(int station) {
        if (station < firstStations) {
            return;
        }
        if (station > lastStations) {
            return;
        }
        this.station = station;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume) {
            volume = minVolume;
        }
        ;
        if (volume > maxVolume) {
            volume = maxVolume;
        }

        this.volume = volume;

    }

    public void next() {
        if (station != lastStations) {
            station++;
            return;
        } else {
            station = firstStations;
        }
    }

    public void prev() {
        if (station != firstStations) {
            station--;
            return;
        } else {
            station = lastStations;
        }
    }

    public void volumeUp() {
        if (volume < maxVolume) {
            volume++;
            return;
        } else {
            volume = maxVolume;
        }

    }

    public void volumeDown() {
        if (volume != minVolume) {
            volume--;
            return;
        } else {
            volume = minVolume;
        }
    }
}
