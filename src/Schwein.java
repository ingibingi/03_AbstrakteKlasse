public class Schwein extends Tier {
    private String name;
    private String laut;

    public Schwein(String name){
        this.name = name;
        this.laut = "*Oink*";
    }

    @Override
    public void gibLaut(){
        System.out.println(this.name+" das Schwein macht: "+this.laut);
    }
}
