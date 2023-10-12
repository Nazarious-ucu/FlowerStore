package flower.items;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower extends Item{
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter @Setter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }

    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.flowerType = flower.flowerType;
        this.price = flower.price;
    }

    public Flower(double sepalLength, FlowerColor color, FlowerType flowerType, double price ) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.flowerType = flowerType;
        this.price = price;
    }

}
