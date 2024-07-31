/**
 * This class manipulates time in 24-h format
 * @author--Zheng Wang
 */
public class PlayWithTime {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second) {
        if (hour >= 24 || hour < 0 || minute >= 60 || minute < 0 || second >= 60 || second < 0) {
            throw new IllegalArgumentException("hour, minute, second was out of range");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",(hour == 0 || hour == 12)?12: hour % 12, minute, second, (hour < 12 ? "AM" : "PM"));
    }
}
