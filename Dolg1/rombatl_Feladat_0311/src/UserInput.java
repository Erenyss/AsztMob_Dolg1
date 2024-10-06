import java.util.Scanner;

public class UserInput {
    public double askNumber(String num){
        Scanner scanner = new Scanner(System.in);
        System.out.print(num);
        return scanner.nextDouble();
    }
}
