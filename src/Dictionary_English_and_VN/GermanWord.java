package Dictionary_English_and_VN;

import java.io.Serializable;
import java.util.List;

public class GermanWord extends Word implements Serializable {
    private static final long serialVersionUID = 1L;

    private String german;
    private List<String> germanSynonyms;

    public GermanWord() {}

    public GermanWord(int id, String german, String vietnamese, String partOfSpeech) {
        super(id, vietnamese, partOfSpeech);
        this.german = german;
    }

    public String getGerman() {
        return german;
    }

    public void setGerman(String german) {
        this.german = german;
    }

    public List<String> getGermanSynonyms() {
        return germanSynonyms;
    }

    public void setGermanSynonyms(List<String> germanSynonyms) {
        this.germanSynonyms = germanSynonyms;
    }

    @Override
    public String toString() {
        return "Word { id: " + getId() + ", german: " + german +
                ", vietnamese: " + getVietnamese() + ", synonyms: " + germanSynonyms + " } ";
    }
}
