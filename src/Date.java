/**
 * This class prints " this "
 * @author--Zheng Wang
 */
public class Date {
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31,};


    public Date(int month, int day, int year) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month: " + month);
        }

        if (day < 1 || day > daysPerMonth[month] && !(month == 2 && day == 29)) {
            throw new IllegalArgumentException("Invalid day: " + day);
        }

        if(month == 2 && day == 29 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            throw new IllegalArgumentException("Invalid year: " + year);
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n",this);
    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
