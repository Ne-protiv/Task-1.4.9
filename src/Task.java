import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = sc.nextInt();
        DetermineGroup x = new DetermineGroup();
        int result = x.determineGroup(age);
        System.out.println(result);
    }

    static class DetermineGroup {
        public int determineGroup(int age) {
            if (13 >= age & age >= 7) {
                return 1;
            }
            if (17 >= age & age >= 14) {
                return 2;
            }
            if (65 >= age & age >= 18) {
                return 3;
            }
            else{
                return -1;
            }
        }
    }
}

