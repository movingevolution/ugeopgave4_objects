public class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

}
