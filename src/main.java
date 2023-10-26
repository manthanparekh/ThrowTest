import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            // int percentage = num * 20/100;
            int percentage = num / 0;
            System.out.println(percentage);
        } catch (Exception exception) {
            throw new Exception("there is error in the code");
        }
    }
}
