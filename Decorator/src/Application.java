public class Application {
    public static void main(String[] args) {
        Boisson b = new Espresso();
        System.out.println("*********************");
        System.out.println(b.getDescription());
        System.out.println(b.price());
        System.out.println("*********************");
        b=new Chocollat(b);
        System.out.println(b.getDescription());
        System.out.println(b.price());
        System.out.println("*********************");
        b=new Caramel(b);
        System.out.println(b.getDescription());
        System.out.println(b.price());
        System.out.println("*********************");
        b=new Caramel(b);
        System.out.println(b.getDescription());
        System.out.println(b.price());
        System.out.println("*********************");

    }
}
