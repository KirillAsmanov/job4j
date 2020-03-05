import org.junit.Test;
import ru.job4j.condition.Max;
import org.junit.Assert;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        assertThat(Max.max(1, 2), is(2));
    }

    @Test
    public void whenMax4To3Then4() {
        assertThat(Max.max(4,3), is(4));
    }

    @Test
    public void when6AreEquals6Then6 (){
        assertThat(Max.max(6,6), is(6));
    }
}
