package Ch17.lecutre.p03intermediate;

import java.util.List;

public class C04MapToInt {
    public static void main(String[] args) {
        List<String> list = List.of("java", "css", "spring", "react", "bootstrap");

        list.stream()
                .mapToInt(e -> e.length())
                .forEach(System.out::println);
    }
}
