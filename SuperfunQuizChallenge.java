import java.util.Scanner;
/**
 * @author Qurrat-al-Ain Siddiqui
 */
public class SuperfunQuizChallenge {
    public void run()  {
        Scanner keyboard = new Scanner(System.in); 
        
        // Declare the constants 
        
        final int MINIMUM_SCORE_TO_PASS = 5;
        final int NUMBER_OF_QUESTIONS = 7;

        // Decclare variables - the c's too
        
        int score = 0;
        int numberOfCs = 0;

        // Print to user
        
        // ASK JORDAN IF THIS IS NECESSARY!! System.out.println("This is the Superfun Quiz.");

        // Print the q&a's to the user and then ask them for an answer to the question
        
        // Question 1
        
        System.out.println();
        System.out.println("Entomology is the science that studies");
        System.out.println("A. Behavior of human beings");
        System.out.println("B. Insects");
        System.out.println("C. The origin and history of technical and scientific terms");
        System.out.println("D. The formation of rocks");
        System.out.println();
        System.out.print("Your answer: ");
        char answer = Character.toLowerCase(keyboard.next().charAt(0));
        
        // Use if statement to get user's answer

        if (answer == 'b') {
            score++;
        }
        if (answer == 'c') {
            numberOfCs++;
        }

        // Question 2
        
        System.out.println();
        System.out.println("Eritrea, which became the 182nd member of the UN in 1993, is in the continent of");
        System.out.println("A. Asia");
        System.out.println("B. Africa");
        System.out.println("C. Europe");
        System.out.println("D. Australia");
        System.out.println();
        System.out.print("Your answer: ");
        answer = Character.toLowerCase(keyboard.next().charAt(0));
        
        // Use if statement to get user's answer

        if (answer == 'b') {
            score++;
        }
        if (answer == 'c') {
            numberOfCs++;
        }

        // Question 3
        
        System.out.println();
        System.out.println("Which of the following is not one of the bots on Mystery Science Theater 3000?");
        System.out.println("A. Jambot");
        System.out.println("B. Gypsy");
        System.out.println("C. Tom Servo");
        System.out.println("D. Crow T. Robot");
        System.out.println();
        System.out.print("Your answer: ");
        answer = Character.toLowerCase(keyboard.next().charAt(0));
        
        // Use if statement to get user's answer

        if (answer == 'a') {
            score++;
        }
        if (answer == 'c') {
            numberOfCs++;
        }

        
        // Question 4
        
        System.out.println();
        System.out.println("Germany signed the Armistice Treaty on ____ and World War I ended");
        System.out.println("A. January 19, 1918");
        System.out.println("B. May 30, 1918");
        System.out.println("C. November 11, 1918");
        System.out.println("D. February 15, 1918");
        System.out.println();
        System.out.print("Your answer: ");
        answer = Character.toLowerCase(keyboard.next().charAt(0));
        
        // Use if statement to get user's answer

        if (answer == 'c') {
            score++;
            numberOfCs++;
        }

        // Question 5
        
        System.out.println();
        System.out.println("Headquarters of UNO are situated at");
        System.out.println("A. New York, USA");
        System.out.println("B. Hague (Netherlands)");
        System.out.println("C. Geneva");
        System.out.println("D. Paris");
        System.out.println();
        System.out.print("Your answer: ");
        answer = Character.toLowerCase(keyboard.next().charAt(0));
        
        // Use if statement to get user's answer

        if (answer == 'a') {
            score++;
        }
        if (answer == 'c') {
            numberOfCs++;
        }

        // Question 6
        
        System.out.println();
        System.out.println("What utensil serves as the rallying cry of The Tick?");
        System.out.println("A. chopstick");
        System.out.println("B. spoon");
        System.out.println("C. fork");
        System.out.println("D. butter knife");
        System.out.println();
        System.out.print("Your answer: ");
        answer = Character.toLowerCase(keyboard.next().charAt(0));
        
        // Use if statement to get user's answer

        if (answer == 'b') {
            score++;
        }
        if (answer == 'c') {
            numberOfCs++;
        }

        // Question 7 (last one)
        
        System.out.println();
        System.out.println("What is the theme of the board game Die Macher?");
        System.out.println("A. sculpting");
        System.out.println("B. car racing");
        System.out.println("C. German politics");
        System.out.println("D. castle building");
        System.out.println();
        System.out.print("Your answer: ");
        answer = Character.toLowerCase(keyboard.next().charAt(0));
        
        // Use if statement to get user's answer

        if (answer == 'c') {
            score++;
            numberOfCs++;
        }

        // Print the quiz results that the user gets and also the number of c's that they get 
        
        System.out.println();
        if (score >= MINIMUM_SCORE_TO_PASS) {
            System.out.println("You have passed the quiz!");
        } else {
            System.out.println("You have failed the quiz.");
        }

        if (numberOfCs == NUMBER_OF_QUESTIONS) {
            System.out.println("All Cs, eh? That's how I passed music theory last year.");
        }
    }

}
