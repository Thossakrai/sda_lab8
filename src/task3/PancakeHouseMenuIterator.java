package task3;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList menuItems;
    int position = 0;
    PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public MenuItem next() {
        MenuItem item = (MenuItem) menuItems.get(position);
        position += 1;
        return item;
    }
}
