public class TimeV2 {
    private int timeInSeconds;

    public TimeV2(int numHours, int numMinutes, int numSeconds) {
        timeInSeconds += 3600 * numHours;
        timeInSeconds += 60 * numMinutes;
        timeInSeconds += numSeconds;
    }

    public int getHours() {
        int result = timeInSeconds / 3600;
        return result;
    }

    public int getMinutes() {
        int result = (timeInSeconds % 3600) / 60;
        return result;
    }

    public int getSeconds() {
        int result = (timeInSeconds % 360) % 60;
        return result;
    }

    public String toString() {
        String result = "";


        if (getHours() < 10) {
            result += "0";
        }
        result += getHours();
        result += ":";

        if (getMinutes() < 10) {
            result += "0";
        }
        result += getMinutes();
        result += ":";

        if (getSeconds() < 10) {
            result += "0";
        }
        result += getSeconds();
        

        return result;
    }


    public static void main(String[] args) {
        TimeV2 t1 = new TimeV2(23, 17, 58);
        TimeV2 t2 = new TimeV2(2, 12, 37);
        TimeV2 t3 = new TimeV2(12, 43, 14);
        TimeV2[] allTimes = new TimeV2[] {t1, t2, t3};

        for (TimeV2 time : allTimes) {
            System.out.println(time);
        }

    }
}
// nicely done