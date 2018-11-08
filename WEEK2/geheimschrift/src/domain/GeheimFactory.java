package domain;

public class GeheimFactory {

    public GeheimFactory(){
    }

    public CodeerGedrag create(String s){
        Class<?> theClass = null;
        Object Objee = null;
        try {
            theClass = Class.forName("domain."+s);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Objee = theClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (CodeerGedrag)Objee;
    }
}