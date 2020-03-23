package task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Object extends Object_Component {
    private List<Object_Component> children = new ArrayList<>();

    @Override
    public void add(Object_Component o) {
        children.add(o);
    }

    @Override
    public void render() {
        for(Object_Component o: children) {
            o.render();
        }
    }

    @Override
    public float volume() {
        return 0;
    }

    @Override
    public Iterator<Object_Component> createIterator() {
        return new CompositeIterator(children.iterator());
    }
}
