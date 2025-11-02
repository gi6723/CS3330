public class CoinTossSimulator {
    public static void main(String[] args) {
        Coin coin = new Coin();

        // Display the initial side facing up
        System.out.println("The side initially facing up: " + coin.getSideUp());
        System.out.println("Now I will toss the coin 10 times.");

        //Counter vars for heads and tails
        int heads = 0;
        int tails = 0;

        // Toss the coin 10 times and count results
        for (int i = 0; i < 10; i++) {
            coin.toss();
            String side = coin.getSideUp();
            System.out.println("Toss:\t" + side);

            if ("heads".equals(side)) {
                heads++;
            } else {
                tails++;
            }
        }

        System.out.println("Total Heads: " + heads);
        System.out.println("Total Tails: " + tails);
    }
}
