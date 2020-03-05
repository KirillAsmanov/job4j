import org.junit.Test;
import ru.job4j.condition.Triangle;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        assertThat(Triangle.exist(3,4,5), is(true));
    }

    @Test
    public void whenDosntExist() {
        assertThat(Triangle.exist(1,5,7), is(false));
    }
}
