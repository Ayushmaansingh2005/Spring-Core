package Lifecyclebean;

public class Bean1 {
    private double price;
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bean1{" +
                "price=" + price +
                '}';
    }

    public Bean1() {
        super();
    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }
    public void init(){
        System.out.println("Inside init method");
    }
    public void destroy(){
        System.out.println("Inside destroy method");
    }


}
