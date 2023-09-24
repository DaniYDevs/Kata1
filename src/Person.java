public class Person {
    private int age;
    private String name;
    private String DNI;

    private boolean legal;

    public Person(int age, String name, String DNI) {
        this.age = age;
        this.name = name;
        this.DNI = DNI;
    }

    public String getDNI() {
        return DNI;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
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
                ", DNI='" + DNI + '\'' +
                ", legal=" + legal +
                '}';
    }
}
