import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthdate;

    public Person(String firstName, String lastName, LocalDate birthdate) {
        this.birthdate = birthdate;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
