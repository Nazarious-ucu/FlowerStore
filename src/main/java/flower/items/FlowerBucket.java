package flower.items;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a flower bucket that contains multiple flower packs.
 */
public class FlowerBucket {

    private List<FlowerPack> flowerPacks = new ArrayList<>();

    /**
     * Adds a flower pack to the flower bucket.
     *
     * @param flowerPack The flower pack to add.
     */
    public void add(FlowerPack flowerPack) {
        this.flowerPacks.add(flowerPack);
    }

    /**
     * Calculates the total price of all flower packs in the bucket.
     *
     * @return The total price of the flower bucket.
     */
    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++) {
            price += flowerPacks.get(i).getPrice();
        }
        return price;
    }
}
