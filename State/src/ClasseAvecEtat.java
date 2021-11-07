public class ClasseAvecEtat {

    private Etat etat;

    public ClasseAvecEtat(){
        etat=new EtatA(this);
    }
    public void operationEtatA() { etat.operationEtatA();}
    public void operationEtatB() { etat.operationEtatB(); }
    public void operationEtatC() { etat.operationEtatC(); }
    public void doAction() { etat.doAction(); }
    public Etat getEtat() { return etat; }
    public void setEtat(Etat etat) { this.etat = etat; }
}
