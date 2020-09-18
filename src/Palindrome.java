public class Palindrome {
    public Deque<Character> wordToDeque(String word) {
        char[] chars = word.toCharArray();
        ArrayDeque<Character> result = new ArrayDeque<Character>();
        for (char ch : chars) {
            result.addLast(ch);
        }
        return result;
    }

    public boolean isPalindrome(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        Deque<Character> deque = wordToDeque(word);
        while (deque.size() != 0 && deque.size() != 1) {
            Character front = deque.removeFirst();
            Character end = deque.removeLast();
            if (front.compareTo(end) != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(String word, CharacterComparator cc) {
        if (word == null || word.isEmpty()) {
            return false;
        } else if (cc == null) {
            return isPalindrome(word);
        } else {
            Deque<Character> deque = wordToDeque(word);
            while (deque.size() != 0 && deque.size() != 1) {
                Character front = deque.removeFirst();
                Character end = deque.removeLast();
                if (!cc.equalChars(front, end)) {
                    return false;
                }
            }
            return true;
        }
    }

}
