package Dictionary_English_and_VN;

import java.util.ArrayList;
import java.util.Scanner;

public class SynonymAdder extends WordModifier{
    public SynonymAdder(Dictionary dictionary) {
        super(dictionary);
    }

    @Override
    public void modifyWord(Word word) {
        if (word == null) {
            System.out.println("Word is null!");
            return;
        }

        if (word.getSynonyms() == null) {
            word.setSynonyms(new ArrayList<>());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter synonyms for " + word.getEnglish() + ": ");
        String synonyms = scanner.nextLine();

        if (!synonyms.isEmpty()) {
            word.getSynonyms().add(synonyms);
            System.out.println("Added synonyms for " + word.getEnglish() + ": " + synonyms);
        } else {
            System.out.println("No synonyms for " + word.getEnglish());
        }
    }
}
