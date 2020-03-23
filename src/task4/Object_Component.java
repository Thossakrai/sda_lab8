package task4;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Object_Component {

    Object_Component() {}

    public void add(Object_Component o) {};

    abstract public void render();

    abstract public float volume();

    abstract public Iterator<Object_Component> createIterator();
}
