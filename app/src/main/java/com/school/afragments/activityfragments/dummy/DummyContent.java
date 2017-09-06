package com.school.afragments.activityfragments.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position), String.valueOf(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public String book_name;
        public String meaning;
        final String image;

        DummyItem(String id, String book_name, String meaning, String image) {
            this.id = id;
            this.book_name = book_name;
            this.meaning = meaning;
            this.image = image;

        }

        @Override
        public String toString() {
            return meaning;
        }
    }
    static {
        addItem(new DummyItem("1","Lord of the Files","A story of some guy","https://upload.wikimedia.org/wikipedia/en/9/9b/LordOfTheFliesBookCover.jpg"));
        addItem(new DummyItem("2","Lord of the Files","A story of some guy","https://upload.wikimedia.org/wikipedia/en/9/9b/LordOfTheFliesBookCover.jpg"));
        addItem(new DummyItem("3","Lord of the Files","A story of some guy","https://upload.wikimedia.org/wikipedia/en/9/9b/LordOfTheFliesBookCover.jpg"));
    }
}