public class Servant {
    public String name;

    public Servant(String name){
        this.name = name;
    }
    public void feed(Royalty r){
        r.getFeed();
    }
    public void giveWine(Royalty r){
        r.getDrink();
    }
    public void giveMassage(Royalty r){
        r.getMassage();
    }
    public void giveHairCut(Royalty r){
        r.gethairCut();
    }

}
