import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        Set<String> set = new HashSet<>();
        for (String words : text.split("\\P{IsAlphabetic}+")) {
            set.add(words);
        }
        return set.contains(word);
    }
}
