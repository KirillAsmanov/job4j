import org.junit.Test;
import ru.job4j.array.Turn;
import ru.job4j.loop.CheckPrimeNumber;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TurnTest {
    @Test
    public void whenTurn4321to1234() {
        int[] input = new int[] {4, 3, 2, 1};
        int[] result = Turn.back(input);
        int[] except = new int[] {1, 2, 3, 4};
        assertThat(result, is(except));
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {7, 6, 5, 4, 3, 2, 1};
        int[] result = turner.back(input);
        int[] expect = new int[] {1, 2, 3, 4, 5, 6, 7};
        assertThat(result, is(expect));
    }
}
