public class PalindromeFinder {
    public static void main(String[] args) {
        int minLength = 4;
        In in = new In("./words.txt");
        Palindrome palindrome = new Palindrome();
        CharacterComparator offByOne = new OffByOne();
        System.out.println("Palindrome:\n");
        while (!in.isEmpty()) {
            String word = in.readString();
            if (word.length() >= minLength && palindrome.isPalindrome(word)) {
                System.out.println(word);
            }
        }
        in = new In("./words.txt");
        System.out.println("\nPalindrome(off by one): \n");
        while (!in.isEmpty()) {
            String word = in.readString();
            if (word.length() >= minLength && palindrome.isPalindrome(word, offByOne)) {
                System.out.println(word);
            }
        }
    }
}

