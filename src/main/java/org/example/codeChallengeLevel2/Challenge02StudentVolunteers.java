package org.example.codeChallengeLevel2;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Challenge02StudentVolunteers {
    public static List<String> findStudentsWithIncompleteVolunteerEvents(
            List<String> students,
            Map<String, List<String>> attendeesMapping) {

    // The method essentially finds students with incomplete volunteer events by
    // processing the list of students and the map of event attendees
    // using the Stream API and collecting the desired result in a new list.
        // Create a hashmap
            // This line uses the Stream API to convert the list of students into a new Map named studentEventCount,
            // where the keys are the student names, and the values are initialized to 0.
        Map<String, Integer> studentEventCount = students.stream().collect(Collectors.toMap(s -> s, n -> 0));
            //  iterates through the values of the attendeesMapping, which are lists of students who attended each event.
        attendeesMapping.values().forEach(list -> list.stream()
                .filter(student -> studentEventCount.containsKey(student))
                    // ^ the stream filters out students who are not present in the studentEventCount map (i.e., students who are
                    // not in the original list of students). This filtering is done to handle the case when
                    // there might be students in the event lists who are not part of the main list of students.
                .forEach(filteredStudent -> studentEventCount.put(filteredStudent, studentEventCount.get(filteredStudent) + 1)));
                    // ^ for each student who attended an event (i.e., present in both students list and event lists),
                    // their count in the studentEventCount map is incremented by 1.


        return studentEventCount.entrySet().stream()
                .filter(map -> map.getValue() < 2)
                    // ^ The stream then filters the entries of the studentEventCount map to keep only those students
                    // who attended fewer than two events (i.e., students with incomplete volunteer events).
                .map(studentsWithIncompleteVolunteerEventsMap -> studentsWithIncompleteVolunteerEventsMap
                .getKey())
                    // ^ the stream converts the filtered entries back to the original student names (the keys).
                .collect(Collectors.toList());
                    // ^ the filtered student names are collected into a List<String>,
                    // which is then returned as the result of the method.
    }

    public static void main(String[] args) {
        List<String> students = List.of("Sally", "Polly", "Molly",
                "Tony", "Harry");

        Map<String, List<String>> attendeesMapping = Map.of("Farmer's Market", List.of("Sally", "Polly"),
                "Car Wash Fundraiser", List.of("Molly", "Tony", "Polly"),
                "Cooking Workshop", List.of("Sally", "Molly", "Polly"),
                "Midnight Breakfast", List.of("Polly", "Molly"));

        System.out.println(findStudentsWithIncompleteVolunteerEvents(
                students, attendeesMapping));
    }
}
