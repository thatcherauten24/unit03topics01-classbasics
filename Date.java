public class Date {
    private int month;
    private int day;
    private int year;
    
    public Date(int theMonth, int theDay, int theYear){
        month = theMonth;
        day = theDay;
        year = theYear;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        String result = "";

        if (month < 10) {
            result += "0";
        }
        result += month;
        result += "/";

        if (day < 10) {
            result += "0";
        }
        result += day;
        result += "/";

        if (year < 1000) {
            result += "0";
            if (year < 100) {
                result += "0";
                if (year < 10) {
                    result += "0";
                }
            }
        }
        result += year;

        return result;
    }
    public static void main(String[] args) {
        Date d1 = new Date(1, 23, 2006);
        Date d2 = new Date(8, 2, 2006);
        Date d3 = new Date(1, 4, 2048);
        Date[] allDates = new Date[] {d1, d2, d3};

        for (Date date : allDates) {
            System.out.println(date);
        }

        Date[] appts = new Date[] {
            new Date(3, 21, 2023),
            new Date(4, 1, 2023),
            new Date(3, 3, 2023),
            new Date(3, 1, 2023),
            new Date(5, 21, 2023)
        };


        // display only march appointments:
        for (Date appt : appts) {
            if (appt.getMonth() == 3) {
                System.out.println(appt);
            }
        }
    }
}