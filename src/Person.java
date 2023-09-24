public class Person {
    private int age;
    private String name;
    private String dni;
    private boolean legal;

    public Person(int age, String name, String dni) {
        this.age = age;
        this.name = name;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDni() {
        return dni;
    }

    public boolean isLegal() {
        if(this.age>18){
            legal=true;
        }
        return legal;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", legal=" + legal +
                '}';
    }
}
