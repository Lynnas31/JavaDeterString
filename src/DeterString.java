import java.util.Scanner;

public class DeterString {
    public static void main(String[] args) {
        String a = "HelloWorld";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The key");
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
        if(a.charAt(i)== input.charAt(0) ){
            count++;
        }
        }
        System.out.println("Count is " + count);
    }
}

