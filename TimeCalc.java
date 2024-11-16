public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        int hours = Integer.parseInt("" + time.charAt(0)) * 10
            + Integer.parseInt("" + time.charAt(1));
        int minutes = Integer.parseInt("" + time.charAt(3)) * 10
        + Integer.parseInt("" + time.charAt(4));

        int totalMinutes = minutesToAdd % 60 + minutes;
        
        if (totalMinutes >= 60) {
            hours++;
            totalMinutes = totalMinutes - 60;
        }

        int totalHours = (minutesToAdd / 60 + hours) % 24;
        
        String newHours, newMinutes;
        if (totalHours < 10) {
            newHours = "0" + totalHours;
        }
        else {
            newHours = "" + totalHours;
        }
        
        if (totalMinutes < 10) {
            newMinutes = "0" + totalMinutes;
        }
        else {
            newMinutes = "" + totalMinutes;
        }
        

        System.out.println(newHours + ":" + newMinutes);
    }
}
