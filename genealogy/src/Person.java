import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Person {
    private final String firstName;
    private final String lastName;
    private final LocalDate birthdate;

    private Set<Person> children = new HashSet<>();

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
                ", birthdate=" + birthdate + '\'' +
                ", children=" + children +
                '}';
    }

    public boolean adopt(Person child){
        if (child==this) return false;
        return children.add(child);
    }



}


