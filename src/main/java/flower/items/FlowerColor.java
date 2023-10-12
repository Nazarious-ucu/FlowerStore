package flower.items;

/**
 * Represents flower colors.
 */
public enum FlowerColor {
    /**
     * Red color.
     */
    RED("#FF0000"),

    /**
     * Blue color.
     */
    BLUE("#0000FF");

    private final String stringRepresentation;

    /**
     * Create a FlowerColor with a given string representation.
     *
     * @param stringRepresentation The string representation of the color.
     */
    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    /**
     * Get the string representation of the flower color.
     *
     * @return The string representation of the color.
     */
    @Override
    public String toString() {
        return stringRepresentation;
    }
}
