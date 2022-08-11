public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        UserInputHelper userInputHelper = new UserInputHelper();

        System.out.println("Provide 5 employees");

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter data for the employee number " + (i + 1));
            company.addToEmployeesList(userInputHelper.createNewEmployee());
        }
        System.out.println("You have entered 5 employees. Now you can use the available functions \n");

        boolean stop = false;
        while (!stop) {
            System.out.println("------------ CHOOSE OPTION ------------");
            System.out.println("1 - Print sum of all employees salary");
            System.out.println("2 – Display all employees data");
            System.out.println("3 – Add new employee");
            System.out.println("4 – End program");
            System.out.println("---------------------------------------");

            int chosenOption = UserInputHelper.getOptionChosenByUser();

            switch (chosenOption) {
                case 1 -> company.printSumOffAllEmployees();
                case 2 -> company.displayAllEmployees();
                case 3 -> company.addToEmployeesList(userInputHelper.createNewEmployee());
                case 4 -> {
                    stop = true;
                    System.out.println("Thank you for using this program. Good Bye!");
                }
                default -> System.out.println("To select an option, enter its number");
            }
        }
    }
}