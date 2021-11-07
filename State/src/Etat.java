public abstract class Etat {
    protected ClasseAvecEtat classeAvecEtat;

    public Etat(ClasseAvecEtat classeAvecEtat) {
        this.classeAvecEtat = classeAvecEtat;
    }

    public abstract void operationEtatA();
    public abstract void operationEtatB();
    public abstract void operationEtatC();
    public abstract void doAction();
}
