01.02-Exceptions-Nivel2

Create a class called "Input". This class should be used to control the different exceptions that can appear in Java when entering data by keyboard using the Scanner class.
The first thing to do is instantiate an object of the Scanner class and from there, create static methods to read the different types of data from the keyboard.

Important:
It is important that if an exception occurs in any method, we handle it and ask the user for the data again until it is entered correctly. For example: If they enter a float with a dot instead of a comma, it should display "Format error". Until the user enters a well-formed float, they should continue asking for the data.
All methods receive a String with the message that you want to show the user, for example: "Enter your age", and return the appropriate data entered by the user in each method, for example: a byte with the user's age.
Methods to implement catching the exception of the "InputMismatchException" class:
public static byte readByte(String message);
public static int readInt(String message);
public static float readFloat(String message);
public static double readDouble(String message);

Methods to implement catching a custom exception of the Exception class:
public static char readChar(String message);
public static String readString(String message);
public static boolean readSiNo(String message), if the user enters “s”, returns “true”, if the user enters “n”, returns “false”.

This Java project demonstrates how to validate user input for different data types, such as `byte`, `int`, `float`,
`double`, `char`, `String`, and `boolean`. It ensures that the user enters valid data and handles exceptions gracefully.

Features
- **Input Validation**: The program validates user input for various data types and handles incorrect formats.
- **Error Handling**: It uses `try-catch` blocks to manage exceptions and provides user-friendly error messages.
- **Interactive Prompts**: The program prompts the user for input and continues until valid data is entered.

Technologies Used
- **Java**: The project is written in Java and uses the `Scanner` class for user input.
- **Exception Handling**: Custom exceptions and built-in exceptions like `InputMismatchException` are used to handle invalid input.

How to Use
1. **Clone the Repository**: 
Open the project in your preferred IDE IntelliJ IDEA

Run the Program:
Compile and run the Main class.
Follow the Prompts:
The program will ask you to enter different types of data (e.g., age, ID number, height, etc.).
Enter the requested data, and the program will validate it.

Requirements
Java JDK 8 or higher: Ensure you have Java installed on your system.
IDE: Use an IDE IntelliJ IDEA.

Contribution
If you'd like to contribute to this project, follow these steps:
Fork the Repository:
Click the "Fork" button on the repository page.
Create a New Branch:
Add new features, fix bugs, or improve the code.
Commit Your Changes:
Open a Pull Request:
Go to the original repository and click "New Pull Request".
