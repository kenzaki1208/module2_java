package week6.inheritance.wednesday.nextdaycalculator;

public class NextDayCalculator {
    public static String findNextDay(int day, int month, int year) {
        int maxDay = 0;

        maxDay = getMaxDay(month, year, maxDay);

        Result result = getResult(day, month, year, maxDay);

        return result.day + "/" + result.month + "/" + result.year;
    }

    private static Result getResult(int day, int month, int year, int maxDay) {
        if (day < maxDay) {
            day++;
        } else {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        return new Result(day, month, year);
    }

    private static class Result {
        public final int day;
        public final int month;
        public final int year;

        public Result(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    private static int getMaxDay(int month, int year, int maxDay) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                maxDay = 31;
                break;
            case 4: case 6: case 9: case 11:
                maxDay = 30;
                break;
            case 2:
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            maxDay = 29;
                            break;
                        }
                    }
                } else {
                    maxDay = 28;
                    break;
                }
            default:
                break;
        }
        return maxDay;
    }
}
