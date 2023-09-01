package enums;

public class Basic {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //these are enum constants
        //public, static and final
        //since its final you can not create child enums
        //type is Week

        Week() {
            System.out.println("Constructor called for " + this);
        }
        //this is not public or protected, only private or default
        //why? we don't want to create new objects
        //because this is not the enums concept
        //internally: public static final Week Monday = new Week();
    }
    public static void main(String[] args) {
        // Week week;
        // week = Week.Monday;
        System.out.println(Week.valueOf("Monday"));
        // for(Week day : Week.values()) {
        //     System.out.println(day);
        // }
        // System.out.println(week);
    }
}
