package org.example.codeChallengeLevel1;
import java.util.Scanner;
public class Challenge04WaterBill {


    public static double calculateWaterBill(double gallonsUsage) {
        // TODO: minimum charge of $18.84 for 1,496 gal (2 CCFs)
        // 1 CCF = 748 gallons
        // if use more than 2 CCFs, charge $3.90 / CCF
        // no tax
        if (gallonsUsage < 1496){
            return 18.84;
        } else{
            double extraUsage = gallonsUsage - 1496;
            double ccfs = extraUsage / 748;
            return (Math.ceil(ccfs) * 3.90) + 18.84;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}


