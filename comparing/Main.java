package comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student harshita = new Student(10, 88.5f);
        Student harshita2 = new Student(11, 98);
        Student kaushiki = new Student(5, 100);
        Student arya = new Student(19, 75);
        Student shivani = new Student(42, 68);

        Student[] list = {harshita, harshita2, kaushiki, arya, shivani};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        if(harshita.compareTo(harshita2) < 0) {
            System.out.println(harshita.compareTo(harshita2));
            System.out.println("Harshita2 has more marks");
        }
    }
}