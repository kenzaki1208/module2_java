package Dictionary_English_and_VN;

import java.io.Serializable;
import java.util.List;

public class FranceWord extends Word implements Serializable {
    private static final long serialVersionUID = 1L;

    private String france;
    private List<String> franceSynonyms;

    public FranceWord() {}

    public FranceWord(int id, String frace, String vietnamese, String partOfSpeech) {
        super(id, vietnamese, partOfSpeech);
        this.france = frace;
    }

    public String getFrance() {
        return france;
    }

    public void setFrance(String france) {
        this.france = france;
    }

    public List<String> getFranceSynonyms() {
        return franceSynonyms;
    }

    public void setFranceSynonyms(List<String> franceSynonyms) {
        this.franceSynonyms = franceSynonyms;
    }

    @Override
    public String toString() {
        return "Word { id: " + getId() + ", france: " + france + ", vietnamese: " + getVietnamese() +
                ", synonyms: " + franceSynonyms + " } ";
    }
}
