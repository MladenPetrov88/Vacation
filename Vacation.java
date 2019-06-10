import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyNeedForExcurcion = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        double totalDays = 0;
        double daysSpend = 0;


        while (moneyNeedForExcurcion > availableMoney) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            totalDays++;

            if (action.equals("save")) {
                availableMoney = availableMoney + money;
                daysSpend = 0;
            } if (availableMoney >= moneyNeedForExcurcion) {
                System.out.printf("You saved the money for %.0f days.", totalDays);
            } else if (action.equals("spend")) {
                daysSpend++;
                if (availableMoney < money) {
                    availableMoney = 0;
                } else {
                    availableMoney = availableMoney - money;
                }
                if (daysSpend >=5) {
                    System.out.printf("You can't save the money.%n%.0f", totalDays);
                    break;
                }
            }
        }

        }

    }

