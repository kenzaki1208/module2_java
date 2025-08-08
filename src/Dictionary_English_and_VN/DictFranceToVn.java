package Dictionary_English_and_VN;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DictFranceToVn {
    private static final String DICT_FRANCE_VN = "src/Dictionary_English_and_VN/dictFraToVn.txt";

    public List<FranceWord> franceWordList;

    public DictFranceToVn () {
        this.franceWordList = new ArrayList<>();
        loadFile();
    }

    public void addFranceWord(FranceWord FranceWord) {
        if (FranceWord == null || FranceWord.getFrance() == null || FranceWord.getVietnamese() == null ||
                FranceWord.getFrance().trim().isEmpty() || FranceWord.getVietnamese().trim().isEmpty()) {
            throw new IllegalArgumentException("Word and its translations cannot be null or empty!");
        }

        for (FranceWord FranceW : franceWordList) {
            if (FranceW.getFrance().equalsIgnoreCase(FranceWord.getFrance())) {
                throw new IllegalArgumentException("Word already exists!");
            }
        }

        franceWordList.add(FranceWord);
        saveFile();
    }

    public boolean deleteWord(String word) {
        if (word == null || word.trim().isEmpty()) {
            throw new IllegalArgumentException("Word cannot be null or empty!");
        }

        Scanner scanner = new Scanner(System.in);
        Iterator<FranceWord> iterator = franceWordList.iterator();

        while (iterator.hasNext()) {
            FranceWord currentWord = iterator.next();

            if (currentWord.getFrance().equalsIgnoreCase(word)) {
                System.out.println("Do you want to remove this word ?");
                String confirm = scanner.nextLine().trim();

                if (confirm.equalsIgnoreCase("Y")) {
                    iterator.remove();
                    saveFile();
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean update(int id, String france, String vietnamese) {
        if (id <= 0 || france == null || france.trim().isEmpty() ||
                vietnamese == null || vietnamese.trim().isEmpty()) {
            throw new IllegalArgumentException("Word ID and its translations cannot be null or empty!");
        }

        for (FranceWord franceWord : franceWordList) {
            if (franceWord.getId() == id) {
                franceWord.setFrance(france);
                franceWord.setVietnamese(vietnamese);
                franceWord.setPartOfSpeech(franceWord.getPartOfSpeech());
                saveFile();
                return true;
            }
        }

        return false;
    }

    public void displayAll() {
        for (FranceWord franceWord : franceWordList) {
            System.out.println(franceWord.getFrance() + " (" + franceWord.getPartOfSpeech() + "): " + franceWord.getVietnamese());
        }
    }

    public List<FranceWord> getAll() {
        return franceWordList;
    }

    public List<FranceWord> search(String keyWord) {
        if (keyWord == null || keyWord.trim().isEmpty()) {
            return new ArrayList<>();
        }

        List<FranceWord> result = new ArrayList<>();
        String lowerCase = keyWord.toLowerCase();

        for (FranceWord franceWord : franceWordList) {
            if (franceWord.getFrance().toLowerCase().startsWith(lowerCase) ||
                    franceWord.getVietnamese().toLowerCase().startsWith(lowerCase)) {
                result.add(franceWord);
            }
        }

        return result;
    }

    public void loadFile() {
        File file = new File(DICT_FRANCE_VN);

        if (!file.exists()) {
            franceWordList = new ArrayList<>();
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DICT_FRANCE_VN))) {
            franceWordList = (List<FranceWord>) ois.readObject();
        } catch (IOException e) {
            System.err.println("Error reading dictionary file: " + e.getMessage());
            franceWordList = new ArrayList<>();
        } catch (ClassNotFoundException e) {
            System.err.println("Error deserializing dictionary: " + e.getMessage());
            franceWordList = new ArrayList<>();
        }
    }

    public void saveFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DICT_FRANCE_VN))) {
            oos.writeObject(franceWordList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public FranceWord findWordByFrance(String france) {
        return franceWordList.stream()
                .filter(w -> w.getFrance().equalsIgnoreCase(france))
                .findFirst()
                .orElse(null);
    }
}
