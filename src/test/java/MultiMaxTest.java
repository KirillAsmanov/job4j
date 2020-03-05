import org.junit.Test;
import ru.job4j.condition.MultiMax;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax test = new MultiMax();
        assertThat(test.max(2, 4, 3), is(4));
    }

    @Test
    public void whenThirdMax() {
        MultiMax test = new MultiMax();
        assertThat(test.max(2, 7, 12), is(12));
    }
    @Test
    public void whenAreEquals() {
        MultiMax test = new MultiMax();
        assertThat(test.max(7, 7, 7), is(7));
    }

}
