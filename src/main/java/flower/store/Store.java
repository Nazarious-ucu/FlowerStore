package flower.store;

import flower.items.SearchFilter;
import flower.items.Item;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a store that manages items.
 */
public class Store {
    @Getter
    private List<Item> items;

    /**
     * Search for items in the store that match the given filter.
     *
     * @param searchFilter The filter used to search for items.
     * @return A list of items that match the filter.
     */
    public List<Item> search(SearchFilter searchFilter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item : items) {
            if (searchFilter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}
