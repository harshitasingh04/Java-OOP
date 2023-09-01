package objectcloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human harshita = new Human(21, "Harshita");
        //we are cloning the object harshita here
        //but this way takes more time
        //Human twin = new Human(harshita);
        Human twin = (Human)harshita.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(harshita.arr));
    }
}