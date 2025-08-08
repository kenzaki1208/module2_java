package Dictionary_English_and_VN;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dictionary dictionary = new Dictionary();
        dictionary.loadDictionary();

        DictionaryVnAndGerman dict = new DictionaryVnAndGerman();
        dict.loadDict();

        DictFranceToVn dictFranceToVn = new DictFranceToVn();
        dictFranceToVn.loadFile();

        dictionaryMenu(scanner, dictionary, dict, dictFranceToVn);
    }

    private static void dictionaryMenu(Scanner scanner, Dictionary dictionary, DictionaryVnAndGerman dict, DictFranceToVn dictFranceToVn) {
        int choice;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Extract English to Vietnamese");
            System.out.println("2. Extract German to Vietnamese");
            System.out.println("3. Extract France to Vietnamese");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    EngToVnDictionary(scanner, dictionary);
                    break;
                case 2:
                    GerToVnDictionary(scanner, dict);
                    break;
                case 3:
                    FraToVnDictionary(scanner, dictFranceToVn);
                    break;
                case 0:
                    System.out.println("Exiting !");
                    break;
                default:
                    System.out.println("No choice");
            }
        } while (choice != 0);
        scanner.close();
    }

    private static void EngToVnDictionary(Scanner scanner, Dictionary dictionary) {
        int choice;
        System.out.println("======= Menu English to Vietnamese =======");
        System.out.println("1. Add new word");
        System.out.println("2. Remove word");
        System.out.println("3. Search word");
        System.out.println("4. Update Dictionary");
        System.out.println("5. List all words");
        System.out.println("6. Add Synonyms to word");
        System.out.println("0. Exit");
        System.out.println("=====================");

        do {
            System.out.println();
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 0 || choice > 6) {
                    System.out.println("Invalid choice! Please enter a number between 0-5");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                choice = -1;
                continue;
            }

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Enter english word: ");
                        String englishWord = scanner.nextLine();
                        System.out.print("Enter Vietnamese word: ");
                        String vietnameseWord = scanner.nextLine();
                        System.out.print("Enter part of speech (noun/verb/adj/adv): ");
                        String partOfSpeech = scanner.nextLine();

                        try {
                            Word word = new Word(dictionary.getAllWords().size() + 1, englishWord, vietnameseWord, partOfSpeech);
                            dictionary.addWord(word);
                            System.out.println("Word added successfully !");
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                            System.out.println("Please enter again!");
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        try {
                            System.out.print("Enter english word: ");
                            String deleteEnglishWord = scanner.nextLine();
                            if (dictionary.removeWord(deleteEnglishWord)) {
                                System.out.println("Word deleted successfully !");
                            } else {
                                System.out.println("Word not found !");
                            }
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                            System.out.println("Please enter again!");
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        try {
                            System.out.print("Enter english word: ");
                            String searchEnglishWord = scanner.nextLine();
                            List<Word> foundWords = dictionary.searchWord(searchEnglishWord);

                            if (!foundWords.isEmpty()) {
                                System.out.println("Search results:");
                                for (Word w : foundWords) {
                                    System.out.println(w.getEnglish() + " -> " + w.getVietnamese());

                                    if (w.getSynonyms() != null && !w.getSynonyms().isEmpty()) {
                                        System.out.println("Synonyms: " + String.join(", ", w.getSynonyms()));
                                    }
                                }
                            } else {
                                System.out.println("Search keyword not found or empty !");
                                continue;
                            }
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                            System.out.println("Please enter again!");
                        }
                    }
                    break;
                case 4:
                    while (true) {
                        try {
                            System.out.println("Enter id to update: ");
                            int updateId = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Enter english word need to update: ");
                            String updateEnglishWord = scanner.nextLine();
                            System.out.print("Enter vietnamese word need to update: ");
                            String updateVietnameseWord = scanner.nextLine();

                            System.out.print("Enter synonyms (comma-separated), or leave blank if none: ");
                            String synonymInput = scanner.nextLine();
//                            List<String> synonyms = new ArrayList<>();
//
//                            if (!synonymInput.trim().isEmpty()) {
//                                String[] parts = synonymInput.split(",");
//                                for (String s : parts) {
//                                    synonyms.add(s.trim());
//                                }
//                            }

                            if (dictionary.updateWord(updateId, updateEnglishWord, updateVietnameseWord)) {
//                                Word wordToUpdate = dictionary.getAllWords().stream()
//                                        .filter(w -> w.getId() == updateId).findFirst().orElse(null);
//
//                                if (wordToUpdate != null) {
//                                    wordToUpdate.setSynonyms(synonyms);
//                                }

//                                dictionary.saveDictionary();
                                System.out.println("Word updated successfully with synonyms!");
                            } else {
                                System.out.println("Word not found !");
                            }
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                            System.out.println("Please enter again!");
                        }
                    }
                    break;
                case 5:
//                    for (Word w : dictionary.getAllWords()) {
//                        System.out.println(w);
//                    }
                    System.out.println();
                    dictionary.displayAllWords();
                    break;
                case 6:
                    System.out.println("Enter english word to add synonyms: ");
                    String engWord = scanner.nextLine().trim();
                    WordModifier synonymAdder = new SynonymAdder(dictionary);
                    synonymAdder.execute(engWord);
                    break;
                case 0:
                    System.out.println("Exiting !");
                    break;
                default:
                    System.out.println("No choice");
            }
        } while (choice != 0);
    }

    private static void GerToVnDictionary(Scanner scanner, DictionaryVnAndGerman dict) {
        int choice;
        System.out.println("======= Menu German to Vietnamese =======");
        System.out.println("1. Add new word");
        System.out.println("2. Remove word");
        System.out.println("3. Search word");
        System.out.println("4. Update Dictionary");
        System.out.println("5. List all words");
        System.out.println("6. Add Synonyms to word");
        System.out.println("0. Exit");
        System.out.println("=====================");

        do {
            System.out.println();
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 0 || choice > 6) {
                    System.out.println("Invalid choice! Please enter a number between 0-5");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                choice = -1;
                continue;
            }

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Enter german word: ");
                        String germanWord = scanner.nextLine();
                        System.out.print("Enter Vietnamese word: ");
                        String vietnameseWord = scanner.nextLine();
                        System.out.print("Enter part of speech (noun/verb/adj/adv): ");
                        String partOfSpeech = scanner.nextLine();

                        try {
                            GermanWord word = new GermanWord(dict.getAll().size() + 1, germanWord, vietnameseWord, partOfSpeech);
                            dict.addGermanWord(word);
                            System.out.println("Word added successfully !");
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                            System.out.println("Please enter again!");
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        try {
                            System.out.print("Enter german word: ");
                            String deleteGermanWord = scanner.nextLine();
                            if (dict.deleteWord(deleteGermanWord)) {
                                System.out.println("Word deleted successfully !");
                            } else {
                                System.out.println("Word not found !");
                            }
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                            System.out.println("Please enter again!");
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        try {
                            System.out.print("Enter german word: ");
                            String searchGermanWord = scanner.nextLine();
                            List<GermanWord> foundWords = dict.search(searchGermanWord);

                            if (!foundWords.isEmpty()) {
                                System.out.println("Search results:");
                                for (GermanWord w : foundWords) {
                                    System.out.println(w.getGerman() + " -> " + w.getVietnamese());

                                    if (w.getSynonyms() != null && !w.getSynonyms().isEmpty()) {
                                        System.out.println("Synonyms: " + String.join(", ", w.getSynonyms()));
                                    }
                                }
                            } else {
                                System.out.println("Search keyword not found or empty !");
                                continue;
                            }
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                            System.out.println("Please enter again!");
                        }
                    }
                    break;
                case 4:
                    while (true) {
                        try {
                            System.out.println("Enter id to update: ");
                            int updateId = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Enter german word need to update: ");
                            String updateGermanWord = scanner.nextLine();
                            System.out.print("Enter vietnamese word need to update: ");
                            String updateVietnameseWord = scanner.nextLine();

//                            System.out.print("Enter synonyms (comma-separated), or leave blank if none: ");
//                            String synonymInput = scanner.nextLine();
//                            List<String> germanSynonyms = new ArrayList<>();
//
//                            if (!synonymInput.trim().isEmpty()) {
//                                String[] parts = synonymInput.split(",");
//                                for (String s : parts) {
//                                    germanSynonyms.add(s.trim());
//                                }
//                            }

                            if (dict.update(updateId, updateGermanWord, updateVietnameseWord)) {
//                                GermanWord germanWordToUpdate = dict.getAll().stream().
//                                        filter(germanWord -> germanWord.getId() == updateId)
//                                        .findFirst().orElse(null);
//
//                                if (germanWordToUpdate != null) {
//                                    germanWordToUpdate.setGermanSynonyms(germanSynonyms);
//                                }
                                System.out.println("Word updated successfully !");
                            } else {
                                System.out.println("Word not found !");
                            }
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                            System.out.println("Please enter again!");
                        }
                    }
                    break;
                case 5:
                    System.out.println();
                    dict.displayAll();
                    break;
                case 6:
                    System.out.println("Enter german word to add synonyms: ");
                    String gerWord = scanner.nextLine().trim();
                    GermanWordModifier synonymAdder = new SynonymGermanAdder(dict);
                    synonymAdder.executeGerman(gerWord);
                    break;
                case 0:
                    System.out.println("Exiting !");
                    break;
                default:
                    System.out.println("No choice");
            }
        } while (choice != 0);
    }

    private static void FraToVnDictionary(Scanner scanner, DictFranceToVn dictFranceToVn) {
        int choice;
        System.out.println("======= Menu France to Vietnamese =======");
        System.out.println("1. Add new word");
        System.out.println("2. Remove word");
        System.out.println("3. Search word");
        System.out.println("4. Update Dictionary");
        System.out.println("5. List all words");
        System.out.println("6. Add Synonyms to word");
        System.out.println("0. Exit");
        System.out.println("=====================");

        do {
            System.out.println();
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 0 || choice > 6) {
                    System.out.println("Invalid choice! Please enter a number between 0-5");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                choice = -1;
                continue;
            }

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Enter france word: ");
                        String franceWord = scanner.nextLine();
                        System.out.print("Enter Vietnamese word: ");
                        String vietnameseWord = scanner.nextLine();
                        System.out.print("Enter part of speech (noun/verb/adj/adv): ");
                        String partOfSpeech = scanner.nextLine();

                        try {
                            FranceWord word = new FranceWord(dictFranceToVn.getAll().size() + 1, franceWord, vietnameseWord, partOfSpeech);
                            dictFranceToVn.addFranceWord(word);
                            System.out.println("Word added successfully !");
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                            System.out.println("Please enter again!");
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        try {
                            System.out.print("Enter france word: ");
                            String deleteFranceWord = scanner.nextLine();
                            if (dictFranceToVn.deleteWord(deleteFranceWord)) {
                                System.out.println("Word deleted successfully !");
                            } else {
                                System.out.println("Word not found !");
                            }
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                            System.out.println("Please enter again!");
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        try {
                            System.out.print("Enter france word: ");
                            String searchWord = scanner.nextLine();
                            List<FranceWord> foundWords = dictFranceToVn.search(searchWord);

                            if (!foundWords.isEmpty()) {
                                System.out.println("Search results:");
                                for (FranceWord w : foundWords) {
                                    System.out.println(w.getFrance() + " -> " + w.getVietnamese());

                                    if (w.getSynonyms() != null && !w.getSynonyms().isEmpty()) {
                                        System.out.println("Synonyms: " + String.join(", ", w.getSynonyms()));
                                    }
                                }
                            } else {
                                System.out.println("Search keyword not found or empty !");
                                continue;
                            }
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                            System.out.println("Please enter again!");
                        }
                    }
                    break;
                case 4:
                    while (true) {
                        try {
                            System.out.println("Enter id to update: ");
                            int updateId = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Enter france word need to update: ");
                            String updateFranceWord = scanner.nextLine();
                            System.out.print("Enter vietnamese word need to update: ");
                            String updateVietnameseWord = scanner.nextLine();

                            System.out.print("Enter synonyms (comma-separated), or leave blank if none: ");
                            String synonymInput = scanner.nextLine();
                            List<String> franceSynonyms = new ArrayList<>();
                            if (!synonymInput.trim().isEmpty()) {
                                String[] parts = synonymInput.split(",");
                                for (String part : parts) {
                                    franceSynonyms.add(part.trim());
                                }
                            }

                            if (dictFranceToVn.update(updateId, updateFranceWord, updateVietnameseWord)) {
                                FranceWord franceWordToUpdate = dictFranceToVn.getAll().stream().
                                        filter(franceWord -> franceWord.getId() == updateId).
                                        findFirst().orElse(null);

                                if (franceWordToUpdate != null) {
                                    franceWordToUpdate.setFranceSynonyms(franceSynonyms);
                                }

                                dictFranceToVn.saveFile();
                                System.out.println("Word updated successfully !");
                            } else {
                                System.out.println("Word not found !");
                            }
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                            System.out.println("Please enter again!");
                        }
                    }
                    break;
                case 5:
                    System.out.println();
                    dictFranceToVn.displayAll();
                    break;
                case 6:
                    System.out.println("Enter france word to add synonyms: ");
                    String fraWord = scanner.nextLine().trim();
                    FranceWordModifier synonymAdder = new SynonymFranceAdder(dictFranceToVn);
                    synonymAdder.executeFrance(fraWord);
                    break;
                case 0:
                    System.out.println("Exiting !");
                    break;
                default:
                    System.out.println("No choice");
            }
        } while (choice != 0);
    }
}
