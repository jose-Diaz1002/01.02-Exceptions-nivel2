import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static boolean on = true;
    public static void main(String[] args) {
        byte numberByte = readByte("Please enter a byte: ");
        int number = readInt("Enter your number from -2,147,483,648 to 2,147,483,647: ");
        float numberFloat = readFloat("Enter float number: ");
        double doubleNumber = readDouble("Enter double number: ");

        System.out.println("byte: " + numberByte + "\nnumber: " + number +
                "\nFoat: " + numberFloat + "\ndouble: " +
                doubleNumber);
        while (on){
            try {
                char letter = readChar("Enter a character: ");
            }catch (Exception e){
                System.out.println("Incorrect format");
            }
        }
        on = true;
        while (on){
            try {
                String text = readString("Enter a word.");
            }catch (Exception e){
                System.out.println("Remember, it's only one word");
            }
        }
        on = true;
        while (on){
            try {
                boolean trueOrFalse = readYesNo("Type Y or N: ");
                System.out.println(trueOrFalse);
            }catch (Exception e){
                System.out.println("Incorrect format");
            }
        }
        scanner.close();
    }


    public static byte readByte(String message) {
        byte smallNumber = 0;

        while (true) {
            try {
                System.out.println(message);
                smallNumber = scanner.nextByte();
                return smallNumber;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Enter the number correctly");
                scanner.nextLine();
            }
        }

    }

    public static int readInt(String message){
        int number = 0;
        while (true){
            try {
                System.out.println(message);
                number = scanner.nextInt();
                return number;
            }catch (InputMismatchException e){
                System.out.println("Format error. Enter the number correctly");
                scanner.nextLine();
            }
        }
    }

    public static float readFloat(String message){
        float decimal = 0;
        while (true){
            try {
                System.out.println(message);
                decimal = scanner.nextFloat();
                return decimal;
            }catch (InputMismatchException e){
                System.out.println("Format error. Enter the number correctly");
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String message){
        double decimal = 0;
        boolean valid = false;
        while (true){
            try {
                System.out.println(message);
                decimal = scanner.nextDouble();
                scanner.nextLine();
                return decimal;
            }catch (InputMismatchException e){
                System.out.println("Format error. Enter the number correctly");
                scanner.nextLine();
            }

        }
    }

    public static char readChar(String message) throws InputException {
        String letter = "";
        System.out.println(message);
        letter = scanner.nextLine();
        if (letter.length() == 1) {
            System.out.println("Very good [" + letter + "] is a character");
            on = false;
            return letter.charAt(0);
        } else {
            throw new InputException();
        }
    }

    public static String readString(String message) throws InputException {
        String text = "";
        System.out.println(message);
        text = scanner.nextLine();
        if (text.contains(" ") || text.contains("\t")){
            throw new InputException();
        } else {
            System.out.println("Thank you [" + text + "] is a word.");
            on = false;
            return text;
        }
    }

    public static boolean readYesNo(String message) throws InputException {
        boolean yesOrNo = true;
        String sOrN = "";
        System.out.println(message);
        sOrN = scanner.nextLine();

        if (sOrN.toLowerCase().equals("y")){
            on = false;
            return yesOrNo;
        } else if (sOrN.toLowerCase().equals("n")) {
            yesOrNo = false;
            on = false;
            return yesOrNo;
        } else {
            throw new InputException();
        }
    }
}



















