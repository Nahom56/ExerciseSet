import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DaysOfWeekSet {

    public static void main(String[] args) {
        // Create a HashSet with the days of the week
        Set<String> hashSetDays = new HashSet<>();
        hashSetDays.add("Monday");
        hashSetDays.add("Tuesday");
        hashSetDays.add("Wednesday");
        hashSetDays.add("Thursday");
        hashSetDays.add("Friday");
        hashSetDays.add("Saturday");
        hashSetDays.add("Sunday");

        // Print the content of the HashSet
        System.out.println("HashSet (unordered): " + hashSetDays);

        // Create a LinkedHashSet with the days of the week (preserves insertion order)
        Set<String> linkedHashSetDays = new LinkedHashSet<>();
        linkedHashSetDays.add("Monday");
        linkedHashSetDays.add("Tuesday");
        linkedHashSetDays.add("Wednesday");
        linkedHashSetDays.add("Thursday");
        linkedHashSetDays.add("Friday");
        linkedHashSetDays.add("Saturday");
        linkedHashSetDays.add("Sunday");

        // Print the content of the LinkedHashSet
        System.out.println("LinkedHashSet (ordered): " + linkedHashSetDays);

        // Check if the two sets are equal
        boolean isEqual = hashSetDays.equals(linkedHashSetDays);
        System.out.println("Are the two sets equal? " + isEqual);
    }
}