enum Laptop{
    DELL(2000), HP(1500), LENOVO(1800), MACBOOK(3000);
    private int price;
    Laptop(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
}
public class Enum{
    public static void main(String[] args) {
        System.out.println(Laptop.DELL.getPrice());
        System.out.println(Laptop.HP.getPrice());
        System.out.println(Laptop.LENOVO.getPrice());
        System.out.println(Laptop.MACBOOK.getPrice());
    }
}