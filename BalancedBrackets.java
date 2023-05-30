import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();
        if (isBalancedBrackets(input)) {
            System.out.println("The entered string has balanced brackets");
        } else {
            System.out.println("The entered string does not contain balanced brackets");
        }
    } 

    public static boolean isBalancedBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isOpenBracket(ch)) {
                stack.push(ch);
            } else if (isCloseBracket(ch)) {
                if (stack.isEmpty() || !isMatchingBracket(stack.pop(), ch)) {
                    return false;
                }
            }
        }  

        return stack.isEmpty();
    } 

    public static boolean isOpenBracket(char ch) {
        return ch == '(' || ch == '[' || ch == '{';
    }

    public static boolean isCloseBracket(char ch) {
        return ch == ')' || ch == ']' || ch == '}';
    }

    public static boolean isMatchingBracket(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '[' && close == ']')
     
                || (open == '{' && close == '}');
              
        }  


}
