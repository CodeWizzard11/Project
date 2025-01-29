import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        System.out.println("Code Wizzard");

        calculator cal = new calculator(); // Object


        do{
            boolean exit = cal.exitFunc();
            if(!exit) {
                break;
            }
            System.out.println("Choose an operator to perform calculation + , - , / , * , % ");

            Scanner sc = new Scanner(System.in);

            String input = sc.nextLine();
            char ch = input.charAt(0);
            cal.simpleCal(ch);
        }while(true);

    }

    public boolean exitFunc(){
        int times;
        int retry = 3;
        for (times = 0; times < retry; times++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("you want to continue calculation or want to exit the calculation Type (y/n) respectively");
            char exit = sc.next().charAt(0);
            if (exit == 'n') {
                return false;
            } else if (exit == 'y') {
                return true;
            } else {
                System.out.println("Invalid input");
            }

        }
        if (times == retry) {
            System.out.println("You have reached the maximum number of attempts");
            return false;
        }
        return false;
    }
    public int getInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer");
        return sc.nextInt();
    }

    public void simpleCal(char ch){
        switch (ch){

            case '+':
                int num1= getInteger();
                int num2= getInteger();
                System.out.println("Addition" + (num1 + num2));
                break;
            case '-':
                int num3= getInteger();
                int num4= getInteger();
                System.out.println("Subtraction" + (num3 - num4));
                break;
            case '*':
                int num5= getInteger();
                int num6= getInteger();
                System.out.println("Multiplication" + (num5 * num6));
                break;
            case '/':
                int num7= getInteger();
                int num8= getInteger();
                if (num8 == 0){
                    System.out.println("Not divisible by Zero");
                    break;
                }
                System.out.println("Division" + (num7 / num8));
                break;
                case '%':
                    int num9= getInteger();
                    int num10= getInteger();
                    if (num10 == 0){
                        System.out.println("Not divisible by Zero");
                        break;
                    }
                    System.out.println("Modulo" + (num9 % num10));
                    break;
            default:
                System.out.println("Invalid input");

        }
    }
}
