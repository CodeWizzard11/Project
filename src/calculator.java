import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Arpan");
        System.out.println("Choose an operator to perform calculation + , - , / , * , % ");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        char ch = input.charAt(0);

        switch (ch){
            case '+':
                System.out.println("Addition");
                break;
                case '-':
                    System.out.println("Subtraction");
                    break;
                    case '*':
                        System.out.println("Multiplication");
                        break;
                        case '/':
                            System.out.println("Division");
                            break;
                            default:
                                System.out.println("Invalid input");
                                break;


        }

    }
}
