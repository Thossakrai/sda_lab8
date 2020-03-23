package task3;

public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;

    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public MenuItem next() {
        MenuItem item = menuItems[position];
        position += 1;
        return item;
    }
}
