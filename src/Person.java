public class Person {

    private String firstName;
    private String lastName;
    private double salary;
    public Person (String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public String info() {
        return String.format("%s %s (%.2f)", firstName, lastName, salary);
    }

}
