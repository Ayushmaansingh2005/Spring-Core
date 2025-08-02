package Lifecyclebean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean2 implements InitializingBean, DisposableBean {
    private double price;

    @Override
    public String toString() {
        return "Bean2{" +
                "price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public Bean2() {
        super();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Taking B2");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("giving or destroying b2");
    }
}
