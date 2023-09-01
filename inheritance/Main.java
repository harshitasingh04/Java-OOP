package inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box = new Box(4, 6.9, 2.4);
        // Box box1 = new Box(box);
        // System.out.println(box.l + " " + box.h + " " + box.w);
        // System.out.println(box1.w);
        // BoxWeight box2 = new BoxWeight();
        // System.out.println(box2.weight + " " + box2.h + " " + box2.l + " " + box2.w);
        //Box box3 = new BoxWeight(2,3,4 ,8);
        //it is actually the type of the reference variable that actually determines
        //and not the type of object, what members can be accessed 
        //System.out.println(box3.l);
        //BoxWeight box4 = new Box(2, 4, 6);
        //there are many variables in both parent and child
        //you are given access to variables present in the reference type i.e. Boxweight
        //hence, you should have access to the weight variable
        //this also means, that the ones you are trying to access should be initialized
        //but here, when the object itself is of type parent class, how will you call the constructor of the child class
        //that is why error

        //BoxPrice box = new BoxPrice();
    }
}