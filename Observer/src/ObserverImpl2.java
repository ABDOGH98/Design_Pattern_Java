public class ObserverImpl2 implements Observer{
    @Override
    public void update(Subject subject) {
        int newState = ((SubjectImpl)subject).getEtat();
        System.out.println("observer 2 state was : "+newState);
    }
}
