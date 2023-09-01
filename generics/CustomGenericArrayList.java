package generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList() {
        //you cannot create instances of type parameter
        //this.data = new T[DEFAULT_SIZE];
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }
 
    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull() {
        return size == data.length;
    }

    // public T remove() {
    //     T removed = (T)data[--size];
    //     return removed;
    // }

    // public T get(int index) {
    //     return (T)data[index];
    // }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }
    
    @Override
    public String toString() {
        return "CustomArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
    }

    public static void main(String[] args) {
        //CustomArrayList list =new CustomArrayList();
        // list.add(5);
        // list.add(3);
        // list.add(9);
        // System.out.println(list);
        // for(int i = 0; i < 14; i++) {
        //     list.add(2*i);
        // }
        // System.out.println(list);
        CustomGenericArrayList<Integer> list2 = new CustomGenericArrayList<>();
        list2.add(4);
        list2.add(9);
        list2.add(7);
        list2.add(10);
        System.out.println(list2);
        //list2.remove();
        System.out.println(list2);
    }
}
