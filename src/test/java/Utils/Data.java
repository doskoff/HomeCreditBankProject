package Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Data {

    public static String getTodayDay() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        return Integer.toString(day);
    }

    public static String getTodayMonth() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("LLLL");
        String formattedMonth = currentDate.format(monthFormatter);
        formattedMonth = formattedMonth.substring(0, 1).toUpperCase() + formattedMonth.substring(1);

        return formattedMonth;
    }

    public static int getTodayYear() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        return year;
    }

}

