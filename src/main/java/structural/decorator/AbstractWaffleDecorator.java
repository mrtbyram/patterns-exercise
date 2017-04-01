package structural.decorator;

/**
 * Created by muratbayram on 01/04/2017.
 */
public abstract class AbstractWaffleDecorator implements Waffle {

    Waffle waffle;

    public AbstractWaffleDecorator(Waffle waffle) {
        this.waffle = waffle;
    }
}
