package Task_2;

public class TextData {
    private String fileName;
    private String text;
    private int numberOfVowels;
    private int numberOfConsonants;
    private int numberOfLetters;
    private int numberOfSentences;
    private String longestWord;

    public TextData(String fileName, String text) {
        this.fileName = fileName;
        this.text = text;
        this.numberOfVowels = countVowels(text);
        this.numberOfConsonants = countConsonants(text);
        this.numberOfLetters = countLetters(text);
        this.numberOfSentences = countSentences(text);
        this.longestWord = findLongestWord(text);
    }

    private int countVowels(String text) {
        return (int) text.chars()
                .filter(c -> "AEIOUaeiou".indexOf(c) != -1)
                .count();
    }

    private int countConsonants(String text) {
        return (int) text.chars()
                .filter(c -> Character.isLetter(c) && "AEIOUaeiou".indexOf(c) == -1)
                .count();
    }

    private int countLetters(String text) {
        return (int) text.chars()
                .filter(Character::isLetter)
                .count();
    }

    private int countSentences(String text) {
        return text.split("[.!?]").length;
    }

    private String findLongestWord(String text) {
        String[] words = text.split("\\W+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public String getFilename() {
        return fileName;
    }

    public String getText() {
        return text;
    }

    public int getNumberOfVowels() {
        return numberOfVowels;
    }

    public int getNumberOfConsonants() {
        return numberOfConsonants;
    }

    public int getNumberOfLetters() {
        return numberOfLetters;
    }

    public int getNumberOfSentences() {
        return numberOfSentences;
    }

    public String getLongestWord() {
        return longestWord;
    }

    @Override
    public String toString() {
        return "File Name: " + fileName +
                "\nText: " + text +
                "\nNumber of Vowels: " + numberOfVowels +
                "\nNumber of Consonants: " + numberOfConsonants +
                "\nNumber of Letters: " + numberOfLetters +
                "\nNumber of Sentences: " + numberOfSentences +
                "\nLongest Word: " + longestWord;
    }
}
