package Dictionary_English_and_VN;

import java.util.ArrayList;
import java.util.Scanner;

public class SynonymGermanAdder extends GermanWordModifier{
    public SynonymGermanAdder (DictionaryVnAndGerman dictionary) {
        super(dictionary);
    }

    @Override
    public void modifyGermanWord(GermanWord germanWord) {
        if (germanWord == null) {
            System.out.println("Word is null!");
            return;
        }

        if (germanWord.getSynonyms() == null) {
            germanWord.setSynonyms(new ArrayList<>());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter synonyms for " + germanWord.getGerman() + ": ");
        String synonyms = scanner.nextLine();

        if (!synonyms.isEmpty()) {
            germanWord.getSynonyms().add(synonyms);
            System.out.println("Added synonyms for " + germanWord.getGerman() + ": " + synonyms);
        } else {
            System.out.println("No synonyms for " + germanWord.getGerman());
        }
    }
}
