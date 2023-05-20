import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();
    Radio radio1 = new Radio(30);

    @Test
    public void testStationAccept() {
        radio.setStation(9);
        Assertions.assertEquals(9, radio.getStation());
    }

    @Test
    public void testStation30Accept() {
        radio1.setStation(9);
        Assertions.assertEquals(9, radio1.getStation());
    }

    @Test
    public void testStationLower() {
        radio.setStation(-1);
        Assertions.assertEquals(0, radio.getStation());
    }

    @Test
    public void testStation30Lower() {
        radio1.setStation(-1);
        Assertions.assertEquals(0, radio1.getStation());
    }

    @Test
    public void testStationMore() {
        radio.setStation(10);
        Assertions.assertEquals(0, radio.getStation());
    }

    @Test
    public void testStation30More() {
        radio1.setStation(30);
        Assertions.assertEquals(0, radio1.getStation());
    }

    @Test
    public void testVolumeAccept() {
        radio.setVolume(100);
        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    public void testVolumeLower() {
        radio.setVolume(-2);
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void testVolumeMore() {
        radio.setVolume(105);
        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    public void testStationAcceptNext() {
        radio.setStation(5);
        radio.next();
        Assertions.assertEquals(6, radio.getStation());
    }

    @Test
    public void testStationBorderNext() {
        radio.setStation(9);
        radio.next();
        Assertions.assertEquals(0, radio.getStation());
    }

    @Test
    public void testStation30BorderNext() {
        radio1.setStation(29);
        radio1.next();
        Assertions.assertEquals(0, radio1.getStation());
    }

    @Test
    public void testStationBorderPrev() {
        radio.setStation(0);
        radio.prev();
        Assertions.assertEquals(9, radio.getStation());
    }

    @Test
    public void testStation30BorderPrev() {
        radio1.setStation(0);
        radio1.prev();
        Assertions.assertEquals(29, radio1.getStation());
    }

    @Test
    public void testStationAcceptPrev() {
        radio.setStation(6);
        radio.prev();
        Assertions.assertEquals(5, radio.getStation());
    }

    @Test
    public void testStation30AcceptPrev() {
        radio1.setStation(20);
        radio1.prev();
        Assertions.assertEquals(19, radio1.getStation());
    }

    @Test
    public void testVolumeUp() {
        radio.setVolume(70);
        radio.VolumeUp();
        Assertions.assertEquals(71, radio.getVolume());
    }

    @Test
    public void testVolumeDown() {
        radio.setVolume(50);
        radio.VolumeDown();
        Assertions.assertEquals(49, radio.getVolume());
    }

    @Test
    public void testVolumeUpBorder() {
        radio.setVolume(101);
        radio.VolumeUp();
        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    public void testVolumeDownBorder() {
        radio.setVolume(-1);
        radio.VolumeDown();
        Assertions.assertEquals(0, radio.getVolume());
    }

}

