public class replace {

    public static String replaceWord(String sentence, String target, String replacement) {
        if (sentence == null || target == null || replacement == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }
        return sentence.replace(target, replacement);
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String target = "fox";
        String replacement = "cat";

        String result = replaceWord(sentence, target, replacement);
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Modified Sentence: " + result);
    }
}
