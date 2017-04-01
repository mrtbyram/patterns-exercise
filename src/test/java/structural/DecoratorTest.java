package structural;

import org.junit.Test;
import structural.decorator.BananaWaffleDecorator;
import structural.decorator.BaseWaffle;
import structural.decorator.ChestnutWaffleDecorator;
import structural.decorator.Waffle;

/**
 * Created by muratbayram on 01/04/2017.
 */
public class DecoratorTest {

    @Test
    public void should_prepare_empty_waffle(){
        System.out.println("TESTING EMPTY...");
        Waffle waffle = new BaseWaffle();

        waffle.prepare();
        System.out.println();
    }

    @Test
    public void should_prepare_with_chestnut(){
        System.out.println("TESTING CHESTNUT...");
        Waffle waffle = new ChestnutWaffleDecorator(new BaseWaffle());

        waffle.prepare();
        System.out.println();
    }

    @Test
    public void should_prepare_full_waffle(){
        System.out.println("TESTING FULL...");
        Waffle waffle = new BananaWaffleDecorator(new ChestnutWaffleDecorator(new BaseWaffle()));

        waffle.prepare();
        System.out.println();
    }
}
