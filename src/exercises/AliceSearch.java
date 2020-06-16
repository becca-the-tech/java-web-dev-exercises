package exercises;

import java.util.Scanner;

public class AliceSearch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please type a search string to be found in this passage: ");
        String search = input.nextLine();
        String sampleText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        if (sampleText.toLowerCase().contains(search.toLowerCase())){
            System.out.println("true");
            int startIndexOfSearchTerm = sampleText.toLowerCase().indexOf(search.toLowerCase());
            int endIndexOfSearchTerm =  startIndexOfSearchTerm + (search.length() - 1);
            System.out.println("Search term starts at index: " + startIndexOfSearchTerm);
            System.out.println("Search term ends at index: " + endIndexOfSearchTerm);

            String removedSearchSentence = sampleText.substring(0, startIndexOfSearchTerm) + sampleText.substring(endIndexOfSearchTerm + 1);
            System.out.println(removedSearchSentence);
        } else {
            System.out.println("false");
        }
    }
}
