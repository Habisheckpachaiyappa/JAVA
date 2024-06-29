public class Lwlj {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lastWordLength(s));
    }

    public static int lastWordLength(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}