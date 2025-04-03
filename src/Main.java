/*
import java.util.function.Predicate;

class LambdaPredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(7)); // false
    }
}
*/

import java.util.*;

class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Nhu", "Linh", "Anh", "Minh");

        // Sử dụng Lambda để sắp xếp danh sách
        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println(names);
    }
}

