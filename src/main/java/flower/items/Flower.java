package flower.items;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a flower item.
 */
@Setter
public class Flower extends Item {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter @Setter
    private double price;
    @Getter
    private FlowerType flowerType;





    /**
     * Get the color of the flower.
     * @return The color of the flower as a string.
     */
    public String getColor() {
        return color.toString();
    }

      /**
     * Creates a new Flower object with the specified attributes.
     *
     * @param newSepalLength The sepal length of the flower.
     * @param NewColor The color of the flower.
     * @param newFlowerType The type of the flower.
     * @param newPrice The price of the flower.
     */
    public Flower(double newSepalLength, FlowerColor NewColor,
                     FlowerType newFlowerType, double newPrice) {
        this.sepalLength = newSepalLength;
        this.color = NewColor;
        this.price = newPrice;
        this.flowerType = newFlowerType;
    }

    /**
     * Creates a new Flower object based on an existing flower.
     *
     * @param flower The flower to copy.
     */
    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.price = flower.price;
        this.flowerType = flower.flowerType;
    }

}
