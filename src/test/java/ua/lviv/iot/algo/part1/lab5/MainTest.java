package  ua.lviv.iot.algo.part1.lab5;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainTest {

    @Test
    public void testFindUniqueWordsOfLength() {
        String text = "This is a test sentence. It contains unique words of length 5.";
        Main main = new Main(text, 5);
        Set<String> expectedUniqueWords = new HashSet<>(Arrays.asList("words"));

        Set<String> actualUniqueWords = main.findUniqueWordsOfLength();

        assertEquals(expectedUniqueWords, actualUniqueWords);
    }

    @Test
    public void testFindUniqueWordsOfLength_withNoMatches() {
        String text = "This sentence does not contain any unique words of length 10.";
        Main main = new Main(text, 10);
        Set<String> expectedUniqueWords = new HashSet<>();

        Set<String> actualUniqueWords = main.findUniqueWordsOfLength();

        assertEquals(expectedUniqueWords, actualUniqueWords);
    }

    @Test
    public void testFindUniqueWordsOfLength_withQuestionMarks() {
        String text = "This is a test sentence? Does it contain unique words of length 5?";
        Main main = new Main(text, 5);
        Set<String> expectedUniqueWords = new HashSet<>(Arrays.asList("words"));

        Set<String> actualUniqueWords = main.findUniqueWordsOfLength();

        assertEquals(expectedUniqueWords, actualUniqueWords);
    }
    @Test
    public void testFindUniqueWordsOfLength_withSentenceBegin() {
        String text = "This is a sentence.";
        Main main = new Main(text, 4);
        Set<String> expectedUniqueWords = new HashSet<>(Arrays.asList("This"));

        Set<String> actualUniqueWords = main.findUniqueWordsOfLength();

        assertEquals(expectedUniqueWords, actualUniqueWords);
    }
    @Test
    public void testFindUniqueWordsOfLength_withEndOfSentence() {
        String text = "This is a sentence.";
        Main main = new Main(text, 8);
        Set<String> expectedUniqueWords = new HashSet<>(Arrays.asList("sentence"));

        Set<String> actualUniqueWords = main.findUniqueWordsOfLength();

        assertEquals(expectedUniqueWords, actualUniqueWords);
    }
}



