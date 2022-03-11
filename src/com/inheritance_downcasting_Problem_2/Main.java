package com.inheritance_downcasting_Problem_2;

public class Main {
    public static void main(String[] args) {
        Bird b1 = new Parrot();
        //with this b1 reference call the fly method
        //and after downcasting this b1 reference to the Parrot class object, call the sing method also

        //This calls the overridden method because of runtime polymorphism
        b1.fly();

        //Downcasting
        Parrot p1 = (Parrot)b1;
        p1.sing();
        //Changes in another file as well
    }
}
