import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByN {
    static CharacterComparator offByFive = new OffByN(5);

    @Test
    public void testOffByFive() {
        assertTrue(offByFive.equalChars('a', 'f'));
        assertTrue(offByFive.equalChars('r', 'm'));
        assertFalse(offByFive.equalChars('a', 'e'));
        assertFalse(offByFive.equalChars('z', 'a'));
        assertFalse(offByFive.equalChars('a', 'a'));
        assertFalse(offByFive.equalChars('&', '%'));
        int x = 'a';
        int y = 'B';
        int c = 'c';
        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
    }
}
