import org.junit.Test;
import ru.job4j.condition.SqMax;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SqMaxTest {
    @Test
    public void whenThirdIsMax(){
        SqMax test = new SqMax();
        assertThat(test.max(6,4,7, 5), is(7));
    }

    @Test
    public void whenSecondIsMax(){
        SqMax test = new SqMax();
        assertThat(test.max(6,12,7, 5), is(12));
    }

    @Test
    public void whenFirstIsMax(){
        SqMax test = new SqMax();
        assertThat(test.max(7,4,3, 5), is(7));
    }

    @Test
    public void whenFirstAndThirdAreEquals(){
        SqMax test = new SqMax();
        assertThat(test.max(7,2,7, 2), is(7));
    }
}
