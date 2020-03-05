import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;


public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 0;
        int expected = 0;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 120;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}
