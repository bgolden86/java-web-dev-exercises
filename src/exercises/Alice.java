package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String Sentence;
        String UserInput;
        Scanner input;



        Sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice " +
                "she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        input = new Scanner(System.in);
        System.out.println("Search for a term in the sentence: ");
        UserInput = input.next();

        if(Sentence.contains(UserInput)){
            System.out.println("True");
         }
        Integer index = Sentence.indexOf(UserInput);
        Integer length = UserInput.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = Sentence.replace(UserInput, "");
        System.out.println(modifiedSentence);

    }

}
