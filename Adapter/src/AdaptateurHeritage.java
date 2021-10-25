public class AdaptateurHeritage extends ImplAdaptee implements Standard {
    @Override
    public void operation(int nb1, int nb2) {
        int nb = operation2(nb1,nb2);
        operation3(nb);
    }
}
