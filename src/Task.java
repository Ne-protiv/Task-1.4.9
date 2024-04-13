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
            if (age < 7 | 65 < age) {
                return -1;
            } else {
                if (13 >= age) {
                    return 1;
                } else {
                    if (17 >= age)
                        return 2;
                    else {
                        return 3;
                    }
                }
            }
        }
    }
}