package Ch08.exercise.p07;

public class MySqlDao implements Ch08.exercise.p07.DataAccessObject {
    @Override
    public void select() {
        System.out.println("select from mysql");
    }

    @Override
    public void insert() {
        System.out.println("insert to mysql");

    }

    @Override
    public void update() {
        System.out.println("update to mysql");

    }

    @Override
    public void delete() {
        System.out.println("delete from mysql");
    }
}