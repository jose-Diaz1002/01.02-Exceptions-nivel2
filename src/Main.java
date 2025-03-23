import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static boolean on = true;
    public static void main(String[] args) {
        byte age = readByte("Please enter your age: ");
        int number = readInt("Enter your ID number: ");
        float height = readFloat("Enter your height in meters: ");
        double distance = readDouble("Kilometers traveled: ");

        System.out.println("Your age is: " + age + " with ID number: " + number +
                " with a height of: " + height + " meters" + " and kilometers traveled: " +
                distance + " km");
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
    }

    public static byte readByte(String message) {
        byte smallNumber = 0;
        while (true) {
            try {
                System.out.println(message);
                smallNumber = sc.nextByte();
                return smallNumber;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Enter the number correctly");
            }
        }
    }

    public static int readInt(String message){
        int number = 0;
        while (true){
            try {
                System.out.println(message);
                number = sc.nextInt();
                return number;
            }catch (InputMismatchException e){
                System.out.println("Format error. Enter the number correctly");
            }
        }
    }

    public static float readFloat(String message){
        float decimal = 0;
        while (true){
            try {
                System.out.println(message);
                decimal = sc.nextFloat();
                return decimal;
            }catch (InputMismatchException e){
                System.out.println("Format error. Enter the number correctly");
            }
        }
    }

    public static double readDouble(String message){
        double decimal = 0;
        while (true){
            try {
                System.out.println(message);
                decimal = sc.nextDouble();
                return decimal;
            }catch (InputMismatchException e){
                System.out.println("Format error. Enter the number correctly");
            }
        }
    }

    public static char readChar(String message) throws InputException {
        String letter = "";
        System.out.println(message);
        letter = sc.nextLine();
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
        text = sc.nextLine();
        if (text.contains(" ")){
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
        sOrN = sc.nextLine();

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




















