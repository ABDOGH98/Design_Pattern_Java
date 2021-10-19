public class File extends Component{

    public File(String nom) {
        super(nom);
    }

    @Override
    public void operation() {
        String tab ="";
        for (int i=0 ; i<level;i++){
            tab+="\t";
        }
        System.out.println(tab+nom);
    }
}
