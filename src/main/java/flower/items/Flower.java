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
     * Creates a new Flower object based on an existing flower.
     *
     * @param flower The flower to copy.
     */
    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.flowerType = flower.flowerType;
        this.price = flower.price;
    }

    /**
     * Creates a new Flower object with the specified attributes.
     *
     * @param sepalLength The sepal length of the flower.
     * @param color The color of the flower.
     * @param flowerType The type of the flower.
     * @param price The price of the flower.
     */
    public Flower(double sepalLength, FlowerColor color, FlowerType flowerType, double price) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.flowerType = flowerType;
        this.price = price;
    }
}
