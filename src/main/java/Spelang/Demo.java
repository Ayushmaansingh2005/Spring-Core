package Spelang;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{22+11}")
    private int x;

    @Value("#{1+2}")
    private int y;

    @Value("#{T(java.lang.Math).sqrt(25)}")
    private  double z;

    @Value("#{new java.lang.String('Ayushmaan singh')}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }




    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", z=" + z +
                ", y=" + y +
                ", x=" + x +
                '}';
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
