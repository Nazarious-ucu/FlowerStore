package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import flower.items.Flower;
import flower.items.FlowerBucket;
import flower.items.FlowerColor;
import flower.items.FlowerPack;
import flower.items.FlowerType;

import org.junit.jupiter.api.Assertions;

import java.util.Random;

/**
 * Unit tests for the FlowerBucket class.
 */
public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Flower(RANDOM_GENERATOR.nextDouble(),
                        FlowerColor.RED, FlowerType.ROSE, price);
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());
    }
}
