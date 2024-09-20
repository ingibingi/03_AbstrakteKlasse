public class Fisch extends Tier {
    private String name;
    private String laut;

    public Fisch(String name){
        this.name = name;
        this.laut = "*Blub*";
    }

    @Override
    public void gibLaut(){
        System.out.println(this.name+" der Fisch macht: "+this.laut);
    }
}
