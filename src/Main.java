public class Main {
    public static void main(String[] args) {
        FlyLong flyLong = new FlyLong();
        FlyShort flyShort = new FlyShort();
        FlyNone flyNone = new FlyNone();

        Dove d = new Dove(flyLong);
        Chicken c = new Chicken(flyShort);
        Penguin p = new Penguin(flyNone);
        Ostrich o = new Ostrich(flyNone);

        d.birdExplanation();
        c.birdExplanation();
        p.birdExplanation();
        o.birdExplanation();
    }
}
