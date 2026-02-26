class OuterClass {
    private int outerField = 10;

    class InnerClass {
        public void display() {
            System.out.println("Outer field value: " + outerField);
        }
    }
}
public class InnerClass {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}