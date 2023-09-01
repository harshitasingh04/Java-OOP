package objectclass;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
       return super.hashCode();
    }   

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    //Already covered
    @Override
    public String toString() {
        return super.toString();
    }
    //Already covered
    @Override
    protected void finalize() throws Throwable {
        //super.finalize();;
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34, 56.8f);
        ObjectDemo obj1 = new ObjectDemo(12, 78.9f);

        if(obj == obj1) {
            System.out.println("obj is equal to obj1");
        }

        if(obj.equals(obj1)) {
            System.out.println("obj is equal to obj1");
        }

        // System.out.println(obj.hashCode());
        // System.out.println(obj1.hashCode());
    }
}
