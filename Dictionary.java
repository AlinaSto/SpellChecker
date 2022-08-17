package Collectionss_SpellChecker;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Dictionary {
  private   Set<String> knownWordsList;

    public Dictionary(Set<String> knownWords) {
        this.knownWordsList = knownWords;
    }

    public Set<String> getKnownWords() {
        return knownWordsList;
    }

    public void setKnownWords(Set<String> knownWords) {
        this.knownWordsList = knownWords;
    }
}
