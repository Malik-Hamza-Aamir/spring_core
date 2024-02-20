package org.singleton_prototype;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @scope: means that same object or different object will be returned to be used in the application
// singleton: same object values again and again - by default
// prototype: different object values again and again - had to be done

@Component("f")
@Scope("prototype")
public class Furniture {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                '}';
    }
}
