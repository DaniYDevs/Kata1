public class Main {
    public static void main(String[] args) {
        Person dani = new Person(23, "Daniel", "49494949F");
        Person bea = new Person(15, "Bea", "22323233F");
        dani.isLegal();
        bea.isLegal();

        System.out.println(dani.toString());
        System.out.println(bea.toString());
    }
}
