package structural.decorator;

/**
 * Created by muratbayram on 01/04/2017.
 */
public class BananaWaffleDecorator extends AbstractWaffleDecorator {

    public BananaWaffleDecorator(Waffle waffle) {
        super(waffle);
    }

    public void prepare() {
        waffle.prepare();
        System.out.println("banana has been added");
    }
}
