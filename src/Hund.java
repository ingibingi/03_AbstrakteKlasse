public class Hund extends Tier {
    private String name;
    private String laut;

    public Hund(String name){
        this.name = name;
        this.laut = "*Wau*";
    }

    @Override
    public void gibLaut(){
        System.out.println(this.name+" der Hund macht: "+this.laut);
    }
}
