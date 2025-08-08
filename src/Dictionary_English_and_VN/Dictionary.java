package Dictionary_English_and_VN;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Dictionary {
    private static final String DICTIONARY_FILE = "src/Dictionary_English_and_VN/dictionary.txt";

    private List<Word> words;

    public Dictionary() {
        this.words = new ArrayList<>();
        loadDictionary();
    }

    public void addWord(Word word) {
        if (word == null || word.getEnglish() == null || word.getVietnamese() == null ||
                word.getEnglish().trim().isEmpty() || word.getVietnamese().trim().isEmpty()) {
            throw new IllegalArgumentException("Word and its translations cannot be null or empty!");
        }
        for (Word w : words) {
            if (w.getEnglish().equalsIgnoreCase(word.getEnglish())) {
                throw new IllegalArgumentException("Word already exists!");
            }
        }
        words.add(word);
        saveDictionary();
    }

    public boolean removeWord(String word) {
        if (word == null || word.trim().isEmpty()) {
            throw new IllegalArgumentException("Word cannot be null or empty!");
        }
        Scanner scanner = new Scanner(System.in);
        Iterator<Word> iterator = words.iterator();
        while (iterator.hasNext()) {
            Word currentWord = iterator.next();
            if (currentWord.getEnglish().equalsIgnoreCase(word)) {
                System.out.println("Do you want to remove this word? (Y/N)");
                String confirm = scanner.nextLine().trim();
                if (confirm.equalsIgnoreCase("Y")) {
                    iterator.remove();
                    saveDictionary();
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean updateWord(int id, String english, String vietnamese) {
        if (id <= 0 || english == null || english.trim().isEmpty() || vietnamese == null || vietnamese.trim().isEmpty()) {
            throw new IllegalArgumentException("Word ID and its translations cannot be null or empty!");
        }
        for (Word word : words) {
            if (word.getId() == id) {
                word.setEnglish(english);
                word.setVietnamese(vietnamese);
                word.setPartOfSpeech(word.getPartOfSpeech());
                saveDictionary();
                return true;
            }
        }
        return false;
    }

    public void displayAllWords() {
        for (Word word : words) {
            System.out.println(word.getEnglish() + " (" + word.getPartOfSpeech() + "): " + word.getVietnamese());
        }
    }

    public List<Word> getAllWords() {
        return words;
    }

    public List<Word> searchWord(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return new ArrayList<>();
        }
        List<Word> result = new ArrayList<>();
        String lowerCaseKeyword = keyword.toLowerCase();
        for (Word word : words) {
            if (word.getEnglish().toLowerCase().startsWith(lowerCaseKeyword) ||
                    word.getVietnamese().toLowerCase().startsWith(lowerCaseKeyword)) {
                result.add(word);
            }
        }
        return result;
    }

    public void loadDictionary() {
        File file = new File(DICTIONARY_FILE);
        if (!file.exists()) {
            words = new ArrayList<>();
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DICTIONARY_FILE))) {
            words = (List<Word>) ois.readObject();
        } catch (IOException e) {
            System.err.println("Error reading dictionary file: " + e.getMessage());
            words = new ArrayList<>();
        } catch (ClassNotFoundException e) {
            System.err.println("Error deserializing dictionary: " + e.getMessage());
            words = new ArrayList<>();
        }
    }

    public void saveDictionary() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DICTIONARY_FILE))) {
            oos.writeObject(words);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Word findWordByEnglish(String english) {
        return words.stream()
                .filter(w -> w.getEnglish().equalsIgnoreCase(english))
                .findFirst()
                .orElse(null);
    }
}
