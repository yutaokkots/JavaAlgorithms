package codeChallengeLevel2Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.example.codeChallengeLevel2.Challenge02StudentVolunteers;
import java.util.List;
import java.util.Map;

import org.junit.Test;
public class Challenge02StudentVolunteersTest {
    List<String> studentSet1 = List.of("Sally", "Polly", "Molly", "Tony", "Harry");
    List<String> studentSet2 = List.of("Sally", "Polly", "Molly", "Tony");
    List<String> studentSet3 = List.of("Molly", "Tony");

    // Map -> refers to hashmap/ dictionary
    // Map<String, List<string>> variableName <-- creating a hashmap where key is a String, value is list of Str.
    // = Map.of( "key 1", List.of("value 1", "value 2"), "key 2", List.of("value 3", "value 4", "value 5", "value 6"),
    //          "key 3", List.of("value 17, "value 8", "value 9"));

    Map<String, List<String>> attendeesMapping1 = Map.of("Farmer's Market", List.of("Sally", "Polly"),
            "Car Wash Fundraiser", List.of("Molly", "Tony", "Polly"),
            "Cooking Workshop", List.of("Sally", "Molly", "Polly"),
            "Midnight Breakfast", List.of("Polly", "Molly"));

    Map<String, List<String>> attendeesMapping2 = Map.of("Farmer's Market", List.of("Sally", "Polly"),
            "Car Wash Fundraiser", List.of("Molly", "Tony", "Polly"),
            "Midnight Breakfast", List.of("Polly", "Molly"));

    Map<String, List<String>> attendeesMapping3 = Map.of("Farmer's Market", List.of("Sally", "Polly"),
            "Midnight Breakfast", List.of("Polly", "Molly"));

    Map<String, List<String>> attendeesMapping4 = Map.of("Farmer's Market", List.of("Sally", "Polly"));

    @Test
    public void findStudentsWithIncompleteVolunteerEvents_set1() {

        List<String> tony = List.of("Tony");
        List<String> tonyHarry = List.of("Tony", "Harry");
        List<String> tonyHarrySally = List.of("Tony", "Harry", "Sally");

        assertEquals(List.of(), Challenge02StudentVolunteers.findStudentsWithIncompleteVolunteerEvents(List.of(), Map.of()));

        List<String> studentsWithIncomplete1 = Challenge02StudentVolunteers.findStudentsWithIncompleteVolunteerEvents(studentSet1,
                attendeesMapping1);
        assertEquals(tonyHarry.size(), studentsWithIncomplete1.size());
        assertTrue(studentsWithIncomplete1.containsAll(tonyHarry));

        List<String> studentsWithIncomplete2 = Challenge02StudentVolunteers.findStudentsWithIncompleteVolunteerEvents(studentSet2,
                attendeesMapping1);
        assertEquals(tony.size(), studentsWithIncomplete2.size());
        assertTrue(studentsWithIncomplete2.containsAll(tony));

        List<String> studentsWithIncomplete3 = Challenge02StudentVolunteers.findStudentsWithIncompleteVolunteerEvents(studentSet3,
                attendeesMapping1);
        assertEquals(tony.size(), studentsWithIncomplete3.size());
        assertTrue(studentsWithIncomplete3.containsAll(tony));

        List<String> studentsWithIncomplete4 = Challenge02StudentVolunteers.findStudentsWithIncompleteVolunteerEvents(studentSet1,
                attendeesMapping2);
        assertEquals(tonyHarrySally.size(), studentsWithIncomplete4.size());
        assertTrue(studentsWithIncomplete4.containsAll(tonyHarrySally));
    }

    @Test
    public void findStudentsWithIncompleteVolunteerEvents_set2() {

        List<String> tony = List.of("Tony");
        List<String> tonySally = List.of("Tony", "Sally");
        List<String> tonySallyMolly = List.of("Tony", "Molly", "Sally");
        List<String> tonyHarrySallyMolly = List.of("Tony", "Harry", "Sally", "Molly");

        List<String> studentsWithIncomplete5 = Challenge02StudentVolunteers.findStudentsWithIncompleteVolunteerEvents(studentSet2,
                attendeesMapping2);
        assertEquals(tonySally.size(), studentsWithIncomplete5.size());
        assertTrue(studentsWithIncomplete5.containsAll(tonySally));

        List<String> studentsWithIncomplete6 = Challenge02StudentVolunteers.findStudentsWithIncompleteVolunteerEvents(studentSet3,
                attendeesMapping2);
        assertEquals(tony.size(), studentsWithIncomplete6.size());
        assertTrue(studentsWithIncomplete6.containsAll(tony));

        List<String> studentsWithIncomplete7 = Challenge02StudentVolunteers.findStudentsWithIncompleteVolunteerEvents(studentSet1,
                attendeesMapping3);
        assertEquals(tonyHarrySallyMolly.size(), studentsWithIncomplete7.size());
        assertTrue(studentsWithIncomplete7.containsAll(tonyHarrySallyMolly));

        List<String> studentsWithIncomplete8 = Challenge02StudentVolunteers.findStudentsWithIncompleteVolunteerEvents(studentSet2,
                attendeesMapping3);
        assertEquals(tonySallyMolly.size(), studentsWithIncomplete8.size());
        assertTrue(studentsWithIncomplete8.containsAll(tonySallyMolly));
    }

    @Test
    public void findStudentsWithIncompleteVolunteerEvents_set3() {

        List<String> tonyMolly = List.of("Tony", "Molly");
        List<String> tonySallyMollyPolly = List.of("Tony", "Polly", "Sally", "Molly");
        List<String> allStudents = List.of("Tony", "Harry", "Sally", "Molly", "Polly");

        List<String> studentsWithIncomplete9 = Challenge02StudentVolunteers.findStudentsWithIncompleteVolunteerEvents(studentSet3,
                attendeesMapping3);
        assertEquals(tonyMolly.size(), studentsWithIncomplete9.size());
        assertTrue(studentsWithIncomplete9.containsAll(tonyMolly));

        List<String> studentsWithIncomplete10 = Challenge02StudentVolunteers.findStudentsWithIncompleteVolunteerEvents(studentSet1,
                attendeesMapping4);
        assertEquals(allStudents.size(), studentsWithIncomplete10.size());
        assertTrue(studentsWithIncomplete10.containsAll(allStudents));

        List<String> studentsWithIncomplete11 = Challenge02StudentVolunteers.findStudentsWithIncompleteVolunteerEvents(studentSet2,
                attendeesMapping4);
        assertEquals(tonySallyMollyPolly.size(), studentsWithIncomplete11.size());
        assertTrue(studentsWithIncomplete11.containsAll(tonySallyMollyPolly));

        List<String> studentsWithIncomplete12 = Challenge02StudentVolunteers.findStudentsWithIncompleteVolunteerEvents(studentSet3,
                attendeesMapping4);
        assertEquals(tonyMolly.size(), studentsWithIncomplete12.size());
        assertTrue(studentsWithIncomplete12.containsAll(tonyMolly));
    }
}
