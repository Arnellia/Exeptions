public class DataValidator {
    public static String ValidateDate { (String date)
        try {
        if (date.length() != 10 {
            String s = "Invalid format.";
            return s;
        }
        String yearStr = date.substring (0, 4);
        String monthStr = date.substring (5, 7);
        String dayStr = date.substring (8, 10);

        if (date.charAt(4) != '-' || date.charAt(7) != '-') {
            return "Invalid date format.";
        }

        int year = Integer.parseInt(yearStr);
        int month = Integer.parseInt(monthStr);
        int day = Integer.parseInt(dayStr);
    }
        if (year < 1 || year > 9999) {
            return "Year out of range.  0001 - 9999.";
        }

        if (month < 1 || month > 12) {
                return "Month out of range.  01 - 12.";
        }

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) { daysInMonth[1] = 29;
        }
        if (day < 1 || day > daysInMonth[month - 1]) {
            return "Day out of range.";
        }
        return date;
        }
        catch (NumberFormatException e) {
        return "Error parsing date components.";
    } catch (Exception e) {
        return "An error occurred while validating the date."; }




    private static void isLeapYear (int year){

        String date;
                if (args.length > 0) {
                    date = args[0];
                } else {
                    date = "2024-01-01";
                }
                    String result = DateValidator.validateDate(date);
                    System.out.println(result);
    }
}
