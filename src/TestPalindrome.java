import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    static Palindrome palindrome = new Palindrome();
    static CharacterComparator offByOne = new OffByOne();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }

    @Test
    public void testIsPalindrome() {
        String word1 = "hannah";
        String word2 = "abase";
        String word3 = "cat";
        String word4 = "a";
        assertTrue("hannah should return true", palindrome.isPalindrome(word1));
        assertFalse("abase should return true", palindrome.isPalindrome(word2));
        assertFalse("cat should return true", palindrome.isPalindrome(word3));
        assertTrue("a should return true", palindrome.isPalindrome(word4));
    }
    @Test
    public void testOffByOne() {
        String word1 = "flake";
        assertTrue("flake should return true", palindrome.isPalindrome(word1, offByOne));
    }
}
