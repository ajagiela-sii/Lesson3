import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHelper {

    public Employee createNewEmployee() {
        Scanner sc = new Scanner(System.in);

        boolean wrongData = true;
        String name = "";
        String surname = "";
        float salary = 0.0F;
        while (wrongData) {
            try {
                System.out.println("Provide employee name, surname and salary");
                String userData = sc.nextLine();
                String[] userDataArray = userData.split(" ");
                if (userDataArray[0].chars().allMatch(Character::isLetter)
                        && userDataArray[1].chars().allMatch(Character::isLetter)) {
                    name = userDataArray[0];
                    surname = userDataArray[1];
                    salary = Float.parseFloat(userDataArray[2]);
                    wrongData = false;
                } else {
                    System.out.println("Name and surname can only contain letters");
                }
            } catch (NumberFormatException exception) {
                System.out.println("Salary should be a number. Enter the correct data");
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("You gave too few arguments");
            }
        }
        return new Employee(name, surname, salary);
    }

    public static int getOptionChosenByUser() {
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        } catch (InputMismatchException exception) {
            return -1;
        }
    }
}
