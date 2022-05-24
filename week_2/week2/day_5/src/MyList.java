import java.util.Arrays;

public class MyList<T> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 8;
    private T[] data;

    public MyList() {
        data = (T[]) new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        if (size > data.length) {
            int biggerSize = size * 2 + 1;
            data = Arrays.copyOf(data, biggerSize);
        }
    }

    public void add(T e) {
        size += 1;
        ensureCapa();
        data[size - 1] = e;
    }

    public T get(int index) {
        if (index >= 0 && index < size) {
            return data[index];
        }
        return null;
    }

    public T[] getData() {
        return this.data;
    }

    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                data[i] = data[i + 1];
            }
            size -= 1;
            return true;
        }
        return false;
    }


}