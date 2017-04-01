package structural.decorator;

/**
 * Created by muratbayram on 01/04/2017.
 */
public class ChestnutWaffleDecorator extends AbstractWaffleDecorator {

    public ChestnutWaffleDecorator(Waffle waffle) {
        super(waffle);
    }

    public void prepare() {
        waffle.prepare();
        System.out.println("chestnut has been added");
    }
}
