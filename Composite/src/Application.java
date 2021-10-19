public class Application {
    public static void main(String[] args) {
        Folder racine=new Folder("Composite 1");
        Folder composite2=new Folder("Composite 2");
        racine.add(composite2);
        racine.add(new File("Elément 11"));

        racine.add(new File("Elément 12"));

        racine.add(new File("Elément 13"));

        composite2.add(new File("Elément 21"));

        composite2.add(new File("Elément 22"));

        racine.operation();
    }
}
