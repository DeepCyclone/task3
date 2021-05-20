package by.epam.jwd.task2.logic;
enum MonthList
{
    NULL,
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December
}
public class DatesLogic {
    private final static int MONTHSINYEAR = 12;
    public static int determineNumberOfDaysInMonth(int year, int month)
    {
        month = CheckMonth(month);
        if(month == MonthList.January.ordinal() ||
                month == MonthList.March.ordinal() ||
                month == MonthList.May.ordinal() ||
                month == MonthList.July.ordinal() ||
                month == MonthList.August.ordinal() ||
                month == MonthList.October.ordinal() ||
                month == MonthList.December.ordinal())
        {
            return 31;
        }
        else if(month == MonthList.April.ordinal() ||
                month == MonthList.June.ordinal() ||
                month == MonthList.September.ordinal() ||
                month == MonthList.November.ordinal())
        {
            return 30;
        }
        else if(month == MonthList.February.ordinal()) {
            return isLeapYear(year)?29:28;
        }
        return month == 0 ? MONTHSINYEAR:0;
    }
    private static boolean isLeapYear(int year) {
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
        {
            return true;
        }
        return false;
    }
    private static int CheckMonth(int month) {
        return month % MONTHSINYEAR;
    }
}


