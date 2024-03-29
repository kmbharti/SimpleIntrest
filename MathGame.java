import java.util.Random;
import java.util.Scanner;

public class MathGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int numQuestions = 5; // Number of questions to ask

        System.out.println("Welcome to Math Game!");

        for (int i = 1; i <= numQuestions; i++) {
            // Generate two random numbers for the question
            int num1 = random.nextInt(10); // Change range as needed
            int num2 = random.nextInt(10); // Change range as needed

            // Generate a random operator (+, -, *)
            char operator = generateOperator();

            // Display the question
            System.out.print("Question " + i + ": What is " + num1 + " " + operator + " " + num2 + "? ");

            // Get the user's answer
            int userAnswer = scanner.nextInt();

            // Calculate the correct answer
            int correctAnswer = calculateAnswer(num1, num2, operator);

            // Check if the answer is correct
            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is " + correctAnswer);
            }
        }

        // Display the final score
        System.out.println("Game over! Your final score is: " + score + " out of " + numQuestions);
    }

    // Method to generate a random operator (+, -, *)
    public static char generateOperator() {
        Random random = new Random();
        char[] operators = {'+', '-', '*'};
        return operators[random.nextInt(operators.length)];
    }

    // Method to calculate the answer based on the operator
    public static int calculateAnswer(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}
