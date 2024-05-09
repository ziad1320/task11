import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Choose the number of parameters to pass to SUM:");
        System.out.println("1\n2");
        int choice =0;
        int sumRes = 0;

        while(true){
            try {
                choice = myObj.nextInt();
            }catch(Exception e) {
                e.getMessage();
                myObj.nextLine();
                continue;
            }

            try {
                switch (choice) {
                    case 1:
                        System.out.println("Choose the data type of parameter to pass to SUM:");
                        System.out.println("1. int\n2. double");
                        int select = myObj.nextInt();


                        if(select == 1) {
                            System.out.println("Please enter an integer");
                            int input1 = myObj.nextInt();
                            sumRes = sum(input1);
                        }else if(select == 2) {
                            System.out.println("Please enter a float");
                            float input2 = myObj.nextFloat();
                            sumRes = sum(input2);
                        } else break;
                        break;
                    case 2:
                        System.out.println("Choose the two integers to pass to SUM:");
                        int min = myObj.nextInt();
                        int max = myObj.nextInt();
                        sumRes = sum(min, max);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }catch(Exception e) {
                e.getMessage();
                myObj.nextLine();
                continue;
            }

            System.out.println("Result: " + sumRes);
            System.out.println("Do want another try?");
            System.out.println("1 for yes or 0 for no");
            int input3=myObj.nextInt();
            if(input3 == 1) {
                System.out.println("Choose the number of parameters to pass to SUM:");
                System.out.println("1\n2");
                continue;
            }
            else
                System.out.println("program executsd successfully");
            break;
        }
        myObj.close();
    }





    // Method to calculate sum recursively for integer inputs
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    // Method to calculate sum for double inputs
    public static int sum(double k) {
        if (k > 0) {
            return (int) Math.round(k) + sum((int) k - 1);
        } else {
            return 0;
        }
    }

    // Method to calculate sum recursively for a range of integers
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }

    }
}