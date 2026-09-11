import java.util.Comparator;
import java.util.Map;

public class HigestStudents {




    Map<String, Map<String, Integer>> students = Map.of(
            "Alice", Map.of(
                    "Math", 85,
                    "Science", 90,
                    "English", 80
            ),

            "Bob", Map.of(
                    "Math", 95,
                    "Science", 88,
                    "English", 92
            ),

            "Charlie", Map.of(
                    "Math", 78,
                    "Science", 85,
                    "English", 80
            )
    );


    Map.Entry<String,Map<String,Integer>> result = students.entrySet().stream()
            .max(Comparator.comparingInt(
                    entry -> entry
                            .getValue()
                            .values()
                            .stream()
                            .mapToInt(Integer::intValue)
                            .sum()
            )).orElse(null);

}
