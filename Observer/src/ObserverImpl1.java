public class ObserverImpl1 implements Observer{
    @Override
    public void update(Subject subject) {
        int newState = ((SubjectImpl)subject).getEtat();
        System.out.println("observer 1 state was : "+newState);
    }
}
