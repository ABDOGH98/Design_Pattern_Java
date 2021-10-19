public class Context {
    protected Strategy strategy;

    public void appliquerStrategy(){
        strategy.operaionStrategy();
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
