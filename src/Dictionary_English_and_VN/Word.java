package Dictionary_English_and_VN;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Word implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String english;
    private String vietnamese;
    private String partOfSpeech;
    private List<String> synonyms = new ArrayList<>();

    public Word() {}

    public Word(int id, String english, String vietnamese, String partOfSpeech) {
        this.id = id;
        this.english = english;
        this.vietnamese = vietnamese;
        this.partOfSpeech = partOfSpeech;
    }

    public Word(int id, String vietnamese, String partOfSpeech) {
        this.id = id;
        this.vietnamese = vietnamese;
        this.partOfSpeech = partOfSpeech;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getVietnamese() {
        return vietnamese;
    }

    public void setVietnamese(String vietnamese) {
        this.vietnamese = vietnamese;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public List<String> getSynonyms() {
        if (synonyms == null) synonyms = new ArrayList<>();
        return synonyms;
    }

    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    @Override
    public String toString() {
        return "Word { id: " + id + ", english: " + english +
                ", vietnamese: " + vietnamese + ", partOfSpeech: " + partOfSpeech +
                ", synonyms: " + synonyms + " }";
    }
}
