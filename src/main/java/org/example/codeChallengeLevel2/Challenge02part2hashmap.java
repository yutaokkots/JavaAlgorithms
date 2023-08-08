package org.example.codeChallengeLevel2;
import java.util.List;

public class Challenge02part2hashmap {
    List<Integer> list_1= List.of(5, 2, 3, 2, 1, 5, 9, 8);
    public int Challenge02part2hashmap(){
        int summation = 0;
        for (int i = 0; i < list_1.size() - 1; i++){
            summation += list_1.get(i);
        }

        System.out.println((summation));
        return summation;
    }
}


