public class Katze extends Tier {
    private String name;
    private String laut;

    public Katze(String name){
        this.name = name;
        this.laut = "*Miau*";
    }

    @Override
    public void gibLaut(){
        System.out.println(this.name+" die Katze macht: "+this.laut);
    }
}
