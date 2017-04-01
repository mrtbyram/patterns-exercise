package structural;

import org.junit.Test;
import structural.composite.Person;

/**
 * Created by muratbayram on 01/04/2017.
 */
public class CompositeTest {

    @Test
    public void should_print_family_tree(){
        Person murat = new Person("Murat");
        Person banu = new Person("Banu");

        Person alparslan = new Person("Alparslan");
        alparslan.addChild(murat);
        alparslan.addChild(banu);

        Person huseyin = new Person("Huseyin");
        huseyin.addChild(alparslan);

        huseyin.introduce();
    }
}
