package ro.sit.homework.homework02;

public class LeapYear {
    public static void main (String[] args) {
         int i = 0;
         int yearMin = 1900;
         int yearMax = 2016;
         String leapYear = "";
         int sumDays= 0;

         for(i=yearMin; i<=yearMax; i++){

             if((i%4 == 0 && i%100 != 0) || (i%100 == 0 && i%400 !=0)){
                 leapYear += i + " , ";
                 sumDays += 29;
             } else {
                 sumDays +=28;
             }
         }
        System.out.println("Leap years are: " + leapYear);
        System.out.println("The number of days in month February between 1900 and 2016 is: " + sumDays);
    }
}
