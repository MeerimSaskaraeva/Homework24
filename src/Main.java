import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> number1=new HashSet<>();
        Set<String> number2=new HashSet<>();

        number1.add("Meerim");
        number1.add("Ulan");
        number1.add("Talant");
        number1.add("Asel");

        number2.add("Meerim");
        number2.add("Asil");
        number2.add("Talant");
        number2.add("Asel");

        System.out.println(symmetricDifference(number1, number2));
    }
    public static Set<String> symmetricDifference (Set<String> set1, Set<String> set2) {
        Set<String> newSet = new HashSet<>(set1);

        newSet.removeAll(set2);

        set2.removeAll(set1);

        newSet.addAll(set2);
        

        return newSet;
    }}