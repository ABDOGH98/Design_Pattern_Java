import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{
    private List<Component> components = new ArrayList<>();
    public Folder(String nom) {
        super(nom);
    }

    @Override
    public void operation() {
        String tab="";
        for(int i=0 ; i<this.level ; i++ ){
            tab+="\t";
        }
        System.out.println(tab+nom);
        for(Component component:components)
            component.operation();
    }
    public void add(Component component){
        component.level = this.level+1;
        components.add(component);
    }
    public void remove(Component component){
        components.remove(component);
    }
    public List<Component> getChilds(){
        return components ;
    }
}
