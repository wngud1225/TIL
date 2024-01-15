import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int total = sc.nextInt();
        String target = sc.nextLine();
//       int[] alpha = new int[26];

        int sum = 0;
        for (int i = 0; i < target.length(); i++) {
            char ch = target.charAt(i);

          System.out.println(ch - 'A'); //temp 0부터

          if ((ch - 'A' + 1) <= 15) {
            int timer = (((ch - 'A')) / 3) + 3; //Z, S
            sum += timer;
          } else if ((ch - 'A' + 1) >= 16 && (ch - 'A' + 1) <= 19) {
            sum += 8;
          } else if ((ch - 'A' + 1) >= 20 && (ch - 'A' + 1) < 26) {
            int timer = (((ch - 'T')) / 3) + 9;
            sum += timer;
          }
          else {
                sum += 10; //Z
            }

        }


        System.out.println(sum);

    }
}