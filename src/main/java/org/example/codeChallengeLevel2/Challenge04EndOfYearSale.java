package org.example.codeChallengeLevel2;
import java.util.List;
import java.util.Optional;
import org.example.codeChallengeLevel2.Challenge04StoreItem;


public class Challenge04EndOfYearSale {
    public static void main(String[] args) {
        List<Challenge04StoreItem> items = List.of(
                new Challenge04StoreItem("T-Shirt", 19.99, .4),
                new Challenge04StoreItem("Dress", 34.99, .75),
                new Challenge04StoreItem("Record Player", 92.99, .75),
                new Challenge04StoreItem("Hat", 23.99, .1),
                new Challenge04StoreItem("Jeans", 54.99, .65));

        Optional<Challenge04StoreItem> leastExpensiveOpt = Challenge04StoreItem.findLeastExpensive(items);
        if (leastExpensiveOpt.isPresent()) {
            System.out.println("The least expensive item is " +
                    leastExpensiveOpt.get());
        }
    }
}
