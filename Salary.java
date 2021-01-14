import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String site = scanner.nextLine();
            if (salary > 0) {
                if (site.equals("Facebook")) {
                    salary -= 150;
                } else if (site.equals("Instagram")) {
                    salary -= 100;
                } else if (site.equals("Reddit")) {
                    salary -= 50;
                }
            }
            if(salary <= 0){
                System.out.printf("You have lost your salary.");
                break;
            }
        }
        if (salary > 0){
            System.out.printf("%.0f",salary);
        }

    }
}