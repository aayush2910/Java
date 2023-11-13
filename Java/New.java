/*
public class New {

    public static void display_highscore_position(String player_name,int player_position){

        System.out.println((player_name)+" managed to get into position "+(player_position)+" on the high score list.");
    }

    public static int calculateHighScorePosition(int player_score){
        int result= player_score;

        if (result>=1000){
            return 1;
        } else if (result >=500) {
            return 2;
        } else if (result >=100) {
            return 3;
        }
        return 4;
    }

    public static void main(String[] args) {
        int player_position = calculateHighScorePosition(60);

        display_highscore_position("Tim",player_position);
    }
}*/


/*
public class New {
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }else{
            long rounded = Math.round(kilometersPerHour);
            return rounded;
        }
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = Math.round(toMilesPerHour(kilometersPerHour)/1.609);
        if (kilometersPerHour < 0.0 ){
            System.out.println("Invalid Value");
        } else if (kilometersPerHour == 0.0) {
            System.out.println("Invalid Value");
        }else {
            System.out.println(kilometersPerHour + "Km/h =" +milesPerHour +"mi/h" );
        }
    }
}*/
/*

   THIS IS THE CODE FOR SPEED CONVERTER!

public class New {

    public static void main(String[] args) {

        System.out.println(toMilesPerHour(5.0));
        printConversion(5.0);
}
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }else{
            long rounded = Math.round(kilometersPerHour);
            return rounded;
        }
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = Math.round(toMilesPerHour(kilometersPerHour)/1.609);
        if (kilometersPerHour < 0.0 ){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour+" mi/h" );
        }
    }
}*/
/*

   THIS IS THE CODE FOR CALCULATE LEAP YEAR!

public class New {

    public static void main(String[] args) {
        boolean is=isLeapYear(2004);
        System.out.println(is);
    }
    public static boolean isLeapYear(int year){
        if(year>=1 && year<=9999){
            if(year%4 ==0){
                if(year%100==0){
                    if(year%400==0){
                        return true;
                    }
                    // return true;
                }else{
                    return true; // step 4
                }
            }else{
                return false; //step 5
            }
        }
        return false;
    }

}*/

public class New {
//    public static void main(String[] args) {
//        boolean result = areEqualByThreeDecimalPlaces(3.174,3.175);
//        System.out.println(result);
//    }
//        public static boolean areEqualByThreeDecimalPlaces(double a, double b){
//
//        }
public static void main(String[] args) {
    int a =18;
    String age = a >= 18 ? "Dl can issue." : "Dl can not issue";

    System.out.println("The man's "+(age));

}


}
