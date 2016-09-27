package sequence;

import org.junit.Test;
import static org.junit.Assert.*;

import sequence.Sequence;

public class SequenceTest {

    @Test
    public void testTriangle0() {
        assertEquals(Sequence.tri(0), 0);
    }

    @Test
    public void testTriangle1() {
        assertEquals(Sequence.tri(1), 1);
    }

    @Test
    public void testTriangle9() {
        assertEquals(Sequence.tri(9), 45);
    }


    @Test
    public void testLazy0() {
        assertEquals(Sequence.lazy(0), 1);
    }

    @Test
    public void testLazy1() {
        assertEquals(Sequence.lazy(1), 2);
    }

    @Test
    public void testLazy9() {
        assertEquals(Sequence.lazy(9), 46);
    }

}
