package by.epamtc.voloshchik.task2.logic;

enum Months {
    January(1),
    February(2),
    March(3),
    April(4),
    May(5),
    June(6),
    July(7),
    August(8),
    September(9),
    October(10),
    November(11),
    December(12);

    Months(int sequentialNumber) {
        this.sequentialNumber = sequentialNumber;
    }

    private int sequentialNumber;

    public int getSequentialNumber() {
        return sequentialNumber;
    }
}
public class DatesLogic {
    private static final int TYPICAL_LEAP_YEAR_FREQUENCY = 4;
    private static final int ADDITIONAL_LEAP_YEAR_FREQUENCY = 400;
    private static final int WRONG_LEAP_YEAR_FREQUENCY = 100;
    public static int determineNumberOfDaysInMonth(int year, int month) {
        if(month == Months.January.getSequentialNumber() ||
                month == Months.March.getSequentialNumber() ||
                month == Months.May.getSequentialNumber() ||
                month == Months.July.getSequentialNumber() ||
                month == Months.August.getSequentialNumber() ||
                month == Months.October.getSequentialNumber() ||
                month == Months.December.getSequentialNumber()) {
            return 31;
        }
        else if(month == Months.April.getSequentialNumber() ||
                month == Months.June.getSequentialNumber() ||
                month == Months.September.getSequentialNumber() ||
                month == Months.November.getSequentialNumber()) {
            return 30;
        }
        else if(month == Months.February.getSequentialNumber()) {
            return isLeapYear(year)?29:28;
        }
        return 0;
    }
    private static boolean isLeapYear(int year) {
        if((year % TYPICAL_LEAP_YEAR_FREQUENCY == 0 && year % WRONG_LEAP_YEAR_FREQUENCY != 0) ||
                year % ADDITIONAL_LEAP_YEAR_FREQUENCY == 0)  {
            return true;
        }
        return false;
    }
}


