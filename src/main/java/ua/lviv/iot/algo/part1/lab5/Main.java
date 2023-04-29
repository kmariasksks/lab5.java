package  ua.lviv.iot.algo.part1.lab5;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private final String text;
    private final int length;
    public Main(final String text, final int length) {
        this.text = text;
        this.length = length;
    }
    public static void main(final String[] args) {

        if (args.length < 2) {
            System.out.println("Usage: java Main <text> <word length>");
            System.exit(1);
        }

        String text = args[0];
        int wordLength = Integer.parseInt(args[1]);

        Main main = new Main(text, wordLength);
        Set<String> result = main.findUniqueWordsOfLength();
        System.out.println(result);

    }

    public Set<String> findUniqueWordsOfLength() {
        String regex = "\\b\\w{" + length + "}\\b";
        Pattern pattern = Pattern.compile(regex);

        HashSet<String> uniqueWords = new HashSet<>();

        String[] sentences = text.split("\\?");

        for (String sentence : sentences) {
            Matcher matcher = pattern.matcher(sentence);
            while (matcher.find()) {
                uniqueWords.add(matcher.group());
            }
        }
        return uniqueWords;
    }

}
