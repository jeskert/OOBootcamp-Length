import org.junit.Test;

import static org.junit.Assert.*;

public class MyLengthTest {

    @Test
    public void should_have_length_10() {
        MyLength length = new MyLength(10);
        assertEquals(10, length.getValue());
    }

    @Test
    public void should_return_false_when_given_10_9() throws Exception {
        MyLength length_10 = new MyLength(10);
        MyLength length_9 = new MyLength(9);
        assertNotEquals(length_10, length_9);
    }

    @Test
    public void should_return_true_when_given_10_10() throws Exception {
        MyLength length1 = new MyLength(10);
        MyLength length2 = new MyLength(10);
        assertEquals(length1, length2);
    }
}
