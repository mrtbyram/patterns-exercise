package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by muratbayram on 01/04/2017.
 */
public class Person {

    private String name;
    private List<Person> children;

    public Person(String name) {
        this.name = name;
        children = new ArrayList<Person>();
    }

    public void addChild(Person child){
        children.add(child);
    }

    public void introduce(){
        System.out.println(name);
        for (Person child : children) {
            child.introduce();
        }
    }
}
