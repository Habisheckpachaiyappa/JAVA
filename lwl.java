public class Lwl {
    public static void main(String[] args) {
        String s = "Hello World";
        s = s.trim(); 
        int lastIndex = s.lastIndexOf(' ');
        if (lastIndex == -1) {
            System.out.println("Last word: " + s);
            System.out.println("Length of last word: " + s.length());
        } else {
            String lastWord = s.substring(lastIndex + 1);
            System.out.println("Last word: " + lastWord);
            System.out.println("Length of last word: " + lastWord.length());
        }
    }
}