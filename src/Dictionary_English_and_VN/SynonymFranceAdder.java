package Dictionary_English_and_VN;

import java.util.ArrayList;
import java.util.Scanner;

public class SynonymFranceAdder extends FranceWordModifier{
    public SynonymFranceAdder(DictFranceToVn dictionary) {
        super(dictionary);
    }

    @Override
    public void modifyFranceWord(FranceWord franceWord) {
        if (franceWord == null) {
            System.out.println("Word is null!");
            return;
        }

        if (franceWord.getSynonyms() == null) {
            franceWord.setSynonyms(new ArrayList<>());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter synonyms for " + franceWord.getFrance() + ": ");
        String synonyms = scanner.nextLine();

        if (!synonyms.isEmpty()) {
            franceWord.getSynonyms().add(synonyms);
            System.out.println("Added synonyms for " + franceWord.getFrance() + ": " + synonyms);
        } else {
            System.out.println("No synonyms for " + franceWord.getFrance());
        }
    }
}
