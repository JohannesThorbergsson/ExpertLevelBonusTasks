import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testReverseString() {
        Assertions.assertEquals("gnirtS tseT", Main.reverseString("Test String"));
    }
    @Test
    public void testSort() {
        Assertions.assertArrayEquals(new int[]{2, 3, 6, 6, 8, 9}, Main.arraySort(new int[]{6,2,8,3,9,6}));
    }
    @Test
    public void testSplitString(){
        Assertions.assertArrayEquals(new String[] {"three", "words", "array"}, Main.stringSplit("three,words,array"));
    }
    @Test
    public void testChecksum() {
    Assertions.assertEquals(21, Main.checksum(69420));
    }
    @Test
    public void testRoman() {
        Assertions.assertEquals("XLII", Main.roman(42));
    }
}
