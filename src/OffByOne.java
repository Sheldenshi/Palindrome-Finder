public class OffByOne implements CharacterComparator {
    @Override
    public boolean equalChars(char x, char y) {
        int diff = Math.abs((int) x - (int) y);
        if (diff == 1 || diff == 31 || diff == 33) {
            return true;
        }
        return false;
    }
}
