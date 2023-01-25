import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the word to check if it's a palindrome");
        String input = scanner.next();
        char[] inputArray = input.toCharArray();
        String reverseString = "";
        for (int i = inputArray.length-1; i >= 0; --i){
            reverseString += inputArray[i];
        }

        System.out.println(input.equals(reverseString)?"Yes":"No");
    }
}