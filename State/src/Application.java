public class Application {
    public static void main(String[] args) {
        ClasseAvecEtat obj=new ClasseAvecEtat();
        obj.doAction();
        System.out.println("-------------");

        obj.operationEtatA(); obj.doAction();System.out.println("-------------");

        obj.operationEtatC(); obj.doAction();System.out.println("-------------");

        obj.operationEtatB(); obj.doAction();System.out.println("-------------");

        obj.operationEtatC(); obj.doAction();System.out.println("-------------");

        obj.operationEtatB(); obj.doAction();System.out.println("-------------");
    }
}
