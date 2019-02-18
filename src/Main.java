import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class Main {

    public static class Person implements Comparable<Person>{
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Person person) {
            return Integer.compare(this.id, person.id);
        }
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("lahiru", "hashan");
        String [] namesArr = {"hashan", "lahiru"};

        Person person1 = new Person();
        person1.setId(1);
        person1.setName("person1");
        Person person2 = new Person();
        person2.setId(2);
        person2.setName("person2");
        Person person3 = new Person();
        person3.setId(3);
        person3.setName("person3");
        Person person4 = new Person();
        person4.setId(4);
        person4.setName("person4");
        // initialize an array with the created person objects
        Person [] persons = {person1, person3, person2, person4};

        Arrays.sort(persons);
        System.out.println("Index of 'person2' object : " + Arrays.binarySearch(persons, person4, new PersonComparator()));
        System.out.println("Index of 'person2' object : " + Arrays.binarySearch(persons, person3));


        System.out.println(Arrays.binarySearch(namesArr, "lahiru"));
        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        int intKey = 22;
        System.out.println(intKey
                + " found at index = "
                + Arrays
                .binarySearch(namesArr, 0, 1, "lahiru"));
        print(Arrays.asList(persons));
        print(Arrays.asList(persons));
        Arrays.sort(persons, new PersonComparator());
        print(Arrays.asList(persons));

        String [] a = {"a", "b", "c"};
        String [] b = {"a", "b", "c"};
        String [] c = {"a", "b", "d"};
        System.out.println("Is 'a' == 'b' = " + Arrays.equals(a, b));
        System.out.println("Is 'b' == 'c' = " + Arrays.equals(b, c));

        int[] l = {1, 2};
        int[] m = {3, 4};
        int[] n = {1, 2};
        int[][] x = {l, m};
        int[][] y = {n, m};
        int[][] z = {m, n};
        System.out.println("Is 'x' == 'y' = " + Arrays.deepEquals(x, y));
        System.out.println("Is 'y' == 'z' = " + Arrays.deepEquals(y, z));

        int [] i1 = {1,2,3};
        int [] i2 = {4,5,6};

        int [][] ii = {i1, i2};

        int [] intArray = {3, 5, 7, 9, 11};
        String[] stringArray = {"a", "b", "c", "d", "e"};
        Arrays.fill(intArray, 1,3,4);
        Arrays.fill(stringArray, 1,3,"O");
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(stringArray));


        System.out.println(Arrays.deepToString(ii));
        System.out.println(Arrays.toString(Arrays.copyOf(i2, 5)));
        System.out.println(Arrays.hashCode(i1));

        Spliterator<Integer> spiterator = Arrays.spliterator(i1);
        while (spiterator.tryAdvance(System.out::println));


        IntBinaryOperator intBinaryOperator = (x1, x2) -> x1 + x2;
        int ee = intBinaryOperator.applyAsInt(34, 16);
        System.out.println(ee);
        Arrays.parallelPrefix(i1, intBinaryOperator);
        System.out.println(Arrays.toString(i1));

        int [] intUni = {10,20,30,40,50,60,70,80,90,100};
        IntUnaryOperator intUnaryOperator = (uni) -> uni * uni;
        Arrays.parallelSetAll(intUni, intUnaryOperator);
        System.out.println(Arrays.toString(intUni));

        System.out.println(Arrays.stream(intUni).average());

        Integer[] customArray1 = {1, 2, 3, 4, 5};
        List<Integer> lists = Arrays.asList(customArray1);
        System.out.println("List : " + lists);
        System.out.println("Class : " + lists.getClass());

    }

//  function to print an array of person objects
    public static void print(List<Person> personList) {
        for (Person person: personList) {
            System.out.println(person.id + " - " + person.name);
        }
    }

}
