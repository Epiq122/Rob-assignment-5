public class CustomArrayList<T> implements CustomList<T> {
    Object[] items = new Object[10];
    int listSize = 0;

    public Object[] biggerArraySize() {
        Object[] newArray = new Object[listSize * 5];
        if (listSize >= 0) System.arraycopy(items, 0, newArray, 0, listSize);
        return newArray;
    }

    @Override
    public boolean add(T item) {
        if (listSize == items.length) {
            items = biggerArraySize();

        }
        items[listSize] = item;
        listSize++;
        return true;
    }

    @Override
    public int getSize() {
        return listSize;
    }

    @Override
    public T get(int index) {
        return null;
    }
}
