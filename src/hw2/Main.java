package hw2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Anton";
        Market market = new Market();
        market.acceptToMarket(human);
        market.takeQueue(human);
        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue(human);
        market.releaseFromMarket(human);

    }
}
