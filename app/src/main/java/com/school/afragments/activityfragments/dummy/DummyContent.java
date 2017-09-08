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

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
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
        public final String book_name;
        public final String link;
        public final String image;

        public DummyItem(String id, String book_name, String link,
                         String book_image) {
            this.id = id;
            this.book_name = book_name;
            this.link = link;
            this.image = book_image;
        }

        @Override
        public String toString() {
            return book_name;
        }
    }

    static {
        addItem(new DummyItem("1", "Judge", "https://www.amazon.com/Judge-Paul-Madriani-Novel/dp/0515119644", "https://images-na.ssl-images-amazon.com/images/I/514b69L1fEL._SX304_BO1,204,203,200_.jpg"));
        addItem(new DummyItem("2", "IT", "https://www.amazon.com/Novel-Stephen-King/dp/1501175467/ref=sr_1_1?s=books&ie=UTF8&qid=1504831532&sr=1-1&keywords=IT", "https://lareviewofbooks-org-cgwbfgl6lklqqj3f4t3.netdna-ssl.com/wp-content/uploads/2016/09/paavpdqsbtggtmn4smxs.png"));
        addItem(new DummyItem("3", "The Maze Runner", "https://www.amazon.com/Maze-Runner-Book-1/dp/0385737955/ref=sr_1_1?s=books&ie=UTF8&qid=1504831583&sr=1-1&keywords=maze+runner", "https://upload.wikimedia.org/wikipedia/en/d/db/The_Maze_Runner_cover.png"));
    }
}