package Last;

public class Person {
    private String name;
    private int age;
    private boolean activeUser;
    private double salary;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.salary = 1250.00;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActiveUser() {
        return activeUser;
    }

    public void setActiveUser(boolean activeUser) {
        this.activeUser = activeUser;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", activeUser=" + activeUser +
                ", salary=" + salary +
                '}';
    }
}
