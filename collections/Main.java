package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        list.add(5);
        list1.add(32);
        list1.add(35);
        list1.add(39);
        list1.add(42);

        System.out.println(list1);

        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(5);
        vector.add(15);
        vector.add(56);
        vector.add(67);
        System.out.println(vector);
    }
}
