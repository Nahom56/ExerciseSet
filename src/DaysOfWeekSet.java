import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DaysOfWeekSet {

    public static void main(String[] args) {
        // Create a HashSet with the days of the week
        Set<String> hashSetDaysNahom = new HashSet<>();
        hashSetDaysNahom.add("Monday");
        hashSetDaysNahom.add("Tuesday");
        hashSetDaysNahom.add("Wednesday");
        hashSetDaysNahom.add("Thursday");
        hashSetDaysNahom.add("Friday");
        hashSetDaysNahom.add("Saturday");
        hashSetDaysNahom.add("Sunday");

        // Print the content of the HashSet
        System.out.println("HashSet (unordered): " + hashSetDaysNahom);

        // Create a LinkedHashSet with the days of the week (preserves insertion order)
        Set<String> linkedHashSetDaysNahom = new LinkedHashSet<>();
        linkedHashSetDaysNahom.add("Monday");
        linkedHashSetDaysNahom.add("Tuesday");
        linkedHashSetDaysNahom.add("Wednesday");
        linkedHashSetDaysNahom.add("Thursday");
        linkedHashSetDaysNahom.add("Friday");
        linkedHashSetDaysNahom.add("Saturday");
        linkedHashSetDaysNahom.add("Sunday");

        // Print the content of the LinkedHashSet
        System.out.println("LinkedHashSet (ordered): " + linkedHashSetDaysNahom);

        // Check if the two sets are equal
        boolean isEqual = hashSetDaysNahom.equals(linkedHashSetDaysNahom);
        System.out.println("Are the two sets equal? " + isEqual);
    }
}