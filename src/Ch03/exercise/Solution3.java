package Ch03.exercise;

public class Solution3 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = pencils / students;
        System.out.println(pencilsPerStudent);

        int pencilLeft = pencils % students;
        System.out.println(pencilLeft);
    }
}
