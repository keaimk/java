package Ch15.lecture.p02collections;

import java.util.ArrayList;
import java.util.List;

public class C01Collections {
    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        list.add("java");
        list.add("css");
        list.add("spring");
        list.add("react");
        list.add("html");

        System.out.println(list);
    }
}
