
class Mobile{
    static String name;
    int price;
    static {
        System.out.println("Static block called!");
    }
    
    public void show(){
        System.out.println(name + " " + price);
    }
    
};


public class StaticClass {

    public static void main(String args[]){
        Mobile obj1 = new Mobile();
        Mobile.name = "Apple";
        obj1.price = 100000;
        obj1.show();
        Mobile obj2 = new Mobile();
        //  We access static variable by only as a class member 
        Mobile.name = "Samsung";
        obj2.price = 100000;
         obj2.show();

    }
}