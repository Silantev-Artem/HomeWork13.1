package org.skypro.skyshop.search;

public class SearchEngine {

    private Searchable[] items;
    private int count;

    public SearchEngine(int size) {
        items = new Searchable[size];
        count = 0;
    }

    public void add(Searchable item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        }else{
            System.out.println("Достаточно пяти первых элементов");
        }
    }


    public Searchable[] search(String searchTerm) {
        Searchable[] results = new Searchable[5];
        int foundCount = 0;

        for (int i = 0; i < count; i++) {
            if (items[i].getSearchTerm().contains(searchTerm)) {
                results[foundCount] = items[i];
                foundCount++;
                if (foundCount == 5) break;
            }
        }
        return results;
    }
}

