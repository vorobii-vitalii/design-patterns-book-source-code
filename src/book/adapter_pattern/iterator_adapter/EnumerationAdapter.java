package book.adapter_pattern.iterator_adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter implements Enumeration {
    private final Iterator iterator;

    public EnumerationAdapter(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return this.iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return this.iterator.next();
    }

}
