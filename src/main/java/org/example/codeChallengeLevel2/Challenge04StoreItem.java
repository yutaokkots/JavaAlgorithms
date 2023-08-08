package org.example.codeChallengeLevel2;
import java.util.Collection;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor

public class Challenge04StoreItem {
    String name;
    double retailPrice;
    double discount;

    public static Optional<Challenge04StoreItem> findLeastExpensive(Collection<Challenge04StoreItem> items) {
        // TODO: Implement
        return Optional.empty();
    }

    @Override
    public String toString() {
        return "Name: " + name + ", " + "Retail price: " + retailPrice + ", " + "Discount " + discount;
    }
}

