public class Main {
    public static void main(String[] args) {
        Person dani = new Person(23, "Daniel", "49494949F");
        dani.isLegal();
        Person bea = new Person(15, "Bea", "33223322F");
        bea.isLegal();

        System.out.println(dani.toString());
        System.out.println(bea.toString());


    }
}
