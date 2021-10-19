public abstract class Component {
    protected String nom ;
    protected int level;

    public Component(String nom){
        this.nom = nom;
    }
    public abstract void operation();
}
