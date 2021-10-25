public class Application {
    public static void main(String[] args) {
        Standard standard=new ImplStandard();
        standard.operation(7, 9);
        ImplAdaptee implAdaptee = new AdaptateurHeritage();
        ((AdaptateurHeritage)implAdaptee).operation(3,3);
        Standard adaptee1=new AdaptateurHeritage();
        adaptee1.operation(7, 9);
    }
}
