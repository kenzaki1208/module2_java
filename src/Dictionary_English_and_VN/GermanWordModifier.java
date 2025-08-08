package Dictionary_English_and_VN;

public abstract class GermanWordModifier {
    protected DictionaryVnAndGerman dictionary;

    public GermanWordModifier(DictionaryVnAndGerman dictionary) {
        this.dictionary = dictionary;
    }

    public abstract void modifyGermanWord(GermanWord germanWord);

    public void executeGerman(String german) {
        GermanWord germanWord = dictionary.findWordByGerman(german);
        if (germanWord == null) {
            System.out.println("Not found word: " + german);
            return;
        }
        modifyGermanWord(germanWord);
        dictionary.saveDict();
        System.out.println("Updated successfully!");
    }
}
