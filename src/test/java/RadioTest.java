import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testStationAccept() {
        Radio radio = new Radio();
        radio.setStation(6);
        int expected = 6;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationLower() {
        Radio radio = new Radio();
        radio.setStation(-3);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationMore() {
        Radio radio = new Radio();
        radio.setStation(10);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeAccept() {
        Radio radio = new Radio();
        radio.setVolume(100);
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeLower() {
        Radio radio = new Radio();
        radio.setVolume(-2);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMore() {
        Radio radio = new Radio();
        radio.setVolume(105);
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationAcceptNext() {
        Radio radio = new Radio();
        radio.setStation(5);
        radio.next();
        int expected = 6;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationBorderNext() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationBorderPrev() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationAcceptPrev() {
        Radio radio = new Radio();
        radio.setStation(6);
        radio.prev();
        int expected = 5;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeUp() {
        Radio radio = new Radio();
        radio.setVolume(6);
        radio.VolumeUp();
        int expected = 7;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeDown() {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.VolumeDown();
        int expected = 49;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeUpBorder() {
        Radio radio = new Radio();
        radio.setVolume(101);
        radio.VolumeUp();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeDownBorder() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        radio.VolumeDown();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}

