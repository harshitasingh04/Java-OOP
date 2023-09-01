package inheritance;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight() {
        this.weight = -1;
    }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // call the parent class constructor
        //used to initialize values present in the parent class
        //but it can not access members which are declared private
        this.weight = weight;
    }
    public BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }
}
