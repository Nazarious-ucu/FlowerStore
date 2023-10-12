package flower.store;

import lombok.Getter;


public class FlowerPack {
    private Flower flower;

    @Getter
    private int quantity;


    public FlowerPack(Flower flower) {
    this.flower = new Flower(flower);
    this.quantity = 1;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity < 0 ? 0 : quantity;
    }

    public double getPrice() {
        double i =  quantity*flower.getPrice();
        return i;
    }
}
