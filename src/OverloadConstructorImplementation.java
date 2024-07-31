/**
 * This class overloads constructors
 * 复习一遍overload ---- 多个method share同一个name， but 有不同的signature.
 * Line 13 is very interesting
 * @author--Zheng Wang
 */
public class OverloadConstructorImplementation {
    private int hour;
    private int minute;
    private int second;

    public OverloadConstructorImplementation() {
        //;//this(0, 0, 0);//initialize each instance variable to 0.
    }

    public OverloadConstructorImplementation(int hour) {
        this(hour, 0, 0);
    }

    public OverloadConstructorImplementation(int hour, int minute) {
        this(hour, minute, 0);
    }

    public OverloadConstructorImplementation(int hour, int minute, int second) {
        if(hour < 0 || hour >= 24){
            throw new IllegalArgumentException("Hour must be between 0 to 23");
        }
        if(minute < 0 || minute >= 60){
            throw new IllegalArgumentException("Minute must be between 0 to 59");
        }
        if(second < 0 || second >= 60){
            throw new IllegalArgumentException("Second must be between 0 to 59");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public OverloadConstructorImplementation(OverloadConstructorImplementation time) {
        this(time.hour, time.minute, time.second);
    }

    public void setTime(int hour, int minute, int second) {
        if(hour < 0 || hour >= 24){
            throw new IllegalArgumentException("Hour must be between 0 to 23");
        }
        if(minute < 0 || minute >= 60){
            throw new IllegalArgumentException("Minute must be between 0 to 59");
        }
        if(second < 0 || second >= 60){
            throw new IllegalArgumentException("Second must be between 0 to 59");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour >= 24){
            throw new IllegalArgumentException("Hour must be between 0 to 23");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute >= 60){
            throw new IllegalArgumentException("Minute must be between 0 to 59");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if(second < 0 || second >= 60){
            throw new IllegalArgumentException("Second must be between 0 to 59");
        }
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour,minute,second);
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s", (hour == 0 || hour == 12)?12:hour % 12,minute,second, hour<12 ? "AM" : "PM");
    }
}
