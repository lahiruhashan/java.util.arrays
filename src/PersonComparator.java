import java.util.Comparator;

public class PersonComparator implements Comparator<Main.Person> {
    @Override
    public int compare(Main.Person o1, Main.Person o2) {
        return o1.getId() - o2.getId();
    }
}
