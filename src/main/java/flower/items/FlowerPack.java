package flower.items;

import lombok.Getter;

/**
 * Represents a flower pack containing a
 *  specific type of flower and its quantity.
 **/
public class FlowerPack {
    private Flower flower;

    @Getter
    private int quantity;

    /**
     * Creates a new flower pack with the given flower and quantity.
     *
     * @param flower    The type of flower in the pack.
     * @param quantity  The quantity of flowers in the pack.
     */
    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    /**
     * Sets the quantity of flowers in the pack.
     *
     * @param quantity The new quantity of flowers (non-negative).
     */
    public void setQuantity(int newQuantity) {
        // this.quantity = quantity < 0 ? 0 : quantity;
        if (newQuantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = newQuantity;
        }
    }

    /**
     * Calculates the total price of the flower pack.
     *
     * @return The total price of the flower pack.
     */
    public double getPrice() {
        return quantity * flower.getPrice();
    }
}
