import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedListTests {

    @Test
    public void testMerge() {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("a", "c", "e"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("b", "d", "f"));
        assertEquals(new ArrayList<String> (Arrays.asList("a", "b", "c", "d", "e", "f")), ListExamples.merge(list1, list2));
    }
}