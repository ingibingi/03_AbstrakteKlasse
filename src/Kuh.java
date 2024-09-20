public class Kuh extends Tier {
    private String name;
    private String laut;

    public Kuh(String name){
        this.name = name;
        this.laut = "*Muh*";
    }

    @Override
    public void gibLaut(){
        System.out.println(this.name+" die Kuh macht: "+this.laut);
    }
}
