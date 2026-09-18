// Journey Forrest, CS 3354, Fall 2026 
public class Person {
    private String name;
    private int age;

    /**
     * Constructs a Person with provided name and age.
     * 
     * @param name the person's name
     * @param age  the person's age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /** 
     * @return String
     */
    @Override 
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }

    /** 
     * @param args
     */
    public static void main(String[] args) {
        Person person = new Person("Carl", 35);
        Person person2 = new Person("Journey", 21);
        System.out.println(person);
        System.out.println(person2);
    }
}
