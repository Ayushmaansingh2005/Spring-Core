package javaconfigNoxml;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {

    @Value("#{new java.lang.String('I am studying Spring core')}")
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
