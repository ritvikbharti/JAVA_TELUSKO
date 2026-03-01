interface A{
    void show();
    void config();
}
interface C extends A{
    void display();
}

class B implements A,C{
    public void show(){
        System.out.println("Show method in class B");
    }
    public void config(){
        System.out.println("Config method in class B");
    }
    public void display(){
        System.out.println("Display method in class B");
    }
}


public class Interface {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();   
        obj.display();
    }

      
}