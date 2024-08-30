package Ch08.exercise.p07;

public class OracleDao implements Ch08.exercise.p07.DataAccessObject {
    @Override
    public void select() {
        System.out.println("select from oracle");
    }

    @Override
    public void insert() {
        System.out.println("insert to oracle");

    }

    @Override
    public void update() {
        System.out.println("update to oracle");

    }

    @Override
    public void delete() {
        System.out.println("delete from oracle");
    }
}