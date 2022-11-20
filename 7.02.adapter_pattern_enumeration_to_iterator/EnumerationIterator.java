import java.util.Iterator;
import java.util.Enumeration;

public class EnumerationIterator implements Iterator {
    Enumeration enume;
    public EnumerationIterator(Enumeration enume) {
        this.enume = enume;
    }

    public boolean hasNext() {
        return enume.hasMoreElements();
    }

    public Object next() {
        return enume.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

}