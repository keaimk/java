package Ch17.lecutre.p04terninal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C06GroupingBy {
    public static void main(String[] args) {
        // groupingBy : 분류

        List<Integer> list = List.of(3, 1, 4, 1, 5, 9, 2);

        Map<String, List<Integer>> map = list.stream()
                .collect(
                        Collectors.groupingBy(e -> e % 2 == 0 ? "짝" : "홀"));


        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}