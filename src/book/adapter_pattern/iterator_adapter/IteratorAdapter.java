package book.adapter_pattern.iterator_adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter implements Iterator {
    private final Enumeration enumeration;

    public IteratorAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

}
