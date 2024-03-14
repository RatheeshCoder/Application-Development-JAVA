package Abstract;

abstract class Addition {
    abstract int add(int a, int b);

    public void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
}

abstract class ImplementedMethod extends Addition {
    abstract void division(int a, int b);

    public void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }
}

class ConcreteClass extends ImplementedMethod {
    @Override
    int add(int a, int b) {
        return a + b;
    }

    @Override
    void division(int a, int b) {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Division by zero is not defined.");
    }
}

public class abstractClass {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        ConcreteClass obj = new ConcreteClass();
        int resultAddition = obj.add(a, b);
        obj.sub(a, b);
        obj.multiply(a, b);
        obj.division(a, b);

        System.out.println("Addition: " + resultAddition);
    }
}
