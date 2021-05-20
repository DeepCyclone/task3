package by.epam.jwd.task6.logic;

public class DateLogic
{
private final static int SECONDSINHOUR = 3600;
private final static int SECONDSINMINUTE = 60;
private final static int SECONDSINDAY = 86400;

public static int calculateCurrentHour(int currentSecond)
{
    return currentSecond / SECONDSINHOUR;
}
public static int calculateCurrentMinute(int currentSecond)
{
    return (currentSecond / SECONDSINMINUTE) % SECONDSINMINUTE;
}
public static void determineFullData(int second)
{
    second %= SECONDSINDAY;
    int currentHour = calculateCurrentHour(second);
    int currentMinute = calculateCurrentMinute(second);
    int currentSecond = second - (currentHour * SECONDSINHOUR + currentMinute * SECONDSINMINUTE);
    System.out.println("Second:" + second+
            "|Current hour:"+currentHour+
            "|Current minute:"+currentMinute+
            "|Current second:"+currentSecond);
}
}
