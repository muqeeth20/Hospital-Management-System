public class Utils {

    public static boolean isValidName(String name) {

        return name != null && !name.trim().isEmpty();
    }

    public static boolean isValidAge(int age) {

        return age > 0 && age <= 120;
    }

    public static boolean isValidPhone(String phone) {

        return phone.matches("\\d{10}");
    }

    public static boolean isValidDate(String date) {

        return date != null && !date.trim().isEmpty();
    }

    public static boolean isValidTime(String time) {

        return time != null && !time.trim().isEmpty();
    }
}