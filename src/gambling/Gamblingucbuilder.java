package gambling;
public class Gamblingucbuilder {
    public static int STAKE_PER_DAY = 100;
    public static int BET_PER_GAME = 1;
    public double winLoose() {
        return Math.random();
    }
    public static void main(String[] args) {
        Gamblingucbuilder gamble = new Gamblingucbuilder();
        double winLoose;
        int totalDays = 30;
        int endValue=0;
        int win=0,loss=0;
        int amount = STAKE_PER_DAY;
        while (totalDays>endValue) {
            winLoose = gamble.winLoose();
            System.out.println("win or loose : " + winLoose);
            if (winLoose < 0.5) {
                amount++;

            } else {
                amount--;

            }
            totalDays--;
        }System.out.println("Amount = " + amount);
    }
}

