package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Why does the output print in the order it does?
 *
 * You answer: Because of the classes Extending one another, they are stacking in memory. So once the code reaches the top,
 * class A_1 in this case, it will start to execute from top down. It will go through class A_1 then work its way down the stack
 * until it returns back to where it made the call and will then move on or terminate in this case.
 *
 */

class A_1 {
    public A_1()
    {
        System.out.println("Class A Constructor");
    }
}

class B_1 extends A_1 {
    public B_1()
    {
        System.out.println("Class B Constructor");
    }
}

class C_1 extends B_1 {
    public C_1()
    {
        System.out.println("Class C Constructor");
    }
}

public class Exercise_03 {
    public static void main(String[] args)
    {
        C_1 c = new C_1();
    }
}
