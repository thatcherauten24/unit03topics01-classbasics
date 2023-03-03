public class TimeV1 {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeV1(int numHours, int numMinutes, int numSeconds) {
        hours = numHours;
        minutes = numMinutes;
        seconds = numSeconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public String toString() {
        String result = "";


        if (hours < 10) {
            result += "0";
        }
        result += hours;
        result += ":";

        if (minutes < 10) {
            result += "0";
        }
        result += minutes;
        result += ":";

        if (seconds < 10) {
            result += "0";
        }
        result += seconds;
        

        return result;
    }


    public static void main(String[] args) {
        
        TimeV1 t1 = new TimeV1(23, 17, 58);
        TimeV1 t2 = new TimeV1(2, 12, 37);
        TimeV1 t3 = new TimeV1(12, 43, 14);
        TimeV1[] allTimes = new TimeV1[] {t1, t2, t3};

        for (TimeV1 time : allTimes) {
            System.out.println(time);
        }

    }
}
