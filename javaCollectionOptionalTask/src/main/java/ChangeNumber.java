import java.util.Scanner;
import java.util.Stack;

public class ChangeNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = scan.next();
        char [] n = number.toCharArray();
        Stack<Character> digits = new Stack<>();
        for (int i = 0; i< n.length; i++){
            digits.push(n[i]);
        }
        while (!digits.empty()){
            System.out.print(digits.peek());
        digits.pop();
        }
    }
}
