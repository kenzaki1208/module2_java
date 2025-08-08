package Dictionary_English_and_VN;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DictionaryVnAndGerman {
    private static final String DICT_VN_GM = "src/Dictionary_English_and_VN/dictionaryVN&German.txt";

    private List<GermanWord> germanWordList;

    public DictionaryVnAndGerman() {
        this.germanWordList = new ArrayList<>();
        loadDict();
    }

    public void addGermanWord(GermanWord germanWord) {
        if (germanWord == null || germanWord.getGerman() == null || germanWord.getVietnamese() == null ||
                germanWord.getGerman().trim().isEmpty() || germanWord.getVietnamese().trim().isEmpty()) {
            throw new IllegalArgumentException("Word and its translations cannot be null or empty!");
        }

        for (GermanWord gerW : germanWordList) {
            if (gerW.getGerman().equalsIgnoreCase(germanWord.getGerman())) {
                throw new IllegalArgumentException("Word already exists!");
            }
        }

        germanWordList.add(germanWord);
        saveDict();
    }

    public boolean deleteWord(String word) {
        if (word == null || word.trim().isEmpty()) {
            throw new IllegalArgumentException("Word cannot be null or empty!");
        }

        Scanner scanner = new Scanner(System.in);
        Iterator<GermanWord> iterator = germanWordList.iterator();

        while (iterator.hasNext()) {
            GermanWord currentWord = iterator.next();

            if (currentWord.getGerman().equalsIgnoreCase(word)) {
                System.out.println("Do you want to remove this word ?");
                String confirm = scanner.nextLine().trim();

                if (confirm.equalsIgnoreCase("Y")) {
                    iterator.remove();
                    saveDict();
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean update(int id, String german, String vietnamese) {
        if (id <= 0 || german == null || german.trim().isEmpty() || vietnamese == null || vietnamese.trim().isEmpty()) {
            throw new IllegalArgumentException("Word ID and its translations cannot be null or empty!");
        }

        for (GermanWord germanWord : germanWordList) {
            if (germanWord.getId() == id) {
                germanWord.setGerman(german);
                germanWord.setVietnamese(vietnamese);
                germanWord.setPartOfSpeech(germanWord.getPartOfSpeech());
                saveDict();
                return true;
            }
        }

        return false;
    }

    public void displayAll() {
        for (GermanWord germanWord : germanWordList) {
            System.out.println(germanWord.getGerman() + " (" + germanWord.getPartOfSpeech() + "): " + germanWord.getVietnamese());
        }
    }

    public List<GermanWord> getAll() {
        return germanWordList;
    }

    public List<GermanWord> search(String keyWord) {
        if (keyWord == null || keyWord.trim().isEmpty()) {
            return new ArrayList<>();
        }

        List<GermanWord> result = new ArrayList<>();
        String lowerCase = keyWord.toLowerCase();

        for (GermanWord germanWord : germanWordList) {
            if (germanWord.getGerman().toLowerCase().startsWith(lowerCase) ||
                germanWord.getVietnamese().toLowerCase().startsWith(lowerCase)) {
                result.add(germanWord);
            }
        }

        return result;
    }

    public void loadDict() {
        File file = new File(DICT_VN_GM);

        if (!file.exists()) {
            germanWordList = new ArrayList<>();
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DICT_VN_GM))) {
            germanWordList = (List<GermanWord>) ois.readObject();
        } catch (IOException e) {
            System.err.println("Error reading dictionary file: " + e.getMessage());
            germanWordList = new ArrayList<>();
        } catch (ClassNotFoundException e) {
            System.err.println("Error deserializing dictionary: " + e.getMessage());
            germanWordList = new ArrayList<>();
        }
    }

    public void saveDict() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DICT_VN_GM))) {
            oos.writeObject(germanWordList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public GermanWord findWordByGerman(String german) {
        return germanWordList.stream()
                .filter(w -> w.getGerman().equalsIgnoreCase(german))
                .findFirst()
                .orElse(null);
    }
}
