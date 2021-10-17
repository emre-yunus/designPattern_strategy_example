public class Bird {
    private static boolean laysEggs = true;
    private static boolean hasFeathers = true;
    public Fly fly;

    public Bird(Fly fly) {
        this.fly = fly;
    }

    public void birdExplanation() {
        System.out.println("All birds lay eggs and have feathers, but not all birds fly the same: " + fly.fly());
    }
}
