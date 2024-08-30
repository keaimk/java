package Ch08.exercise.p06;

import ch08.exercise.p06.Soundable;

public class Dog implements Soundable {
    @Override
    public String sound() {
        return "멍멍";
    }
}