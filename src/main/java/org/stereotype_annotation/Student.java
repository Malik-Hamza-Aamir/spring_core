package org.stereotype_annotation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// instead of inside the xml file we add make an object using the Component annotation
// this annotation can change the name of the object to ("name here") in front of @Component
// if we want to assign the value to the data fields then we use the @Value("data here") annotation

@Component
public class Student {
    @Value("Hamza Aamir")
    private String studentName;
    @Value("Islamabad")
    private String city;

    public String getCity() {
        return city;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
