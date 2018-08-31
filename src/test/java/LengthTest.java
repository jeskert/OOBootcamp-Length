import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LengthTest {
    @Test
    public void should_return_length_10() throws Exception {
        Length length = new Length(10);
        assertEquals(10, length.getLength());
    }

    @Test
    public void should_return_length_9() throws Exception {
        Length length = new Length(9);
        assertEquals(9, length.getLength());
    }

    @Test
    public void should_return_equals_given_length_10_and_length_10() throws Exception {
        Length length1 = new Length(10);
        Length length2 = new Length(10);
        assertEquals(length1, length2);
    }

    @Test
    public void should_return_not_equals_given_length_9_and_length_10() {
        Length length1 = new Length(9);
        Length length2 = new Length(10);
        assertNotEquals(length1, length2);
    }
}

