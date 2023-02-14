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
        int totalDays = 20;
        double totalWin = 0, totalloss = 0;
        int endValue = 0;
        int win = 0, loss = 0;
        int maximum = 0, minimum = 0, playAgain = 0;
        int amount = STAKE_PER_DAY;
        while (playAgain == 0) {
            while (totalDays > endValue) {
                winLoose = gamble.winLoose();
                System.out.println("win or loose : " + winLoose);
                if (winLoose < 0.5) {
                    amount++;
                    win++;
                    totalWin += amount;
                    System.out.println("win");
                } else {
                    amount--;
                    loss++;
                    totalloss += amount;
                    System.out.println("loss");
                }
                totalDays--;
            }
            System.out.println("Amount = " + amount);
            System.out.println("Wins = " + win + "  Loss = " + loss);
            if (win > loss) {
                System.out.println("won by : " + (totalWin - totalloss));
            } else {
                System.out.println("Lost by : " + (totalloss - totalWin));
            }
            System.out.println("Maximum amount won: " + totalWin + " on day " + win);
            System.out.println("Minimum amount loss: " + totalloss + " on day " + loss);
            return;
        }
    }
}

