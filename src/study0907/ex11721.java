package study0907;

import java.util.Scanner;

public class ex11721 {
    private void run() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output += input.charAt(i);

            if ((i + 1) % 10 == 0 || i == input.length() - 1) {
                System.out.println(output);
                output = "";
            }
        }
    }

    public static void main(String[] args) {
        new ex11721().run();
    }

}
