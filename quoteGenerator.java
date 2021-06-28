package quotegenerator;

import java.util.Random;
import java.util.Scanner;

/* Programmer: Daniel Youssef
 * Description: This is a Java program that returns quotes based
 * on the user's choice.
 */

public class quoteGenerator {
        static Scanner keyboard = new Scanner(System.in);
        static Random randomNum = new Random();
        
        static int quoteIndex;
         
    public static void main(String[] args) {
        System.out.println("Welcome!");
        
        menu(); 
    }   
    
    // Displays a list of mood options and calls the methods respectively
    public static void menu() {
        int userChoice = 0;
        
        do {
            System.out.println("======================================================================");
            System.out.println("Please give me a quote about...");
            System.out.println("\n1. Sadness");
            System.out.println("2. Happiness");
            System.out.println("3. Anger");
            System.out.println("4. Fear");
            System.out.println("\n5. Exit");
            System.out.println("======================================================================");
            System.out.print("Enter the number corresponding with the given mood choices: ");
            userChoice = keyboard.nextInt();
            
            while (userChoice <= 0 || userChoice > 5) {
                System.out.print("\nInvalid input. Please enter a number from the options above:  ");
                userChoice = keyboard.nextInt();   
            }
            
            switch (userChoice) {
                case 1:
                    System.out.println("======================================================================");
                    System.out.println(sadQuotes());
                    break;
                case 2:
                    System.out.println("======================================================================");
                    System.out.println(happyQuotes());
                    break;
                case 3:
                    System.out.println("======================================================================");
                    System.out.println(angryQuotes());
                    break;
                case 4:
                    System.out.println("======================================================================");
                    System.out.println(afraidQuotes());
                    break;
                case 5:
                    System.out.println("======================================================================");
                    System.out.println("Thank you for using this Quote Generator!");
                    System.exit(0);
            }
        } while (userChoice != 5); 
    }

    // Contains a series of quotes related to sadness
    public static String sadQuotes() {
        String[] sadQuotes = new String[5];
        
        sadQuotes[0] = ("""
            Every life has a measure of sorrow, and sometimes 
            this is what awakens us.
            \n - Steven Tyler """);
        sadQuotes[1] = ("""
            The good life is not one immune to sadness but one in
            which suffering contributes to our development.
            \n - Alain de Botton""");
        sadQuotes[2] = ("""
            We never taste happiness in perfection, our most fortunate
            successes are mixed with sadness.
            \n - Pierre Corneille """);
        sadQuotes[3] = ("""
            Even a happy life cannot be without a measure of darkness, and 
            the word happy would lose its meaning if it were not balanced 
            by sadness.
            \n - Carl Jung""");
        sadQuotes[4] = ("""
            Sadness flies away on the wings of time.
            \n - Jean de la Fontaine""");
        
        quoteIndex = randomNum.nextInt(sadQuotes.length);
        
        return sadQuotes[quoteIndex];
    }
    
    // Contains a series of quotes related to happiness
    public static String happyQuotes() {
        String[] happyQuotes = new String[5];
        
        happyQuotes[0] = ("""
            It is not about how much we have, but how much we enjoy that 
            makes happiness.
            \n - Charles Spurgeon""");
        happyQuotes[1] = ("""
            Happiness cannot be traveled to, owned, earned, worn 
            or consumed. Happiness is the spiritual experience
            of living every minute with love, grace, and 
            gratitude.
            \n - Denis Waitley""");
        happyQuotes[2] = ("""
            True happiness is... to enjoy the present, without anxious
            dependence upon the future.
            \n - Lucius Annaeus Seneca""");
        happyQuotes[3] = ("""
            Happiness depends upon ourselves.
            \n - Aristotle""");
        happyQuotes[4] = ("""
            Happiness exists on earth, and it is won through prudent exercise
            of reason, knowledge of the harmony of the universe, and constant
            practice of generosity.
            \n - Jose Marti""");
        
        quoteIndex = randomNum.nextInt(happyQuotes.length);
        
        return happyQuotes[quoteIndex];
    }
    
    // Contains a series of quotes related to anger
    public static String angryQuotes() {
        String[] angryQuotes = new String[5];
        
        angryQuotes[0] = ("""
            For every minute you remain angry, you give up sixty seconds
            of peace of mind.
            \n - Ralph Waldo Emerson""");
        angryQuotes[1] = ("""
            Anger is an acid that can do more harm to the vessel in which
            it is stored than to anything on which it is poured.
            \n - Mark Twain""");
        angryQuotes[2] = ("""
            There are two things a person should never be angry at, what they
            can help, and what they cannot.
            \n - Plato""");
        angryQuotes[3] = ("""
            Holding on to anger is like grasping a hot coal with the intent
            of throwing it at someone else; you are the one who gets burned.
            \n - Buddha""");
        angryQuotes[4] = ("""
            In times of great stress and adversity, it's always best to keep 
            busy, to plow your anger and your energy into something positive.
            \n - Lee Iacocca""");
        
        quoteIndex = randomNum.nextInt(angryQuotes.length);
        
        return angryQuotes[quoteIndex];
    }
    
    // Contains a series of quotes related to fear
    public static String afraidQuotes() {
        String[] afraidQuotes = new String[5];
        
        afraidQuotes[0] = ("""
            The only that we have to fear is fear itself.
            \n - Franklin D. Roosevelt""");
        afraidQuotes[1] = ("""
            Only when we are no longer afraid do we begin to live.
            \n - Dorothy Thompson""");
        afraidQuotes[2] = ("""
            What is fear of living? It's being preeminently afraid of dying.
            It is not doing what you came here to do, out of timidity and 
            spinelessness. The antidote is to take full responsibility for
            yourself--for the time you take up and the space you occupy. 
            If you don't know what you're here to do, then just do some good.
            \n - Maya Angelou""");
        afraidQuotes[3] = ("""
            One of the greatest discoveries a man makes, one of his great 
            surprises, is to find he can do what he was afraid he couldn't do.
            \n - Henry Ford""");
        afraidQuotes[4] = ("""
            When we are afraid, we ought not to occupy ourselves with 
            endeavoring to prove that there is no danger, but in strengthening
            ourselves to go in spite of the danger. 
            \n - Hale White""");
        
        quoteIndex = randomNum.nextInt(afraidQuotes.length);
        
        return afraidQuotes[quoteIndex];
    }
}
    