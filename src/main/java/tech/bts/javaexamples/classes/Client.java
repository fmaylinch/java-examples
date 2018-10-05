package tech.bts.javaexamples.classes;

public class Client {

    // Fields
    private String name;
    private String email;
    private int age;
    private boolean married;
    private double height;

    // Constructor
    // Sometimes model classes don't need constructor

    // Methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
