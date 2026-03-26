import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Person> people = new ArrayList<>();
        people.add(new Person("Ts", "Gurt", LocalDate.of(1987, 3, 5)));
        people.add(new Person("Hawk", "Tuah", LocalDate.of(1999, 7, 15)));
        people.add(new Person("Paul", "Amedu", LocalDate.of(1983, 1, 7)));
        people.get(0).adopt(people.get(1));
        System.out.println(people.toString());

    }
}
