package utilities;

public class Person implements Comparable<Person>
{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }

    public static <T extends Comparable<T>> int countLessThanOrEqual(T[] tab, T element)
    {
        int count = 0;
        for(T item : tab)
        {
            if(item.compareTo(element) <= 0)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Person[] people = {
          new Person("Kamil", 20),
          new Person("Tosia", 18),
          new Person("Konrad", 15),
        };

        Person referencePerson = new Person("Ewa", 21);

        int count = countLessThanOrEqual(people, referencePerson);
        System.out.println(referencePerson.getAge() + "  " + count);
    }
}
