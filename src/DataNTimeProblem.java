import java.util.Scanner;
import java.util.Calendar;

public class DataNTimeProblem {
    //This method is in case of getting user input and then working on it but in our question
    //MM DD YEAR would be given but still we need to do the error checking before processing
    //in next funciton we will work on this
    //LEESON LEARNED: we should not use parameters as our local variables as it kills the
    //purpose of passing values to the function and work on those values thereon
    public static void findDay() {
        //get input from user
        Scanner userInput = new Scanner(System.in);
        int day = userInput.nextInt();//Next method stops if a space is insrted after entering string
         int month = userInput.nextInt();
         int year = userInput.nextInt();

         System.out.println("Output of MM DD YEAR :" + month + " " + day + " " + year);
    }
    //This function calculated day without considering real calender
    public static String returnDay(int month, int day, int year){
                String str = "";
               final int DAYS_IN_WEEK = 7;
        //Do error checking of passed values

        int totalDays = 0;
        if(month < 1 || month > 12) { return (str+"Month_Error");}
        if(day <=0 || day > 31) {
             return (str+"Day_Error");
            }else{
            if(month==1){
                totalDays += day;
            }else{
                totalDays = (month*31)+day;
            }
        }
        if(year < 2000 || year > 3000){return (str+"Year_Error");}

        if(totalDays%DAYS_IN_WEEK == 1){ return "WEDNESDAY";}
        if(totalDays%DAYS_IN_WEEK == 2){ return "THURSDAY";}
        if(totalDays%DAYS_IN_WEEK == 3){ return "FRIDAY";}
        if(totalDays%DAYS_IN_WEEK == 4){ return "SATURDAY";}
        if(totalDays%DAYS_IN_WEEK == 5){ return "SUNDAY";}
        if(totalDays%DAYS_IN_WEEK == 6){ return "MONDAY";}
        if(totalDays%DAYS_IN_WEEK == 7){ return "TUESDAY";}


     return "";

    }

    public static String findDay(int month, int day, int year){
/*
    Reuse Existing Instances: Factory methods can be used to return existing instances or cached objects. For example, the Singleton design pattern ensures that only one instance of a class exists and provides a factory method to access it.
java Singleton instance = Singleton.getInstance(); // Singleton pattern
 */
        Calendar newCal = Calendar.getInstance();
        //we are doing month -1 because in java calender months are zero based index meaning they start with 0 for januray
        //so if customer put 1 that would be consider as zero because month -1 if customer put 12 that would be 11 which is december
        newCal.set(year, month-1, day);//setting up in accordance with passed parameters
        int getDay = newCal.get(Calendar.DAY_OF_WEEK)-1;

        System.out.println(getDay);


       /*Calendar myCal = Calendar.getInstance(); //get instance of real calender
       myCal.set(year, month-1, day);
       int dayOfWeek = myCal.get(Calendar.DAY_OF_WEEK);
*/
       String[] days= {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };

       return days[getDay];

    }

public static void main(String[] args){
    //System.out.println("Enter DD MM YEAR");

    //findDay();
    //String returnedDay = findDay(8,05,2015);
    String returnedDay = findDay(2,13,2010);
     System.out.println(returnedDay);
   /* Calendar newCal = Calendar.getInstance();
   int year = 2015;
   int month = 12;
   int day = 13;

    newCal.set(year, month-1,day);

    // newCal.set(year, month-1,day);

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();

      System.out.println(newCal);*/


}


}

