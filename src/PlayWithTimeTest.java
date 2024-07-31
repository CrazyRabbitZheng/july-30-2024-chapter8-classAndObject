/**
 * This class creates objects of class PlayWithTime
 * @author--Zheng Wang
 */
public class PlayWithTimeTest {
    public static void main(String[] args) {
        PlayWithTime moment = new PlayWithTime();

        displayTime("Here is the moment", moment);
        System.out.println();

        moment.setTime(13,27,6);
        displayTime("Here is the moment now ", moment);
        System.out.println();

        moment.setTime(12,0,0);
        displayTime("This moment at noon ", moment);
        System.out.println();

        try {
            moment.setTime(99,-2,03);
        }
        catch (IllegalArgumentException e) {
            System.out.printf("Excption: %n%s%n", e.getMessage());
        }
    }

    private static void displayTime(String description, PlayWithTime time) {
        System.out.printf("%n%s%nUniversal Time:  %s%nStandard Time: %s%n", description, time.toUniversalString(), time.toString());
    }
}