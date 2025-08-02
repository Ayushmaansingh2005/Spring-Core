package stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("Ayushmaan Rajput")
     private  String studentname;
    @Value("Motihari")
     private String city;


    

    public String getStudentname() {
        return studentname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentname='" + studentname + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
