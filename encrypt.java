import java.util.ArrayList;

public class Encryption {

  public static void main(String[] args) {
    String input = "COVID crisis has taught us several lessons and together we will overcome this great challenge. Now there is a sense of introspection in people. India will emerge stronger from this.";
    ArrayList<Integer> encrypted = new ArrayList<>();
    int sumBefore = 0;

    // Convert to encrypted digits
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (c >= 'a' && c <= 'z') {
        encrypted.add(c - 96);
        sumBefore += c - 96;
      } else if (c >= 'A' && c <= 'Z') {
        encrypted.add(c - 38);
        sumBefore += c - 38;
      } else if (c == '.') {
        encrypted.add(99);
        sumBefore += 99;
      } else {
        encrypted.add(0);
      }
    }

    // Increment by word length
    ArrayList<Integer> incremented = new ArrayList<>();
    int sumAfter = 0;
    int wordLength = 0;
    for (int i = 0; i < encrypted.size(); i++) {
      int digit = encrypted.get(i);
      if (digit == 0) {
        wordLength = 0;
      } else {
        wordLength++;
        incremented.add(digit + wordLength * 100);
        sumAfter += digit + wordLength * 100;
      }
    }

    // Print the results
    System.out.println("Encrypted digits before increment: " + encrypted);
    System.out.println("Sum before increment: " + sumBefore);
    System.out.println("Encrypted digits after increment: " + incremented);
    System.out.println("Sum after increment: " + sumAfter);
  }
}
