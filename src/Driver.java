public class Driver {
    private static Servant Owen = new Servant("Owen");

    public static void main(String[] args){
        scenario(Owen);
    }

    public static void scenario(Servant servant){
        King k = new King();

        servant.feed(k);
        servant.giveWine(k);
        servant.giveMassage(k);
        servant.giveHairCut(k);
    }
}
