package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer: class B extends class A, so class B is inheriting from class A.
 * Even though int i = 20 in class B, it is inheriting data from class A which is declaring int i = 10.
 * So printing out a.i is going to print out the value from class A since class B extends A.
 *
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
    }
}