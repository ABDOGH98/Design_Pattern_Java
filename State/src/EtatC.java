public class EtatC extends Etat {
    public EtatC(ClasseAvecEtat classeAvecEtat) {
        super(classeAvecEtat);
    }

    @Override
    public void operationEtatA() {
        System.out.println("Changement d'état de C vers A");
        classeAvecEtat.setEtat(new EtatA(classeAvecEtat));
    }

    @Override
    public void operationEtatB() {
        System.out.println("Changement d'état de C vers B");
        classeAvecEtat.setEtat(new EtatB(classeAvecEtat));
    }

    @Override
    public void operationEtatC() {
        System.out.println("Déjà dans l'état C");
    }

    @Override
    public void doAction() {
        System.out.println("Etat courant : C");
    }
}
