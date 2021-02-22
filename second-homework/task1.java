class Person {
    private String firstname;
    private String surname;
    private int age;

    public Person() {
    }

    public Person(String firstname, String surname, int age) {
        this.firstname = firstname;
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstname(String name) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class task1 {
    public static void main(String[] args) {
        Person person = new Person("Vlad", "Shumskiy", 20);
    }
}
