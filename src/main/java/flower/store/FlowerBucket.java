package flower.store;

import java.util.ArrayList;
import java.util.List;

// @Getter @Setter
public class FlowerBucket {

    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack flowerPacks) {
        this.flowerPacks.add(flowerPacks);
    }

    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++){
            price += flowerPacks.get(i).getPrice();
        }
        return price;
    }

}
