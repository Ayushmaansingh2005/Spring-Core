package Lifecyclebean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bean3 {
    private String example;
    public Bean3() {
        super();
    }

    @Override
    public String toString() {
        return "Bean3{" +
                "example='" + example + '\'' +
                '}';
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @PostConstruct
    public void start(){
        System.out.println("starting");
    }

    @PreDestroy
    public void end(){
        System.out.println("Ending");
    }



}
