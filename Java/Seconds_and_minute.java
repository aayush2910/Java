public class Seconds_and_minute {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));

    }
    public static String getDurationString(int sec){
        if (sec<0){
            return "Invalid data for ("+sec+") must be a positive integer.";
        }else {
            int min = sec / 60;
            return getDurationString(min , sec%60);
        }
    }
    public static String getDurationString(int min , int sec){
        if (min >=0 && (sec<=59 && sec>=0)) {
            int hrs = min / 60;
            int remaining_min = min % 60;
            int remaining_sec = sec % 60;

            return hrs + "h " + remaining_min + " m " + remaining_sec + "s";
        }else {
            return "Invalid min ("+min+") and sec ("+sec+")";
        }

    }
}
