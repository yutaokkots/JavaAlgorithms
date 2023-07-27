package org.example.codeChallengeLevel2;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Challenge01_100days {

    // Create function to calculate the date that's
    // 100 days from now

    public static void main(String[] args){
        // do not use 'new Calendar.getInstance()'
        // error you encountered is because Calendar is an abstract class,
        // and you cannot directly create an instance of it using the 'new' keyword.
        Calendar today = Calendar.getInstance();
        today.add(Calendar.DATE, 100);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("100 days from now is... " + sdf.format(today.getTime())
                /* add function call */);
    }



}
